package com.jason.design.pattern.structure.facade;

/**
 * @author Tiger.HU
 * @date 2021年09月26日 12:22 上午
 */
public class ShippingService {

  public String shipGift(PointGift pointGift) {
    System.out.println(pointGift.getName() + "进入物流系统");
    String shippingOrderNo = "666";
    return shippingOrderNo;
  }

}
