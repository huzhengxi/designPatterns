package com.jason.design.pattern.creational.prototype;

import java.util.Date;

/**
 * @author Tiger.HU
 * @date 2021年09月25日 11:53 下午
 */
public class Test {

  public static void main(String[] args) throws CloneNotSupportedException {
    Pig pig = new Pig("佩奇", new Date(0L));
    Pig pig1 = (Pig) pig.clone();
    pig1.getBirthday().setTime(12222L);
    System.out.println(pig);
    System.out.println(pig1);
  }

}
