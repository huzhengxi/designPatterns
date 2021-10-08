package com.jason.design.pattern.structure.bridge;

/**
 * @author Tiger.HU
 * @date 2021年09月29日 12:52 上午
 */
public class ABCBank extends Bank {

  public ABCBank(Account account) {
    super(account);
  }

  @Override
  Account openAccount() {
    System.out.println("打开中国农业账号");
    account.openAccount();
    return account;
  }
}
