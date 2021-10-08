package com.jason.design.pattern.behavioral.state;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 11:07 下午
 */
public class PauseState extends CourseVideoState {

  @Override
  public void play() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
  }

  @Override
  public void speed() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
  }

  @Override
  public void pause() {
    System.out.println("暂停播放视频状态");
  }

  @Override
  public void stop() {
    super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
  }
}
