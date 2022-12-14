package Entities;

import java.util.Date;


public class CouponA extends Coupon {

  Double discount;

  public CouponA() {}

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
