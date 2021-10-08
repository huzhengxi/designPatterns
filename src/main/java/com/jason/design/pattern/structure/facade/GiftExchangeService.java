package com.jason.design.pattern.structure.facade;

/**
 * @author Tiger.HU
 * @date 2021年09月26日 12:24 上午
 */
public class GiftExchangeService {

  private QualifyService qualifyService = new QualifyService();
  private PointPaymentService pointPaymentService = new PointPaymentService();
  private ShippingService shippingService = new ShippingService() ;

  public void giftExchangeService(PointGift pointGift) {
    if (qualifyService.isAvaliable(pointGift) && pointPaymentService.pay(pointGift)) {
      String shippingNo = shippingService.shipGift(pointGift);
      System.out.println("兑换成功，订单号为：" + shippingNo);
    }
  }

}
