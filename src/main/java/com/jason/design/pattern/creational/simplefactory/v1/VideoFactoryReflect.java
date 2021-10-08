package com.jason.design.pattern.creational.simplefactory.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:25 上午
 */
public class VideoFactoryReflect {

  public static Video getVideo(Class c)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Video video = null;
    video = (Video) Class.forName(c.getName()).newInstance();
    return video;
  }
}
