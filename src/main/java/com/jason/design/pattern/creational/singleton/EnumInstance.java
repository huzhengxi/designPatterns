package com.jason.design.pattern.creational.singleton;

/**
 * Effective Java 中推荐的单例写法 优点：防反射、防序列化和反序列化
 *
 * @author Tiger.HU
 * @date 2021年10月10日 9:40 上午
 */
public enum EnumInstance {

  INSTANCE {
    protected void printTest() {
      System.out.println("Jason Print Test");
    }
  };

  protected abstract void printTest();

  private Object data;

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static EnumInstance getInstance() {
    return INSTANCE;
  }
}
