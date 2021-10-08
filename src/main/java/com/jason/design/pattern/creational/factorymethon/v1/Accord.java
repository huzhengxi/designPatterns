package com.jason.design.pattern.creational.factorymethon.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:41 上午
 */
public class Accord implements Car {

  @Override
  public void produce() {
    System.out.println("生产本田雅阁");
  }
}
