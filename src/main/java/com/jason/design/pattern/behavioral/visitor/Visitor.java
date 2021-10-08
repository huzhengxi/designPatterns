package com.jason.design.pattern.behavioral.visitor;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 1:24 上午
 */
public class Visitor implements  IVisitor{

  @Override
  public void visit(FreeCourse course) {
    System.out.println("免费课程：" + course.getName());
  }

  @Override
  public void visit(CodingCourse course) {
    System.out.println("实战课程：" + course.getName() + ", " + course.getPrice());
  }
}
