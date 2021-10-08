package com.jason.design.pattern.creational.builder;

public class Course {

  private String courseName;
  private String coursePPT;
  private String courseVideo;
  private String courseArticle;

  private String sourceQA;

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCoursePPT() {
    return coursePPT;
  }

  public void setCoursePPT(String coursePPT) {
    this.coursePPT = coursePPT;
  }

  public String getCourseVideo() {
    return courseVideo;
  }

  public void setCourseVideo(String courseVideo) {
    this.courseVideo = courseVideo;
  }

  public String getCourseArticle() {
    return courseArticle;
  }

  public void setCourseArticle(String courseArticle) {
    this.courseArticle = courseArticle;
  }

  public String getSourceQA() {
    return sourceQA;
  }

  public void setSourceQA(String sourceQA) {
    this.sourceQA = sourceQA;
  }

  @Override
  public String toString() {
    return "Course{" +
        "courseName='" + courseName + '\'' +
        ", coursePPT='" + coursePPT + '\'' +
        ", courseVideo='" + courseVideo + '\'' +
        ", courseArticle='" + courseArticle + '\'' +
        ", sourceQA='" + sourceQA + '\'' +
        '}';
  }
}
