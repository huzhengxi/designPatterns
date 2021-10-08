package com.jason.design.pattern.behavioral.strategy;

/**
 * @author Tiger.HU
 * @date 2021年10月04日 12:11 下午
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

  @Override
  public void doPromotion() {
    System.out.println("无促销活动");
  }
}
