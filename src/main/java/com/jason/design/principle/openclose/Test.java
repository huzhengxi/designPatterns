package com.jason.design.principle.openclose;

public class Test {

  public static void main(String[] args) {
    ICourse javaCourse = new JavaCourse(96, "Java从零到企业级电商开发", 348d);
    System.out.println("课程id：" + javaCourse.getId() + " 名称：" +
        javaCourse.getName() + " 价格：" + javaCourse.getPrice());
  }
}
