//package cn.xcz.haoke.dubbo.server.house_resources.entity;
//
//import java.time.LocalDateTime;
//import com.baomidou.ant.common.BaseController;
//
///**
// * <p>
// * 房源表
// * </p>
// *
// * @author xcz
// * @since 2020-02-18
// */
//
//
//public class TbHouseResources extends BaseController {
//
//    private static final long serialVersionUID = 1L;
//
//    /**
//     * 房源标题
//     */
//    private String title;
//
//    /**
//     * 楼盘id
//     */
//    private Long estateId;
//
//    /**
//     * 楼号（栋）
//     */
//    private String buildingNum;
//
//    /**
//     * 单元号
//     */
//    private String buildingUnit;
//
//    /**
//     * 门牌号
//     */
//    private String buildingFloorNum;
//
//    /**
//     * 租金
//     */
//    private Integer rent;
//
//    /**
//     * 租赁方式，1-整租，2-合租
//     */
//    private Boolean rentMethod;
//
//    /**
//     * 支付方式，1-付一押一，2-付三押一，3付六押一，4-年付押一，5-其它
//     */
//    private Boolean paymentMethod;
//
//    /**
//     * 户型，如：2室1厅1卫
//     */
//    private String houseType;
//
//    /**
//     * 建筑面积
//     */
//    private String coveredArea;
//
//    /**
//     * 使用面积
//     */
//    private String useArea;
//
//    /**
//     * 楼层，如：8/26
//     */
//    private String floor;
//
//    /**
//     * 朝向：东、南、西、北
//     */
//    private String orientation;
//
//    /**
//     * 装修，1-精装，2-简装，3-毛坯
//     */
//    private Boolean decoration;
//
//    /**
//     * 配套设施， 如：1,2,3
//     */
//    private String facilities;
//
//    /**
//     * 图片，最多5张
//     */
//    private String pic;
//
//    /**
//     * 描述
//     */
//    private String houseDesc;
//
//    /**
//     * 联系人
//     */
//    private String contact;
//
//    /**
//     * 手机号
//     */
//    private String mobile;
//
//    /**
//     * 看房时间，1-上午，2-中午，3-下午，4-晚上，5-全 天
//     */
//    private Boolean time;
//
//    /**
//     * 物业费
//     */
//    private String propertyCost;
//
//    private LocalDateTime created;
//
//    private LocalDateTime updated;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public Long getEstateId() {
//        return estateId;
//    }
//
//    public void setEstateId(Long estateId) {
//        this.estateId = estateId;
//    }
//    public String getBuildingNum() {
//        return buildingNum;
//    }
//
//    public void setBuildingNum(String buildingNum) {
//        this.buildingNum = buildingNum;
//    }
//    public String getBuildingUnit() {
//        return buildingUnit;
//    }
//
//    public void setBuildingUnit(String buildingUnit) {
//        this.buildingUnit = buildingUnit;
//    }
//    public String getBuildingFloorNum() {
//        return buildingFloorNum;
//    }
//
//    public void setBuildingFloorNum(String buildingFloorNum) {
//        this.buildingFloorNum = buildingFloorNum;
//    }
//    public Integer getRent() {
//        return rent;
//    }
//
//    public void setRent(Integer rent) {
//        this.rent = rent;
//    }
//    public Boolean getRentMethod() {
//        return rentMethod;
//    }
//
//    public void setRentMethod(Boolean rentMethod) {
//        this.rentMethod = rentMethod;
//    }
//    public Boolean getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(Boolean paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//    public String getHouseType() {
//        return houseType;
//    }
//
//    public void setHouseType(String houseType) {
//        this.houseType = houseType;
//    }
//    public String getCoveredArea() {
//        return coveredArea;
//    }
//
//    public void setCoveredArea(String coveredArea) {
//        this.coveredArea = coveredArea;
//    }
//    public String getUseArea() {
//        return useArea;
//    }
//
//    public void setUseArea(String useArea) {
//        this.useArea = useArea;
//    }
//    public String getFloor() {
//        return floor;
//    }
//
//    public void setFloor(String floor) {
//        this.floor = floor;
//    }
//    public String getOrientation() {
//        return orientation;
//    }
//
//    public void setOrientation(String orientation) {
//        this.orientation = orientation;
//    }
//    public Boolean getDecoration() {
//        return decoration;
//    }
//
//    public void setDecoration(Boolean decoration) {
//        this.decoration = decoration;
//    }
//    public String getFacilities() {
//        return facilities;
//    }
//
//    public void setFacilities(String facilities) {
//        this.facilities = facilities;
//    }
//    public String getPic() {
//        return pic;
//    }
//
//    public void setPic(String pic) {
//        this.pic = pic;
//    }
//    public String getHouseDesc() {
//        return houseDesc;
//    }
//
//    public void setHouseDesc(String houseDesc) {
//        this.houseDesc = houseDesc;
//    }
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//    public Boolean getTime() {
//        return time;
//    }
//
//    public void setTime(Boolean time) {
//        this.time = time;
//    }
//    public String getPropertyCost() {
//        return propertyCost;
//    }
//
//    public void setPropertyCost(String propertyCost) {
//        this.propertyCost = propertyCost;
//    }
//    public LocalDateTime getCreated() {
//        return created;
//    }
//
//    public void setCreated(LocalDateTime created) {
//        this.created = created;
//    }
//    public LocalDateTime getUpdated() {
//        return updated;
//    }
//
//    public void setUpdated(LocalDateTime updated) {
//        this.updated = updated;
//    }
//
//    @Override
//    public String toString() {
//        return "TbHouseResources{" +
//        "title=" + title +
//        ", estateId=" + estateId +
//        ", buildingNum=" + buildingNum +
//        ", buildingUnit=" + buildingUnit +
//        ", buildingFloorNum=" + buildingFloorNum +
//        ", rent=" + rent +
//        ", rentMethod=" + rentMethod +
//        ", paymentMethod=" + paymentMethod +
//        ", houseType=" + houseType +
//        ", coveredArea=" + coveredArea +
//        ", useArea=" + useArea +
//        ", floor=" + floor +
//        ", orientation=" + orientation +
//        ", decoration=" + decoration +
//        ", facilities=" + facilities +
//        ", pic=" + pic +
//        ", houseDesc=" + houseDesc +
//        ", contact=" + contact +
//        ", mobile=" + mobile +
//        ", time=" + time +
//        ", propertyCost=" + propertyCost +
//        ", created=" + created +
//        ", updated=" + updated +
//        "}";
//    }
//}
