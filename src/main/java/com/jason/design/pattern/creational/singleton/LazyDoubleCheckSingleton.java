package com.jason.design.pattern.creational.singleton;

/**
 *
 * @author Tiger.HU
 * @date 2021年10月09日 12:16 上午
 */
public class LazyDoubleCheckSingleton {

  private volatile  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

  private LazyDoubleCheckSingleton() {

  }

  public static LazyDoubleCheckSingleton getInstance() {
    if (lazyDoubleCheckSingleton == null) {
      synchronized (LazyDoubleCheckSingleton.class) {
        if (lazyDoubleCheckSingleton == null) {
          lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
          // 1. 分配内存
          // 2. 初始化对象
          // 3. 设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
          // 2和3 有可能互换位置
        }
      }
    }
    return lazyDoubleCheckSingleton;
  }
}
