package org.example;

public class Point {
    private  int x;
    private  int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return  x;
    }
    public int getY(){
        return  y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        double result = Math.sqrt((x*x) +(y*y));

        return Math.floor(result);
    }

    public double distance(int a,int b){
    int distX=this.x-a;
    int distY=this.y-b;
    double result = Math.sqrt((distX*distX) + (distY*distY));
    return result;
    }

    public double distance(Point p ){
        int x=p.getX();
        int y=p.getY();
        int distX=this.x-x;
        int distY=this.y-y;
        double res=Math.sqrt((distX*distX)+(distY*distY));
        return res;
    }
}
