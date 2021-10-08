package com.jason.design.pattern.creational.builder.v2;

public class Test {

  public static void main(String[] args) {
    Course course = new Course.CourseBuilder().buildCourseName("java课程")
        .buildCourseArticle("java手记")
        .buildCoursePPT("java PPT").build();

    System.out.println(course);
  }
}
