package com.jason.design.pattern.creational.abstractfactory.honda;

import com.jason.design.pattern.creational.abstractfactory.intercace.IAbstractFactory;
import com.jason.design.pattern.creational.abstractfactory.intercace.IBicycle;
import com.jason.design.pattern.creational.abstractfactory.intercace.IBus;
import com.jason.design.pattern.creational.abstractfactory.intercace.ICar;
import com.jason.design.pattern.creational.abstractfactory.intercace.IMotorbike;

public class HondaFactory implements IAbstractFactory {

  @Override
  public IBus getBus() {
    return new HondaBus();
  }

  @Override
  public IBicycle getBicycle() {
    return new HondaBike();
  }

  @Override
  public ICar getCar() {
    return new HondaCar();
  }

  @Override
  public IMotorbike getMotorbike() {
    return new HondaMoto();
  }
}
