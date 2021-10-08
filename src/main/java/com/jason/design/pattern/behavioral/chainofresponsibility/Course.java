package com.jason.design.pattern.behavioral.chainofresponsibility;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 11:52 下午
 */
public class Course {

  private String name;
  private String article;
  private String video;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getArticle() {
    return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }
}
