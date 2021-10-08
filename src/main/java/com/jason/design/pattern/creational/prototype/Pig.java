package com.jason.design.pattern.creational.prototype;

import java.util.Date;

/**
 * @author Tiger.HU
 * @date 2021年09月25日 11:22 下午
 */
public class Pig implements Cloneable {

  private String name;
  private Date birthday;

  Pig() {
    System.out.println("Pig constructor");
  }

  public Pig(String name, Date birthday) {
    System.out.println("Pig constructor1");
    this.name = name;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "Pig{" +
        "name='" + name + '\'' +
        ", birthday=" + birthday +
        '}' + super.toString();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    System.out.println("clone");
    Pig pig = (Pig) super.clone();
    pig.setBirthday((Date) pig.getBirthday().clone());
    return pig;
  }
}
