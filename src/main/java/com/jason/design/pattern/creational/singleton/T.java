package com.jason.design.pattern.creational.singleton;

/**
 * @author Tiger.HU
 * @date 2021年10月08日 11:05 下午
 */
public class T implements Runnable {

  @Override
  public void run() {
    LazySingletonPlus lazySingleton = LazySingletonPlus.getInstance();
    System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
  }
}
