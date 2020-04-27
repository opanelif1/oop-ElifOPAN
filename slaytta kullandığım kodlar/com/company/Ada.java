package com.company;

public class Ada extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Ada sınıfı çalışmaya başladı: Thread adı: "+Thread.currentThread().getName());

            Thread.sleep(10000);

            System.out.println("Ada sınıfı çalışmayı bitirdi: Thread adı: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
