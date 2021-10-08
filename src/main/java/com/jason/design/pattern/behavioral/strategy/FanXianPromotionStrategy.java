package com.jason.design.pattern.behavioral.strategy;

/**
 * @author Tiger.HU
 * @date 2021年10月04日 11:52 上午
 */
public class FanXianPromotionStrategy implements PromotionStrategy{

  @Override
  public void doPromotion() {
    System.out.println("返现促销，返回的金额存放到个人账户的余额中");
  }
}
