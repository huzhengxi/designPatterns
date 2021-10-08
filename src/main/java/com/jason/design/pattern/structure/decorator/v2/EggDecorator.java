package com.jason.design.pattern.structure.decorator.v2;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:22 下午
 */
public class EggDecorator extends AbstractDecorator {

  public EggDecorator(ABattercake aBattercake) {
    super(aBattercake);
  }

  @Override
  protected String getDesc() {
    return super.getDesc() + " 加一根鸡蛋";
  }

  @Override
  protected int cost() {
    return super.cost() + 1;
  }
}
