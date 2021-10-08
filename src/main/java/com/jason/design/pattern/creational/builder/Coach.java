package com.jason.design.pattern.creational.builder;

public class Coach {

  private CourseBuilder courseBuilder;

  public Coach(CourseBuilder courseBuilder) {
    this.courseBuilder = courseBuilder;
  }


  public Course makeCourse(String name, String ppt, String article, String video, String QA) {
    courseBuilder.builderCourseName(name);
    courseBuilder.builderCoursePPT(ppt);
    courseBuilder.builderCourseArticle(article);
    courseBuilder.builderCourseVideo(video);
    courseBuilder.builderCourseQA(QA);
    return courseBuilder.makeCourse();
  }
}
