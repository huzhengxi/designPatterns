package com.jason.design.pattern.behavioral.command;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 10:53 下午
 */
public class OpenCourseVideoCommand implements Command {

  private CourseVideo courseVideo;

  public OpenCourseVideoCommand(CourseVideo courseVideo) {
    this.courseVideo = courseVideo;
  }

  @Override
  public void execute() {
    this.courseVideo.open();
  }
}
