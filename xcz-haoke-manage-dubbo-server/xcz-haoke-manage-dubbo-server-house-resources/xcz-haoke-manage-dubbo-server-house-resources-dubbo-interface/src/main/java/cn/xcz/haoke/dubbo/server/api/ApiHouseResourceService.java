package cn.xcz.haoke.dubbo.server.api;

import cn.xcz.haoke.dubbo.server.pojo.HouseResources;

/**
 * @return -1:输入的参数不符合要求，0：插入数据库失败；1：成功
 */
public interface ApiHouseResourceService {
    int saveHouseResource(HouseResources houseResources);


    /**
     * 根据 id查询房源数据
     * @param id
     * @return
     */
    HouseResources queryHouseResourceByid(Long id);
}
