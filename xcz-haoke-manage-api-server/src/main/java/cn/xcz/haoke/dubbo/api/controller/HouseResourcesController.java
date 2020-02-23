package cn.xcz.haoke.dubbo.api.controller;
import cn.xcz.haoke.dubbo.api.service.HouseResourcesService;
import cn.xcz.haoke.dubbo.server.pojo.HouseResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class HouseResourcesController {

    @Autowired
    private HouseResourcesService houseResourcesService;

    /**
     *
     * @param houseResources requestbody注解是为了接受json数据，反序列化得到一个对象
     * @return
     */
    @PostMapping
    @ResponseBody
    @RequestMapping("house/resources")
    public ResponseEntity<Void> save(@RequestBody HouseResources houseResources){
        try {
            boolean bool=this.houseResourcesService.save(houseResources);
            if(bool){
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PostMapping
    @ResponseBody
    @RequestMapping("house/query")
    public HouseResources query(@RequestBody Long id){
        try {
            HouseResources houseResources=this.houseResourcesService.queryHouseResourceByid(id);
            if(houseResources!=null){
                return houseResources;
            }else
                return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseResourcesService.queryHouseResourceByid(id);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<String> get(){

        return ResponseEntity.ok("ok");
    }
}
