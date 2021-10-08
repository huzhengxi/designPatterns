package com.jason.design.pattern.structure.bridge;

/**
 * @author Tiger.HU
 * @date 2021年09月29日 12:53 上午
 */
public class ICBCBank extends Bank {

  public ICBCBank(Account account) {
    super(account);
  }

  @Override
  Account openAccount() {
    System.out.println("打开中国工商银行账号");
    account.openAccount();
    return account;
  }
}
