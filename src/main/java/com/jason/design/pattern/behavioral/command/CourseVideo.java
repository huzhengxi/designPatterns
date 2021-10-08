package com.jason.design.pattern.behavioral.command;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 10:50 下午
 */
public class CourseVideo {

  private String name;

  public CourseVideo(String name) {
    this.name = name;
  }

  public void open() {
    System.out.println(this.name + "课程视频开放");
  }

  public void close() {
    System.out.println(this.name + "课程视频关闭");
  }
}
