package com.jason.design.pattern.structure.decorator.v2;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:20 下午
 */
public class Battercake extends ABattercake {


  @Override
  protected String getDesc() {
    return "煎饼";
  }

  @Override
  protected int cost() {
    return 8;
  }
}
