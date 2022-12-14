package Entities;

import java.util.List;


public class Product {
  int id;
  String name;
  String price;
  String portfolio;
  List<String> couponIdList;

  public Product(int id, String name, String price, String portfolio, List<String> coupon) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.portfolio = portfolio;
    this.couponIdList = coupon;
  }

  public Product() {
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(String portfolio) {
    this.portfolio = portfolio;
  }

  public List<String> getCoupon() {
    return couponIdList;
  }

  public void setCoupon(List<String> coupon) {
    this.couponIdList = coupon;
  }

  public int getId() {
    return id;
  }

  public  void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
