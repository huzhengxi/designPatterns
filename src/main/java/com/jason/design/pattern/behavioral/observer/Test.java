package com.jason.design.pattern.behavioral.observer;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 12:46 上午
 */
public class Test {

  public static void main(String[] args) {
    Course course = new Course("Java设计模式精讲");
    Teacher teacher = new Teacher("Alpha");
    course.addObserver(teacher);

    Question question = new Question();
    question.setUserName("Hzx");
    question.setQuestionContent("Java的主线程如何编写？ ");

    course.produceQuestion(course, question);
  }

}
