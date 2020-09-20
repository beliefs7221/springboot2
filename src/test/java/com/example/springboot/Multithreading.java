package com.example.springboot;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Multithreading {
    private static Integer k = 0;
    private static Integer pageSize = 3;
    private static Integer countPage = 0;
    @Test
    public void testMul() {
        //自定义线程池！ 工作中只会使用 ThreadPoolExecutor
        List namesList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            namesList.add("zhangsan"+i);
        }
        countPage = namesList.size() / pageSize;
        if(namesList.size() % pageSize !=0){
            countPage++;
        }
        System.out.println(countPage);
        /**
         * 最大线程该如何定义（线程池的最大的大小如何设置！）
         * 1、CPU  密集型，几核，就是几，可以保持CPU的效率最高！
         */

        //获取电脑CPU核数
        System.out.println(Runtime.getRuntime().availableProcessors());    //8核

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,                                //核心线程池大小
                10000,   //最大核心线程池大小（CPU密集型，根据CPU核数设置）
                3,                              //超时了没有人调用就会释放
                TimeUnit.SECONDS,                             //超时单位
                new LinkedBlockingDeque<>(3),        //阻塞队列
                Executors.defaultThreadFactory(),             //线程工厂，创建线程的，一般不用动
                new ThreadPoolExecutor.AbortPolicy());        //银行满了，还有人进来，不处理这个人的，抛出异常

        try {
            //最大承载数，Deque + Max    (队列线程数+最大线程数)
            //超出 抛出 RejectedExecutionException 异常
            for (int i = 1; i <= 100; i++) {
                //使用了线程池之后，使用线程池来创建线程
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+" ok");
                    Integer m=0;
                    if((k+1) * pageSize<countPage){
                        m = (k+1) * pageSize;
                    }else{
                        m = namesList.size();
                    }
                        for (int j = k * pageSize; j < m ; j++) {
                            System.out.println("\t"+namesList.get(j));
                        }
                    k++;
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //线程池用完，程序结束，关闭线程池
            threadPool.shutdown();      //（为确保关闭，将关闭方法放入到finally中）
        }
    }

    @Test
    public void skka(){
        int[] array = {1, 2, 3, 4, 5};
        int[] targetArr = new int[5];
        System.arraycopy(array,1,targetArr,2,2);

        for (int i = 0; i < targetArr.length; i++) {
            System.out.println(targetArr[i]);
        }
    }


}
