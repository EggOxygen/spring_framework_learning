package egg.lab.learning.entity;


public class SysPermission {

  private Long id;
  private Long parentId;
  private String name;
  private String css;
  private String href;
  private Long type;
  private String permission;
  private Long sort;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  public Long getSort() {
    return sort;
  }

  public void setSort(Long sort) {
    this.sort = sort;
  }

}
