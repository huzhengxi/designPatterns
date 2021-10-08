package com.jason.design.pattern.creational.abstractfactory;

import com.jason.design.pattern.creational.abstractfactory.honda.HondaFactory;
import com.jason.design.pattern.creational.abstractfactory.intercace.IBicycle;
import com.jason.design.pattern.creational.abstractfactory.intercace.IBus;
import com.jason.design.pattern.creational.abstractfactory.intercace.ICar;
import com.jason.design.pattern.creational.abstractfactory.intercace.IMotorbike;

public class Test {

  public static void main(String[] args) {
    HondaFactory hondaFactory = new HondaFactory();
    ICar car = hondaFactory.getCar();
    IBus bus = hondaFactory.getBus();
    IBicycle bicycle = hondaFactory.getBicycle();
    IMotorbike motorbike = hondaFactory.getMotorbike();

    car.produce();
    bus.produce();
    bicycle.produce();
    motorbike.produce();
  }

}
