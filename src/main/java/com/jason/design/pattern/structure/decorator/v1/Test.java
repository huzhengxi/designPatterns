package com.jason.design.pattern.structure.decorator.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月27日 12:03 上午
 */
public class Test {

  public static void main(String[] args) {
    Battercake battercake = new Battercake();
    System.out.println(battercake.getDesc());

    BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
    System.out.println(battercakeWithEgg.getDesc());

    BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
    System.out.println(battercakeWithEggSausage.getDesc());
  }
}
