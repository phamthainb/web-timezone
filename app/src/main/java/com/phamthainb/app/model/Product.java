package com.phamthainb.app.model;

public class Product {
  private Integer id;
  private String name;
  private String desc;
  private Integer price;
  private Integer votes;
  private Object images;

  public Product() {

  }

  public Product(String name, String desc) {
    this.name = name;
    this.name = desc;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDesc() {
    return desc;
  }

  public Object getImages() {
    return images;
  }

  public Integer getPrice() {
    return price;
  }

  public Integer getVotes() {
    return votes;
  }

  @Override
  public String toString() {

    return "Sản phẩm: " + name + " ," + price;
  }
}
