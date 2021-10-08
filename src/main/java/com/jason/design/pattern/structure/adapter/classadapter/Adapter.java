package com.jason.design.pattern.structure.adapter.classadapter;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:45 下午
 */
public class Adapter extends Adaptee implements Target {

  @Override
  public void request() {
    super.adapteeRequest();
  }
}
