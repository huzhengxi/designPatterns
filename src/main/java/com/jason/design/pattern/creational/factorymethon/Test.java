package com.jason.design.pattern.creational.factorymethon;

public class Test {

  public static void main(String[] args) {
    VideoFactory videoFactory = new PythonVideoFactory();
    VideoFactory videoFactory1 = new JavaVideoFactory();
    VideoFactory videoFactory2 = new FEVideoFactory();
    Video video = videoFactory.getVideo();
    video.produce();
  }

}
