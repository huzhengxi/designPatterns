package com.jason.design.pattern.behavioral.chainofresponsibility;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 11:53 下午
 */
public abstract class Approver {

  protected Approver approver;

  public void setNextApprover(Approver approver) {
    this.approver = approver;
  }

  public abstract void deploy(Course course);
}
