package com.jason.design.pattern.behavioral.state;

/**
 * @author Tiger.HU
 * @date 2021年10月08日 12:19 上午
 */
public class Test {

  public static void main(String[] args) {
    CourseVideoContext courseVideoContext = new CourseVideoContext();
    courseVideoContext.setCourseVideoState(new PlayState());
    System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

    courseVideoContext.pause();
    System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

    courseVideoContext.speed();
    System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

    courseVideoContext.stop();
    System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

  }

}
