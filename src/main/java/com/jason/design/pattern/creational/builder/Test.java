package com.jason.design.pattern.creational.builder;

public class Test {

  public static void main(String[] args) {
    CourseBuilder courseBuilder = new CourseActualBuilder();
    Coach coach = new Coach(courseBuilder);
    Course course =  coach.makeCourse("Java课程", "", "", "", "");
    System.out.println(course);

  }
}
