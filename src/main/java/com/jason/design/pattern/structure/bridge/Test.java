package com.jason.design.pattern.structure.bridge;

/**
 * @author Tiger.HU
 * @date 2021年09月29日 12:59 上午
 */
public class Test {

  public static void main(String[] args) {
    Bank icbcBank = new ICBCBank(new DepositAccount());
    Account icbcAccount = icbcBank.openAccount();
    icbcAccount.showAccountType();

    Bank abcBank = new ABCBank(new SavingAccount());
    Account abcAccount = abcBank.openAccount();
    abcAccount.showAccountType();
  }

}
