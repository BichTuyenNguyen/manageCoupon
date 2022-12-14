package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name= "Product")
public class Product {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy= GenerationType.AUTO)
  int id;

  @Column(name = "name")
  String name;

  @Column(name = "price")
  String price;

  @Column(name = "portfolio")
  String portfolio;

  @Column(name = "coupon")
  List<Coupon> coupon;

  public Product(String name, String price, String portfolio, List<Coupon> coupon) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.portfolio = portfolio;
    this.coupon = coupon;
  }

  public Product() {
  }

  String getPrice() {
    return price;
  }

  void setPrice(String price) {
    this.price = price;
  }

  String getPortfolio() {
    return portfolio;
  }

  void setPortfolio(String portfolio) {
    this.portfolio = portfolio;
  }

  List<Coupon> getCoupon() {
    return coupon;
  }

  void setCoupon(List<Coupon> coupon) {
    this.coupon = coupon;
  }

  int getId() {
    return id;
  }

  void setId(int id) {
    this.id = id;
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  public Product insert(Product product){

    return product;
  }
}
