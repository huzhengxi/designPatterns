package com.jason.design.pattern.creational.singleton;

/**
 * @author Tiger.HU
 * @date 2021年10月08日 10:53 下午
 */
public class Test {

  public static void main(String[] args) {
    Thread t1 = new Thread(new T());
    Thread t2 = new Thread(new T());
    t1.start();
    t2.start();
    System.out.println("program end");
  }

}
