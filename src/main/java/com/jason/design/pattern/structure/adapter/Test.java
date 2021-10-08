package com.jason.design.pattern.structure.adapter;

/**
 * @author Tiger.HU
 * @date 2021年09月29日 12:03 上午
 */
public class Test {

  public static void main(String[] args) {
    DC5 dc5 = new PowerAdapter();
    dc5.outputDC5V();
  }
}
