package com.jason.design.pattern.behavioral.visitor;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 1:22 上午
 */
public class FreeCourse extends Course {

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
  }
}
