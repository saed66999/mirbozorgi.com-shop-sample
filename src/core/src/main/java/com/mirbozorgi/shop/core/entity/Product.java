package com.mirbozorgi.shop.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "price")
  private String price;

  @Column(name = "currency")
  private String currency;

  @Column(name = "product_image_url")
  private String productImageUrl;

  @Column(name = "sum_of_rates")
  private long sumOfRates;

  public Product() {
  }

  public Product(
      String name,
      String price,
      String currency,
      String productImageUrl) {
    this.name = name;
    this.price = price;
    this.currency = currency;
    this.productImageUrl = productImageUrl;
    this.sumOfRates = 0;
  }

  public int getId() {
    return id;
  }

  public String getPrice() {
    return price;
  }

  public String getCurrency() {
    return currency;
  }

  public String getProductImageUrl() {
    return productImageUrl;
  }

  public long getSumOfRates() {
    return sumOfRates;
  }

  public String getName() {
    return name;
  }
}
