package com.jason.design.pattern.behavioral.state;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 11:06 下午
 */
public class PlayState extends CourseVideoState {

  @Override
  public void play() {
    System.out.println("正常播放课程视频状态");
  }

  @Override
  public void speed() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
  }

  @Override
  public void pause() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
  }

  @Override
  public void stop() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
  }
}
