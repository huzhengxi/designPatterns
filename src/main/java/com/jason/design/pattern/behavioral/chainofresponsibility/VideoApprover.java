package com.jason.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 12:55 上午
 */
public class VideoApprover extends Approver {

  @Override
  public void deploy(Course course) {
    if (StringUtils.isNotEmpty(course.getVideo())) {
      System.out.println("包含视频，批准");
      if (approver != null) {
        approver.deploy(course);
      }
    } else {
      System.out.println("不包含视频，不批准，流程结束");
      return;
    }
  }
}
