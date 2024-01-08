/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
class Point {
    private float x, y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc) {
        float nx = sc.nextFloat();
        float ny = sc.nextFloat();
        return new Point(nx, ny);
    }
    
    public float distance(Point a) {
        return (float) Math.sqrt((this.x-a.x)*(this.x-a.x) + (this.y-a.y)*(this.y-a.y));
    }
}

class Triangle {
    private Point a, b, c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid() {
        float ab = this.a.distance(b);
        float ac = this.a.distance(c);
        float bc = this.b.distance(c);
        if(ab>0 && ac>0 && bc>0 && ab+ac>bc && ab+bc>ac && ac+bc>ab){
            return true;
        }
        return false;
    }
    
    public String getPerimeter() {
        float ab = this.a.distance(b);
        float ac = this.a.distance(c);
        float bc = this.b.distance(c);
        return String.format("%.3f", ab+ac+bc);
    }
}

public class lopTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
 
}
