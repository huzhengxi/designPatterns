package com.jason.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 12:35 上午
 */
public class Teacher implements Observer {

  private String teacherName;

  public Teacher(String teacherName) {
    this.teacherName = teacherName;
  }

  @Override
  public void update(Observable o, Object arg) {
    Course course = (Course) o;
    Question question = (Question) arg;
    System.out.println(teacherName + "老师的" + "课程接受到了一个" + question.getUserName() + "提交的问答："
        + question.getQuestionContent());
  }
}
