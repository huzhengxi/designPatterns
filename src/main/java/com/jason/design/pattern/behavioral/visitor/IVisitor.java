package com.jason.design.pattern.behavioral.visitor;

/**
 * @author Tiger.HU
 * @date 2021年10月07日 1:20 上午
 */
public interface IVisitor {

  void visit(FreeCourse course);

  void visit(CodingCourse course);
}
