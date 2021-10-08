package com.jason.design.pattern.creational.abstractfactory.toyota;

import com.jason.design.pattern.creational.abstractfactory.intercace.ICar;

public class ToyotaCar implements ICar {
  @Override
  public void produce() {
    System.out.println("成产丰田小轿车");
  }
}
