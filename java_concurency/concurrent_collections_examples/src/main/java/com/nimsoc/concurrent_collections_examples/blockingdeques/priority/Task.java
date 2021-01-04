package com.nimsoc.concurrent_collections_examples.blockingdeques.priority;

import java.util.concurrent.PriorityBlockingQueue;

public class Task implements Runnable {

  private final int id;

  private final PriorityBlockingQueue<Event> queue;

  public Task(int id, PriorityBlockingQueue<Event> queue) {
    this.id = id;
    this.queue = queue;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      Event event = new Event(id, i);
      queue.add(event);
    }
  }

}
