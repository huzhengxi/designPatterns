package com.jason.design.pattern.structure.adapter.objectadapter;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:54 下午
 */
public class Adapter implements Target{
  Adaptee adaptee = new Adaptee();
  @Override
  public void request() {
    adaptee.adapteeRequest();
  }
}
