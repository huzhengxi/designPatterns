package com.jason.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 12:34 上午
 */
public class Course extends Observable {

  private String courseName;

  public Course(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return courseName;
  }

  public void produceQuestion(Course course, Question question) {
    System.out.println(question.getUserName() + "在" + course.courseName + "提交了一个问题");
    setChanged();
    notifyObservers(question);
  }

}
