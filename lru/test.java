package com.lru;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class test {
    public static void main(String[] args) {
        LruCache lruCache=new LruCache(4);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        lruCache.put(4,40);
        lruCache.put(5,50);

        lruCache.put(2,22);

        System.out.println(lruCache.get(2).value);
    }


}
