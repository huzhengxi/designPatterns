package com.jason.design.pattern.creational.singleton;

/**
 * 线程安全的懒汉式 单例模式
 * 缺点： synchronized 比较消耗资源，有加锁和解锁的开销，而却 synchronized 修饰 static 方法的时候锁的是整个类，
 * 对性能有一定的影响
 * @author Tiger.HU
 * @date 2021年10月09日 12:08 上午
 */
public class LazySingletonPlus {

  private static LazySingletonPlus lazySingletonPlus = null;

  private LazySingletonPlus() {

  }

  //  public static LazySingletonPlus getInstance() {
//    synchronized (LazySingletonPlus.class) {
//      if (lazySingletonPlus == null) {
//        lazySingletonPlus = new LazySingletonPlus();
//      }
//    }
//    return lazySingletonPlus;
//  }

  public synchronized static LazySingletonPlus getInstance() {
    if (lazySingletonPlus == null) {
      lazySingletonPlus = new LazySingletonPlus();
    }
    return lazySingletonPlus;
  }
}