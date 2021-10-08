package com.jason.design.pattern.behavioral.strategy;

/**
 * @author Tiger.HU
 * @date 2021年10月04日 11:55 上午
 */
public class PromotionActivity {

  private PromotionStrategy promotionStrategy;

  public PromotionActivity(
      PromotionStrategy promotionStrategy) {
    this.promotionStrategy = promotionStrategy;
  }

  public void  executePromotionStrategy() {
    promotionStrategy.doPromotion();
  }
}
