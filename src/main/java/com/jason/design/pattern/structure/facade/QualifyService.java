package com.jason.design.pattern.structure.facade;

/**
 * @author Tiger.HU
 * @date 2021年09月26日 12:19 上午
 */
public class QualifyService {

  public boolean isAvaliable(PointGift pointGift) {
    System.out.println("校验：" + pointGift.getName() + " 积分资格");
    return true;
  }

}
