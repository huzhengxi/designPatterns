package com.jason.design.pattern.creational.factorymethon.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:45 上午
 */
public class Test {

  public static void main(String[] args) {
    CarFactory factory = new AccordFactory();
    Car car = factory.getCar();
    car.produce();  // 生产本田雅阁

    CarFactory nioES8Factory = new NioES8Factory();
    Car es8 = nioES8Factory.getCar();
    es8.produce();
  }
}
