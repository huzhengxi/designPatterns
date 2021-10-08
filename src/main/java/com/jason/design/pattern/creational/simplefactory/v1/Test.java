package com.jason.design.pattern.creational.simplefactory.v1;

/**
 * @author Tiger.HU
 * @date 2021年09月23日 1:11 上午
 */
public class Test {

  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Video video = VideoFactoryReflect.getVideo(JavaVideo.class);
    video.produce(); //输出：录制 Java 课程视频

    Video video1 = VideoFactoryReflect.getVideo(PythonVideo.class);
    video1.produce(); //输出：录制 Python 课程视频
  }

}
