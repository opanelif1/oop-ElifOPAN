package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("program başlatıldı "+Thread.currentThread().getName());

        Ada ada1=new Ada();
        ada1.setName("ADA SINIFI THREADİ:");
        ada1.start();

        AdaRunnable adaRunnable=new AdaRunnable();
        Thread ada2=new Thread(adaRunnable);
        ada2.setName("ADARUNNABLE THREADI:");
        ada2.start();

        System.out.println("program bitti...");

    }
}
