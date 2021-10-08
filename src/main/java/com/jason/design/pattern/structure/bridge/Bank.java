package com.jason.design.pattern.structure.bridge;

/**
 * @author Tiger.HU
 * @date 2021年09月29日 12:46 上午
 */
public abstract class Bank {
  protected Account account;

  public Bank(Account account) {
    this.account = account;
  }

  abstract Account openAccount();

}
