package com.jason.design.pattern.behavioral.templatemethod;

/**
 * @author Tiger.HU
 * @date 2021年10月02日 12:41 上午
 */
public class DesignPatternCourse extends ACourse {

  @Override
  void packageCourse() {
    System.out.println("提供Java源码");
  }

  @Override
  protected boolean needWriteArticle() {
    return true;
  }
}
