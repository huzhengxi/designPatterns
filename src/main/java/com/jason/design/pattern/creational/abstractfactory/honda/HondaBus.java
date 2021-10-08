package com.jason.design.pattern.creational.abstractfactory.honda;

import com.jason.design.pattern.creational.abstractfactory.intercace.IBus;

public class HondaBus implements IBus {

  @Override
  public void produce() {
    System.out.println("生产本田商务车");
  }
}
