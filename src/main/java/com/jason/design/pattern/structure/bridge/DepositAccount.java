package com.jason.design.pattern.structure.bridge;

/**
 * 定期账号
 * @author Tiger.HU
 * @date 2021年09月29日 12:43 上午
 */
public class DepositAccount implements Account{

  @Override
  public Account openAccount() {
    System.out.println("打开定期账号");
    return new DepositAccount();
  }

  @Override
  public void showAccountType() {
    System.out.println("这是一个定期账号");
  }
}
