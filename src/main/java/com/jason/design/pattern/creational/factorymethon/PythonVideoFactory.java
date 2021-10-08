package com.jason.design.pattern.creational.factorymethon;

public class PythonVideoFactory extends VideoFactory {

  @Override
  public Video getVideo() {
    return new PythonVideo();
  }
}
