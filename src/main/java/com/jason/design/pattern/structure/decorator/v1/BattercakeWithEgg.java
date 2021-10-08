package com.jason.design.pattern.structure.decorator.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月27日 12:01 上午
 */
public class BattercakeWithEgg extends Battercake {

  @Override
  protected String getDesc() {
    return super.getDesc() + " 加一个鸡蛋";
  }

  @Override
  protected int coat() {
    return super.coat() + 1;
  }
}
