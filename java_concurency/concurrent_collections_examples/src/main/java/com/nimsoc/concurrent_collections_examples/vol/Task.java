package com.nimsoc.concurrent_collections_examples.vol;

import java.util.Date;

public class Task implements Runnable {

  private final Flag flag;

  public Task(Flag flag) {
    this.flag = flag;
  }

  @Override
  public void run() {
    int i = 0;
    while (flag.flag) {
      i++;
    }
    System.out.printf("Task: %d - %s\n", i, new Date());
  }

}
