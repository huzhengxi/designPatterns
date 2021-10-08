package com.jason.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 12:40 上午
 */
public class ArticleApprover extends Approver {

  @Override
  public void deploy(Course course) {
    if (StringUtils.isNotEmpty(course.getArticle())) {
      System.out.println("含有手记，批准");
      if (approver != null) {
        approver.deploy(course);
      }
    } else {
      System.out.println("不包含手记，不批准，流程结束");
      return;
    }

  }
}
