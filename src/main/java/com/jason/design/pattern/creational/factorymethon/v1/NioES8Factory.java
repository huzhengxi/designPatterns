package com.jason.design.pattern.creational.factorymethon.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:45 上午
 */
public class NioES8Factory implements CarFactory {

  @Override
  public Car getCar() {
    return new NIOES8();
  }
}
