package me.freedom4live.patterns.java.adapter;

public class AdaptorSqrt {

    public static int sqrt(int number) {
        return (int) AdapteeSqrt.sqrt(number);
    }

}
