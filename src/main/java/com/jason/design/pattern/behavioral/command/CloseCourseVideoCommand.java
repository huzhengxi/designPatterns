package com.jason.design.pattern.behavioral.command;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 10:54 下午
 */
public class CloseCourseVideoCommand implements Command{
  private CourseVideo courseVideo;

  public CloseCourseVideoCommand(CourseVideo courseVideo) {
    this.courseVideo = courseVideo;
  }

  @Override
  public void execute() {
    courseVideo.close();
  }
}
