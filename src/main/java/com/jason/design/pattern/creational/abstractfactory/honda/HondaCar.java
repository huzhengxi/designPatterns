package com.jason.design.pattern.creational.abstractfactory.honda;

import com.jason.design.pattern.creational.abstractfactory.intercace.ICar;

public class HondaCar implements ICar {
  @Override
  public void produce() {
    System.out.println("生产本田小轿车");
  }
}
