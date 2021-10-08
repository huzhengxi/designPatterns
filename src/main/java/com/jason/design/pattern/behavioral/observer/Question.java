package com.jason.design.pattern.behavioral.observer;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 12:35 上午
 */
public class Question {

  private String userName;
  private String questionContent;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getQuestionContent() {
    return questionContent;
  }

  public void setQuestionContent(String questionContent) {
    this.questionContent = questionContent;
  }
}
