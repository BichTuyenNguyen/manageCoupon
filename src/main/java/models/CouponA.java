package models;

import java.util.Date;

public class CouponA extends Coupon{
  //id:  A01, A02
  Double discount;

  CouponA(int id, Date createDate, Date endDate, Double discount) {
    super(id, createDate, endDate);
    this.discount = discount;
  }

  Double getDiscount() {
    return discount;
  }

  void setDiscount(Double discount) {
    this.discount = discount;
  }




}
