package com.jason.design.pattern.behavioral.visitor;

import com.jason.design.pattern.creational.factorymethon.Video;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 12:48 下午
 */
public class Test {

  public static void main(String[] args) {
    List<Course> courseList = new ArrayList<>();
     FreeCourse freeCourse = new FreeCourse();
     freeCourse.setName("Spring MVC 数据绑定");

    CodingCourse codingCourse = new CodingCourse();
    codingCourse.setName("Java 设计模式精讲");
    codingCourse.setPrice(229);

    courseList.add(freeCourse);
    courseList.add(codingCourse);

    for (Course course : courseList) {
      course.accept(new Visitor());
    }


  }

}
