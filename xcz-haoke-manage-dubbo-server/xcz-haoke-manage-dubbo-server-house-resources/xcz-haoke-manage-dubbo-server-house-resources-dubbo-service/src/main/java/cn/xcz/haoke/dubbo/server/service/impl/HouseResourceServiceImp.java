package cn.xcz.haoke.dubbo.server.service.impl;

import cn.xcz.haoke.dubbo.server.pojo.HouseResources;
import cn.xcz.haoke.dubbo.server.service.HouseResourceService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class HouseResourceServiceImp extends BasicServiceImpl<HouseResources> implements HouseResourceService {

    @Override
    public int saveHouseResources(HouseResources houseResources) {
        //添加校验或者是其他的一些逻辑
        if(StringUtils.isBlank(houseResources.getTitle()))
            return -1;
        return super.save(houseResources);
    }

    @Override
    public HouseResources queryHouseResourceByid(Long id) {
        return super.queryById(id);
    }
}
