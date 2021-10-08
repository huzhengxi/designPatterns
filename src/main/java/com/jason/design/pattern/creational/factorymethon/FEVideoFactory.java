package com.jason.design.pattern.creational.factorymethon;

public class FEVideoFactory extends VideoFactory {

  @Override
  public Video getVideo() {
    return new FEVideo();
  }
}
