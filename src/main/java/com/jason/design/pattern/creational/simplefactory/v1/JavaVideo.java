package com.jason.design.pattern.creational.simplefactory.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:08 上午
 */
public class JavaVideo implements Video {

  @Override
  public void produce() {
    System.out.println("录制 Java 课程视频");
  }
}
