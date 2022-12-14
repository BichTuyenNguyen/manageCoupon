package Entities;

import java.util.Date;
import java.util.List;

public class CouponC extends Coupon{
  Double discount;
  List<String> services;

  CouponC(int id, Date createDate, Date endDate, Double discount, List<String> services) {
    super(id, createDate, endDate);
    this.discount = discount;
    this.services = services;
  }

  Double getDiscount() {
    return discount;
  }

  void setDiscount(Double discount) {
    this.discount = discount;
  }

  List<String> getServices() {
    return services;
  }

  void setServices(List<String> services) {
    this.services = services;
  }

}
