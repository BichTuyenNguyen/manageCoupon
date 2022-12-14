package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name= "Coupon")
public class Coupon {
  int id;
  Date createDate;
  Date endDate;

  Coupon(int id, Date createDate, Date endDate) {
    this.id = id;
    this.createDate = createDate;
    this.endDate = endDate;
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
