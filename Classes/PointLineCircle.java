package Classes;
import java.lang.Math;


//2019 kanoniki/theme 3

class Point{
    private  int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distanceFrom(Point p){
        return Math.sqrt((p.getX()-this.x)*(p.getX()-this.x) + (p.getY()-this.y)*(p.getY()-this.y));
    }  
    public String toString(){
        return "oi sintetagmenes toy simeioy einai" + this.x + ", " + this.y;
    }
}

class LS{
    private Point a;
    private Point b;
    
    public LS(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    public Point getFirstEndPoint(){
        return this.a;
    }
    public Point getSecondEndPoint(){
        return this.b;
    }
    public double length(){
        return this.a.distanceFrom(this.b);
    }
    public boolean isParallelToX(){
        if(this.a.getY() == this.b.getY()){
            return true;
        }
        return false;
    }
    public boolean isLonger(LS x){
        if( x.length()< this.length()){
            return true;
        }
        return false;
    }

}

class Circle{
    private double r;
    private Point center;
    
    public Circle(double r, Point center){
        this.r = r;
        this.center = center;
    }
    public Point getCenter(){
        return this.center;
    }
    public double getRadius(){
        return this.r;
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
    public boolean intersectsWith(Circle c){
        if( Math.abs(this.r - c.getRadius()) <= this.center.distanceFrom(c.getCenter()) && this.center.distanceFrom(c.getCenter()) <= this.r + c.getRadius()){
            return true;
        }
        return false;
    }
    public String toString(){
        return "o kiklos exei kentro" + center.toString() + "kai aktina" + r;
    }
}

public class PointLineCircle {

    public static void main(String[] args){
        Point a = new Point(0,0);
        Point b = new Point(5,4);
        LS ab = new LS(a,b);
        System.out.println(ab.length());
        System.out.println(ab.isParallelToX());
        b.setY(0);
        System.out.println(ab.isParallelToX());
        ab.getSecondEndPoint().setY(0);
    }

      
}