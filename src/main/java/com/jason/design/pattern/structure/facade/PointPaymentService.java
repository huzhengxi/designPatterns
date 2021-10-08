package com.jason.design.pattern.structure.facade;

/**
 * @author Tiger.HU
 * @date 2021年09月26日 12:21 上午
 */
public class PointPaymentService {

  public boolean pay(PointGift pointGift) {
    System.out.println("支付" + pointGift.getName() + "积分成功");
    return true;
  }

}
