package com.example.hw1_q3;

public class LinearEquation {
    private double a,b,c,d,e,f;

    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public double getA() {return this.a; }

    public double getB() {
        return this.b;
    }

    public double getC() {return this.c; }

    public double getD() {
        return this.d;
    }

    public double getE() {
        return this.e;
    }

    public double getF() {
        return this.f;
    }

    private double computeDet(){
        return (this.getA()*this.getE() - this.getB()*this.getD());
    }

    public boolean isSolvable(){
        return (computeDet()!=0);
    }

    public double getX(){
        return (this.e*this.c-this.b*this.f)/computeDet();
    }

    public double getY(){
        return (this.a*this.f-this.d*this.c)/computeDet();
    }
}
