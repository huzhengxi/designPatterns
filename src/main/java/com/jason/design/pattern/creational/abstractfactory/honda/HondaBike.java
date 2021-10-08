package com.jason.design.pattern.creational.abstractfactory.honda;

import com.jason.design.pattern.creational.abstractfactory.intercace.IBicycle;

public class HondaBike implements IBicycle {
  @Override
  public void produce() {
    System.out.println("生产本田自行车");
  }
}
