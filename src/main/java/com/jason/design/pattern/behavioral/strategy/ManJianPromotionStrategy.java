package com.jason.design.pattern.behavioral.strategy;

/**
 * @author Tiger.HU
 * @date 2021年10月04日 11:53 上午
 */
public class ManJianPromotionStrategy implements PromotionStrategy{

  @Override
  public void doPromotion() {
    System.out.println("满减促销，慢200减20元");
  }
}
