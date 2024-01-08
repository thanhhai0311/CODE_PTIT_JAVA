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
   private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
   
    public double distance(Point p2) {
        return Math.sqrt((this.x-p2.x)*(this.x-p2.x) + (this.y-p2.y)*(this.y-p2.y));
    }
    
//    public double distance(Point p1, Point p2) {
//        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
//    }
    
    
    
}  
public class dientichhinhtronngoaitieptamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        int t = sc.nextInt();
        while(t-->0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point a = new Point(x1, y1);
            Point b = new Point(x2, y2);
            Point c = new Point(x3, y3);
            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = b.distance(c);
            if(ab>0 && ac>0 && bc>0 && ab+ac>bc && ab+bc>ac && ac+bc>ab) {
                double s = Math.sqrt((ab+ac+bc)*(ab+ac-bc)*(ab+bc-ac)*(ac+bc-ab))/4;
                double r = (ab*ac*bc)/(4*s);
                System.out.println(String.format("%.3f", r*r*pi));
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
