package com.example.hw1_q3;

public class TestLinearEquation {
    public static void main(String[] args) {
        double a=1.0; double b=2.0; double c=3.0;
        double d=5.0; double e=6.0; double f=7.0;

        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
        if (equation.isSolvable()){
            System.out.println("x = "+ equation.getX()+"y= "+ equation.getY());
        }
        else{
            System.out.println("No solution");
        }
    }
}
