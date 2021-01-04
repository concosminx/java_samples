package com.nimsoc.concurrent_collections_examples.atomicvars;

public class Company implements Runnable {

  private final Account account;

  public Company(Account account) {
    this.account = account;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      account.addAmount(1000);
    }
  }

}
