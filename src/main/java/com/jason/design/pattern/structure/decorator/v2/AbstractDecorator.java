package com.jason.design.pattern.structure.decorator.v2;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:21 下午
 */
public class AbstractDecorator extends ABattercake {

  private ABattercake aBattercake;

  public AbstractDecorator(ABattercake aBattercake) {
    this.aBattercake = aBattercake;
  }

  @Override
  protected String getDesc() {
    return aBattercake.getDesc();
  }

  @Override
  protected int cost() {
    return aBattercake.cost();
  }
}
