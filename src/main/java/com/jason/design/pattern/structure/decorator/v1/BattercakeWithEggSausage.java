package com.jason.design.pattern.structure.decorator.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月27日 12:03 上午
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

  @Override
  protected String getDesc() {
    return super.getDesc() + " 加一根香肠";
  }

  @Override
  protected int coat() {
    return super.coat() + 2;
  }
}
