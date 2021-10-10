package com.jason.design.pattern.creational.singleton;

/**
 * @author Tiger.HU
 * @date 2021年10月10日 1:19 下午
 */
public class ThreadLocalInstance {

  private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<>() {
    @Override
    protected ThreadLocalInstance initialValue() {
      return new ThreadLocalInstance();
    }
  };

  private ThreadLocalInstance() {

  }

  public static ThreadLocalInstance getInstance() {
    return threadLocalInstance.get();
  }

}
