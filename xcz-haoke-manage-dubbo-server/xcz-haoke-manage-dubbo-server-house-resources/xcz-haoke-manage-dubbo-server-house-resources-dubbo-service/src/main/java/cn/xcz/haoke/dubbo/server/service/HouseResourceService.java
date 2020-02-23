package cn.xcz.haoke.dubbo.server.service;

import cn.xcz.haoke.dubbo.server.pojo.HouseResources;

public interface HouseResourceService {
    int saveHouseResources(HouseResources houseResources);

    /**
     * 根据房源 id 查询房源数据
     * @param id
     * @return
     */
    HouseResources queryHouseResourceByid(Long id);
}
