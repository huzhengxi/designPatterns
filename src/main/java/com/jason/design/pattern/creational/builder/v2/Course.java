package com.jason.design.pattern.creational.builder.v2;

public class Course {

  private String courseName;
  private String courseVideo;
  private String coursePPT;
  private String courseQA;
  private String courseArticle;

  public Course(CourseBuilder builder) {
    this.courseName = builder.courseName;
    this.courseVideo = builder.courseVideo;
    this.coursePPT = builder.coursePPT;
    this.courseQA = builder.courseQA;
    this.courseArticle = builder.courseArticle;
  }

  @Override
  public String toString() {
    return "Course{" +
        "courseName='" + courseName + '\'' +
        ", courseVideo='" + courseVideo + '\'' +
        ", coursePPT='" + coursePPT + '\'' +
        ", courseQA='" + courseQA + '\'' +
        ", courseArticle='" + courseArticle + '\'' +
        '}';
  }


  public static class CourseBuilder {

    private String courseName;
    private String courseVideo;
    private String coursePPT;
    private String courseQA;
    private String courseArticle;

    public CourseBuilder buildCourseName(String name) {
      courseName = name;
      return this;
    }

    public CourseBuilder buildCoursePPT(String PPT) {
      coursePPT = PPT;
      return this;
    }

    public CourseBuilder buildCourseVideo(String video) {
      courseVideo = video;
      return this;
    }

    public CourseBuilder buildCourseArticle(String article) {
      courseArticle = article;
      return this;
    }

    public CourseBuilder buildCourseQA(String qa) {
      courseQA = qa;
      return this;
    }

    Course build() {
      return new Course(this);
    }
  }

}
