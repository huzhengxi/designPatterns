package com.jason.design.pattern.behavioral.command;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 11:04 下午
 */
public class Test {

  public static void main(String[] args) {
    CourseVideo courseVideo = new CourseVideo("Java设计模式");
    OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
    CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
    Staff staff = new Staff();

    staff.addCommand(openCourseVideoCommand);
    staff.addCommand(closeCourseVideoCommand);
    staff.executeCommands();

  }

}
