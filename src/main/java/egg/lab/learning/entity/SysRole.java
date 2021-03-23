package egg.lab.learning.entity;


public class SysRole {

  private Long id;
  private String name;
  private String description;
  private java.sql.Date createTime;
  private java.sql.Date updateTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public java.sql.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Date updateTime) {
    this.updateTime = updateTime;
  }

}
