package egg.lab.learning.entity;

import com.baomidou.mybatisplus.annotation.TableId;

public class SysReport {

  @TableId
  private Long id;
  // FIXME: 数据库驼峰与下划线混用?
  private java.sql.Date createTime;
  private Long userId;
  private String remark;
  private String temperature;
  private Long travel;
  private String travelDescription;
  private String physicalCondition;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }


  public Long getTravel() {
    return travel;
  }

  public void setTravel(Long travel) {
    this.travel = travel;
  }


  public String getTravelDescription() {
    return travelDescription;
  }

  public void setTravelDescription(String travelDescription) {
    this.travelDescription = travelDescription;
  }


  public String getPhysicalCondition() {
    return physicalCondition;
  }

  public void setPhysicalCondition(String physicalCondition) {
    this.physicalCondition = physicalCondition;
  }

}
