package com.jason.design.pattern.creational.abstractfactory.toyota;

import com.jason.design.pattern.creational.abstractfactory.intercace.IBus;

public class ToyotaBus implements IBus {
  @Override
  public void produce() {
    System.out.println("生产丰田商务车");
  }
}
