package com.jason.design.pattern.creational.singleton;

/**
 * 单例模式——懒汉式 1. 线程不安全的。
 *
 * @author Tiger.HU
 * @date 2021年10月08日 10:36 下午
 */
public class LazySingleton {

  private static LazySingleton lazySingleton = null;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (lazySingleton == null) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }

}
