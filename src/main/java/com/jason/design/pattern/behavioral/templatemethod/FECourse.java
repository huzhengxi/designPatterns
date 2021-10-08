package com.jason.design.pattern.behavioral.templatemethod;

/**
 * @author Tiger.HU
 * @date 2021年10月02日 12:42 上午
 */
public class FECourse extends ACourse{

  @Override
  void packageCourse() {
    System.out.println("提供课程的前端代码");
    System.out.println("提供课程的图片等多媒体素材 ");
  }
}
