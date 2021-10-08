package com.jason.design.pattern.behavioral.templatemethod;

/**
 * @author Tiger.HU
 * @date 2021年10月02日 12:23 上午
 */
public abstract class ACourse {

  protected final void makeCourse() {
    makePPT();
    makeVideo();
    if (needWriteArticle()) {
      writeArticle();
    }
    packageCourse();
  }

  final void makePPT() {
    System.out.println("制作PPT");
  }

  final void makeVideo() {
    System.out.println("制作视频");
  }

  final void writeArticle() {
    System.out.println("编写手记");
  }

  /**
   * 钩子函数
   *
   * @param null
   * @return null
   * @author Tiger.HU
   * @date 2021/10/2 12:39 上午
   */
  protected boolean needWriteArticle() {
    return false;
  }

  abstract void packageCourse();
}
