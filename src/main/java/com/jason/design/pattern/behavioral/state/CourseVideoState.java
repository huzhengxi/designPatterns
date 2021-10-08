package com.jason.design.pattern.behavioral.state;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 11:04 下午
 */
public abstract class CourseVideoState {

  protected CourseVideoContext courseVideoContext;

  public void setCourseVideoContext(
      CourseVideoContext courseVideoContext) {
    this.courseVideoContext = courseVideoContext;
  }

  public abstract void play();

  public abstract void speed();

  public abstract void pause();

  public abstract void stop();
}
