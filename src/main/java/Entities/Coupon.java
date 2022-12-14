package Entities;

import java.util.Date;


public class Coupon {
  int id;
  Date createDate;
  Date endDate;

  public Coupon(int id, Date createDate, Date endDate) {
    this.createDate = createDate;
    this.endDate = endDate;
  }

  public Coupon() {
  }

  int getId() {
    return id;
  }

  void setId(int id) {
    this.id = id;
  }

  Date getCreateDate() {
    return createDate;
  }

  void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  Date getEndDate() {
    return endDate;
  }

  void setEndDate(Date endDate) {
    this.endDate = endDate;
  }



}
