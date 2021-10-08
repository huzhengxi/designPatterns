package com.jason.design.pattern.behavioral.strategy;


/**
 * @author Tiger.HU
 * @date 2021年10月04日 12:02 下午
 */
public class Test {

  public static void main(String[] args) {
    String promotionKey = "MANJIAN1";
    PromotionActivity activity = new PromotionActivity(
        PromotionStrategyFactory.getPromotionStrategy(promotionKey));
   activity.executePromotionStrategy();

  }

}
