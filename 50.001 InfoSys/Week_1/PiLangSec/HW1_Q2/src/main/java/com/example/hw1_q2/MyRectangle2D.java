package com.example.hw1_q2;

public class MyRectangle2D {
    private double x,y;
    private double width,height;

    MyRectangle2D(){
        this.x=0;
        this.y=0;
        this.height=1;
        this.width=1;
    }

    MyRectangle2D(double X, double Y, double width, double height){
        this.x=X;
        this.y=Y;
        this.height=height;
        this.width=width;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return 2*this.height+2*this.width;
    }

    public boolean contains(double x, double y){
        double limit_y=this.height/(double)2;
        double limit_x=this.width/(double)2;

        if (x<this.x+limit_x && x>this.x-limit_x){
            if (y<this.y+limit_y && x>this.y-limit_y){
                return true;
            }
        }
        return false;
    }

    public boolean contains(MyRectangle2D r){
        double limit_other_y=r.height/(double)2;
        double limit_other_x=r.width/(double)2;

        if (this.contains((r.x-limit_other_x), (r.y+limit_other_y))){
            if (this.contains((r.x+limit_other_x), (r.y-limit_other_y))){
                return true;
            }
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D r){
        double limit_other_y=r.height/(double)2;
        double limit_other_x=r.width/(double)2;


        return ((this.contains((r.x-limit_other_x), (r.y+limit_other_y))) || (this.contains((r.x+limit_other_x), (r.y-limit_other_y))));

    }
}
