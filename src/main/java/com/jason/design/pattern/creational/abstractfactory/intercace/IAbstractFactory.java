package com.jason.design.pattern.creational.abstractfactory.intercace;


public interface IAbstractFactory {

  IBus getBus();

  IBicycle getBicycle();

  ICar getCar();

  IMotorbike getMotorbike();
}
