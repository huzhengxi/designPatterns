package com.jason.design.pattern.behavioral.templatemethod;

/**
 * @author Tiger.HU
 * @date 2021年10月02日 12:44 上午
 */
public class Test {

  public static void main(String[] args) {
    System.out.println("后端课程 start----");
    ACourse designPatternCourse = new DesignPatternCourse();
    designPatternCourse.makeCourse();
    System.out.println("后端课程 end----");

    System.out.println("前端课程  start----");
    ACourse feCourse = new FECourse();
    feCourse.makeCourse();
    System.out.println("前端课程  end----");
  }

}
