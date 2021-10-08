package com.jason.design.pattern.creational.builder;

public class CourseActualBuilder implements CourseBuilder {

  private Course course = new Course();

  @Override
  public void builderCourseName(String name) {
    course.setCourseName(name);
  }

  @Override
  public void builderCoursePPT(String ppt) {
    course.setCoursePPT(ppt);
  }

  @Override
  public void builderCourseVideo(String video) {
    course.setCourseVideo(video);
  }

  @Override
  public void builderCourseArticle(String article) {
    course.setCourseArticle(article);
  }

  @Override
  public void builderCourseQA(String qa) {
    course.setSourceQA(qa);
  }

  @Override
  public Course makeCourse() {
    return course;
  }
}
