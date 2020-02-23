package cn.xcz.haoke.dubbo.server.api;

import cn.xcz.haoke.dubbo.server.pojo.HouseResources;
import cn.xcz.haoke.dubbo.server.service.HouseResourceService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

//有一种 service 层的感觉嗷
@Service(version = "1.0.0")
public class ApiHouseResourcesServiceImpl implements ApiHouseResourceService {

    @Autowired
    private HouseResourceService houseResourceService;

    @Override
    public int saveHouseResource(HouseResources houseResources) {
        return this.houseResourceService.saveHouseResources(houseResources);
    }

    @Override
    public HouseResources queryHouseResourceByid(Long id) {
        return this.houseResourceService.queryHouseResourceByid(id);
    }
}
