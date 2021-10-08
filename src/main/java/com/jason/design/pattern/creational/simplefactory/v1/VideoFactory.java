package com.jason.design.pattern.creational.simplefactory.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:09 上午
 */
public class VideoFactory {

  public static Video getVideo(String type) {
    if ("java".equalsIgnoreCase(type)) {
      return new JavaVideo();
    } else if ("python".equalsIgnoreCase(type)) {
      return new PythonVideo();
    } else {
      throw new RuntimeException("no match type");
    }
  }
}
