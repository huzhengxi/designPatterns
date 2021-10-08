package com.jason.design.pattern.structure.decorator.v2;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:24 下午
 */
public class Test {

  public static void main(String[] args) {
    ABattercake aBattercake = new Battercake();
    aBattercake = new EggDecorator(aBattercake);
    aBattercake = new EggDecorator(aBattercake);
    aBattercake = new SausageDecorator(aBattercake);

    System.out.println(aBattercake.getDesc() + "， 销售价格" + aBattercake.cost());

  }

}
