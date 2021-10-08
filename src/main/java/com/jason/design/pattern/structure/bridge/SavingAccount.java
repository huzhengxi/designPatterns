package com.jason.design.pattern.structure.bridge;

/**
 * 活期账号
 * @author Tiger.HU
 * @date 2021年09月29日 12:44 上午
 */
public class SavingAccount implements Account{

  @Override
  public Account openAccount() {
    System.out.println("打开活期账号");
    return new SavingAccount();
  }

  @Override
  public void showAccountType() {
    System.out.println("这是一个活期账号");
  }
}
