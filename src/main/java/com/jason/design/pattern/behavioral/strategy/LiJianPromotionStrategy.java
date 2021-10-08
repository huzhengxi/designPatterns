package com.jason.design.pattern.behavioral.strategy;

/**
 * @author Tiger.HU
 * @date 2021年10月04日 11:52 上午
 */
public class LiJianPromotionStrategy implements PromotionStrategy{

  @Override
  public void doPromotion() {
    System.out.println("立减促销，课程的价格直接减去配置的价格");
  }
}
