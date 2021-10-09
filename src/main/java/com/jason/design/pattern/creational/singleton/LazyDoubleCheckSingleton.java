package com.jason.design.pattern.creational.singleton;

/**
 * @author Tiger.HU
 * @date 2021年10月09日 12:16 上午
 */
public class LazyDoubleCheckSingleton {

  private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

  private LazyDoubleCheckSingleton() {

  }

  public static LazyDoubleCheckSingleton getInstance() {
    if (lazyDoubleCheckSingleton == null) {
      lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
    }
    return lazyDoubleCheckSingleton;
  }
}
