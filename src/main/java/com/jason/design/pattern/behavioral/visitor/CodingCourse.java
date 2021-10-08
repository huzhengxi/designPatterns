package com.jason.design.pattern.behavioral.visitor;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 1:21 上午
 */
public class CodingCourse extends Course {

  private int price;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
  }
}
