package com.zhangjun.guli.common.utils;

public class TryDemo {

    public static void testTry() throws Exception {
        if(1==1){
            throw new Exception("1 == 1");
        }
    }

    public static void demo() throws Exception {
        try {
            testTry();
        }catch (Exception e){
            e.getCause().printStackTrace();
        }
        System.out.println("2222222222222");
    }

    public static void aaa() throws Exception {
        demo();
        System.out.println("1111111111111");
    }

    public static void main(String[] args) throws Exception {
        aaa();
    }
}
