package com.jason.design.pattern.behavioral.visitor;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 1:19 上午
 */
public abstract class Course {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void accept(IVisitor visitor);
}
