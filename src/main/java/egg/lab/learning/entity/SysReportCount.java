package egg.lab.learning.entity;


public class SysReportCount {

  private Long id;
  private String name;
  private String value;
  private String type;
  private java.sql.Date createTime;
  private String reportDate;


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


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public String getReportDate() {
    return reportDate;
  }

  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }

}
