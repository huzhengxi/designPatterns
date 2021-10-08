package com.jason.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tiger.HU
 * @date 2021年10月04日 12:09 下午
 */
public class PromotionStrategyFactory {

  private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

  static {
    PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
    PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
  }

  private static final PromotionStrategy NONE_PROMOTION = new EmptyPromotionStrategy();

  private PromotionStrategyFactory() {
  }

  public static PromotionStrategy getPromotionStrategy(String promotionKey) {
    PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
    return promotionStrategy == null ? NONE_PROMOTION : promotionStrategy;
  }

  private interface PromotionKey {

    String LIJIAN = "LIJIAN";
    String FANXIAN = "FANXIAN";
    String MANJIAN = "MANJIAN";
  }
}
