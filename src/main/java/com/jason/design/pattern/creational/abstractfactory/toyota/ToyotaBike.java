package com.jason.design.pattern.creational.abstractfactory.toyota;

import com.jason.design.pattern.creational.abstractfactory.intercace.IBicycle;

public class ToyotaBike implements IBicycle {

  @Override
  public void produce() {
    System.out.println("生产丰田自行车");
  }
}
