package com.jason.design.pattern.creational.factorymethon;

public class JavaVideoFactory extends VideoFactory {

  @Override
  public Video getVideo() {
    return new JavaVideo();
  }
}
