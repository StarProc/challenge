package com.sckim.starproc.study;

public interface MyRunnable {

    void run();

    // 1.8 부터 추가된, 인터페이스 default method 접근 제어자
    default void runImpl() {
        System.out.println("run start");
        run();
    }
}
