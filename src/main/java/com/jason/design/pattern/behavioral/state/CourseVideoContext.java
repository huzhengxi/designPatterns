package com.jason.design.pattern.behavioral.state;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 11:05 下午
 */
public class CourseVideoContext extends CourseVideoState {

  private CourseVideoState courseVideoState;

  public static final PlayState PLAY_STATE = new PlayState();
  public static final StopState STOP_STATE = new StopState();
  public static final PauseState PAUSE_STATE = new PauseState();
  public static final SpeedState SPEED_STATE = new SpeedState();

  public CourseVideoState getCourseVideoState() {
    return courseVideoState;
  }

  public void setCourseVideoState(
      CourseVideoState courseVideoState) {
    this.courseVideoState = courseVideoState;
    this.courseVideoState.setCourseVideoContext(this);
  }

  public void play() {
    courseVideoState.play();
  }

  public void speed() {
    courseVideoState.speed();
  }

  public void pause() {
    courseVideoState.pause();
  }

  public void stop() {
    courseVideoState.stop();
  }
}
