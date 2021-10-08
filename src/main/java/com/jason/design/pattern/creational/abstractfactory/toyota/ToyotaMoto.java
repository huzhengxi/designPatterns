package com.jason.design.pattern.creational.abstractfactory.toyota;

import com.jason.design.pattern.creational.abstractfactory.intercace.IMotorbike;

public class ToyotaMoto implements IMotorbike {
  @Override
  public void produce() {
    System.out.println("生产丰田摩托车");
  }
}
