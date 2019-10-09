package com.example.hw1_q2;

public class MyClass {
    public static void main(String[] args) {
        MyRectangle2D myrect1 = new MyRectangle2D();
        MyRectangle2D myrect2 = new MyRectangle2D(1,1,3,3);

        System.out.println(myrect2.contains(myrect1));
        System.out.println(myrect2.overlaps(myrect1));
    }
}
