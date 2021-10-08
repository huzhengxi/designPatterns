package com.jason.design.pattern.structure.decorator.v2;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:23 下午
 */
public class SausageDecorator extends  AbstractDecorator{

  public SausageDecorator(ABattercake aBattercake) {
    super(aBattercake);
  }

  @Override
  protected String getDesc() {
    return super.getDesc() + " 加一根香肠";
  }

  @Override
  protected int cost() {
    return super.cost() + 2;
  }
}
