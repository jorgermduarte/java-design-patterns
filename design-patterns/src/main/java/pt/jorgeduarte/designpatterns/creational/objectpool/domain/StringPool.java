package pt.jorgeduarte.designpatterns.creational.objectpool.domain;

import java.util.concurrent.ConcurrentLinkedQueue;

public class StringPool {
    private ConcurrentLinkedQueue<String> pool = new ConcurrentLinkedQueue<>();

    public StringPool(int size) {
        for (int i = 0; i < size; i++) {
            pool.add("String " + (i + 1));
        }
    }

    public String borrowString() {
        return pool.poll();
    }

    public void returnString(String str) {
        pool.offer(str);
    }
}