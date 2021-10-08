package com.jason.design.pattern.structure.adapter.classadapter;

/**
 * @author Tiger.HU
 * @date 2021年09月28日 11:44 下午
 */
public class ConcrateTarget implements Target {

  @Override
  public void request() {
      System.out.println("ConcrateTarget目标方法");
  }
}
