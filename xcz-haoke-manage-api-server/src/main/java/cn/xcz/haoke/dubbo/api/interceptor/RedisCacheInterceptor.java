package cn.xcz.haoke.dubbo.api.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DigestUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

@Component
public class RedisCacheInterceptor implements HandlerInterceptor {


    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private static ObjectMapper mapper = new ObjectMapper();


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            // 非get请求，如果不是graphql请求，放行
       // if(request.getMethod().equals("post")){
//        if(!StringUtils.equalsIgnoreCase(request.getRequestURI(), "/house/query/")){
//                return true;
//        }
        String data = this.redisTemplate.opsForValue().get(createRedisKey(request));
        if (StringUtils.isEmpty(data)) { //
            // 缓存未命中
            return true;
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(data);
        return false;
    }

    public static String createRedisKey(HttpServletRequest request) throws Exception {
        String paramStr = request.getServletPath();
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder("");
        try
        {
            br = request.getReader();
            String str;
            while ((str = br.readLine()) != null)
            {
                sb.append(str);
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String id = sb.toString();
     //   Map<String, String[]> parameterMap = request.getParameterMap();
       // if (!parameterMap.isEmpty())
        //paramStr += mapper.writeValueAsString(request.getParameterMap());
        paramStr += id;
        String redisKey = "WEB_DATA_" + DigestUtils.sha1DigestAsHex(paramStr);

        return redisKey;
    }
}
