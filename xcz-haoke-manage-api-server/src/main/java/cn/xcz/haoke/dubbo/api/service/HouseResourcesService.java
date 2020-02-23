package cn.xcz.haoke.dubbo.api.service;

import cn.xcz.haoke.dubbo.server.api.ApiHouseResourceService;
import cn.xcz.haoke.dubbo.server.pojo.HouseResources;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class HouseResourcesService {

    @Reference(version = "1.0.0")
    private ApiHouseResourceService apiHouseResourceService;

    public boolean save(HouseResources houseResources){
        int result=this.apiHouseResourceService.saveHouseResource(houseResources);
        return result==1;
    }

    public HouseResources queryHouseResourceByid(Long id){
        HouseResources houseResources = this.apiHouseResourceService.queryHouseResourceByid(id);
        return houseResources;
    }
}
