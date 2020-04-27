package com.company;

public class AdaRunnable implements  Runnable{

    @Override
    public void run() {
        try {
            System.out.println("AdaRunnable çalışmaya başladı: Thread adı: "+Thread.currentThread().getName());

            Thread.sleep(10000);

            System.out.println("AdaRunnable çalışmayı bitirdi: Thread adı: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();}
    }
}
