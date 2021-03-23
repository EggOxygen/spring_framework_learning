package egg.lab.learning.entity;


public class SysUser {

  private Long id;
  private String username;
  private String password;
  private String nickname;
  private String headImgUrl;
  private String phone;
  private String telephone;
  private String email;
  private java.sql.Date birthday;
  private Long sex;
  private Long status;
  private java.sql.Date createTime;
  private java.sql.Date updateTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getHeadImgUrl() {
    return headImgUrl;
  }

  public void setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public Long getSex() {
    return sex;
  }

  public void setSex(Long sex) {
    this.sex = sex;
  }


  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
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
