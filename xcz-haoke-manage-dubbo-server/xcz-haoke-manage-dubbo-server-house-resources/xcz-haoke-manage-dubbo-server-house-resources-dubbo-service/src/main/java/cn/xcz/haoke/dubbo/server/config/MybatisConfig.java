package cn.xcz.haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("cn.xcz.haoke.dubbo.server.mapper")  //进行对MyBatis的Mapper interfaces进行注册
// 至此，我们的Mapper interfaces就会通过spring的factory模式注册。
// 所以我们定义的各个xxxMapper.java接口类就可以通过@Autowired注入使用。
@Configuration
public class MybatisConfig {
}
