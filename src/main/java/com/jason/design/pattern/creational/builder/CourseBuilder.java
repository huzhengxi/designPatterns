package com.jason.design.pattern.creational.builder;

public interface  CourseBuilder {

  void builderCourseName(String name);

  void builderCoursePPT(String ppt);

  void builderCourseVideo(String video);

  void builderCourseArticle(String article);

  void builderCourseQA(String qa);

  Course makeCourse();
}
