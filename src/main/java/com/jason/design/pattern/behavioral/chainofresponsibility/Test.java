package com.jason.design.pattern.behavioral.chainofresponsibility;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 12:58 上午
 */
public class Test {

  public static void main(String[] args) {
    Approver articleApprover = new ArticleApprover();
    Approver videoApprover = new VideoApprover();

    Course course = new Course();
    course.setName("Java 设计模式精讲 --- By Geely");
    course.setArticle("手记");
//    course.setVideo("视频");

    articleApprover.setNextApprover(videoApprover);
    articleApprover.deploy(course);

  }

}
