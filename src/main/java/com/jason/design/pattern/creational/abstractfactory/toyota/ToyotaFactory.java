package com.jason.design.pattern.creational.abstractfactory.toyota;

import com.jason.design.pattern.creational.abstractfactory.honda.HondaBus;
import com.jason.design.pattern.creational.abstractfactory.intercace.IAbstractFactory;
import com.jason.design.pattern.creational.abstractfactory.intercace.IBicycle;
import com.jason.design.pattern.creational.abstractfactory.intercace.IBus;
import com.jason.design.pattern.creational.abstractfactory.intercace.ICar;
import com.jason.design.pattern.creational.abstractfactory.intercace.IMotorbike;

public class ToyotaFactory implements IAbstractFactory {

  @Override
  public IBus getBus() {
    return new ToyotaBus();
  }

  @Override
  public IBicycle getBicycle() {
    return new ToyotaBike();
  }

  @Override
  public ICar getCar() {
    return new ToyotaCar();
  }

  @Override
  public IMotorbike getMotorbike() {
    return new ToyotaMoto();
  }
}
