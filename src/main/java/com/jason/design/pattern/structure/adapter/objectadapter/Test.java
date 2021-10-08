package com.jason.design.pattern.structure.adapter.objectadapter;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:46 下午
 */
public class Test {

  public static void main(String[] args) {
    Target target = new ConcrateTarget();
    target.request();

    Target target1 = new Adapter();
    target1.request();
  }

}
