package models;

import java.util.Date;
import java.util.List;

public class CouponB extends Coupon{
  List<String> services;

  CouponB(int id, Date createDate, Date endDate, List<String> services) {
    super(id, createDate, endDate);
    this.services = services;
  }

  List<String> getServices() {
    return services;
  }

  void setServices(List<String> services) {
    this.services = services;
  }

}
