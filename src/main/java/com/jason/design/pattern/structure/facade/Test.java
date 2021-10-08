package com.jason.design.pattern.structure.facade;

/**
 * @author Tiger.HU
 * @date 2021年09月26日 12:28 上午
 */
public class Test {

  public static void main(String[] args) {
    PointGift pointGift = new PointGift("T恤");
    GiftExchangeService giftExchangeService = new GiftExchangeService();

    giftExchangeService.giftExchangeService(pointGift);
  }
}
