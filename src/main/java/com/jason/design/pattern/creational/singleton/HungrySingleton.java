package com.jason.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式 单例模式 缺点：如果单例从来没被用过的话 会造成内存浪费
 *
 * @author Tiger.HU
 * @date 2021年10月09日 12:26 下午
 */
public class HungrySingleton implements Serializable {

  private static final HungrySingleton hungrySingleton;

  static {
    hungrySingleton = new HungrySingleton();
  }

  private HungrySingleton() {
    if (hungrySingleton != null) {
      throw new RuntimeException("单例构造器禁止反射调用");
    }
  }

  public static HungrySingleton getInstance() {
    return hungrySingleton;
  }

  private Object readResolve() {
    return hungrySingleton;
  }
}
