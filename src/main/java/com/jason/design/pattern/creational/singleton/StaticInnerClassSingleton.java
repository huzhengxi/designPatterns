package com.jason.design.pattern.creational.singleton;

/**
 * 静态内部类 单例模式
 *
 * @author Tiger.HU
 * @date 2021年10月09日 12:08 下午
 */
public class StaticInnerClassSingleton {

  private StaticInnerClassSingleton() {
    if (InnerClass.staticInnerClassSingleton != null) {
      throw new RuntimeException("不允许反射调用");
    }
  }

  private static class InnerClass {

    private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
  }

  public static StaticInnerClassSingleton getInstance() {
    return InnerClass.staticInnerClassSingleton;
  }
}
