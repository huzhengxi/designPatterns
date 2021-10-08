package com.jason.design.pattern.behavioral.state;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 11:07 下午
 */
public class StopState extends CourseVideoState {

  @Override
  public void play() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
  }

  @Override
  public void speed() {
    System.out.println("ERROR 停止状态不能快进");
  }

  @Override
  public void pause() {
    System.out.println("ERROR 停止状态不能暂定");
  }

  @Override
  public void stop() {
    System.out.println("停止播放课程视频状态");
  }
}
