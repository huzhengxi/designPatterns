package com.jason.design.pattern.structure.adapter;

/**
 * @author Tiger.HU
 * @date 2021年09月29日 12:00 上午
 */
public class PowerAdapter implements DC5{
  AC220 ac220 = new AC220();
  @Override
  public int outputDC5V() {
    int adapterInput = ac220.outputAC220V();
    //变压器
    int output = adapterInput / 44;
    System.out.println("使用PowerAdapter输入AC：" + adapterInput +"V" + "输出DC" + output + "V");
    return output;
  }
}
