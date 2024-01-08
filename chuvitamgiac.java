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

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
    
    public double distance(Point b){
        double ans = Math.sqrt((this.x-b.x)*(this.x-b.x)+(this.y-b.y)*(this.y-b.y));
        return ans;
    }
}

public class chuvitamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double a1 = sc.nextDouble();
            double a2 = sc.nextDouble();
            double a3 = sc.nextDouble();
            double a4 = sc.nextDouble();
            double a5 = sc.nextDouble();
            double a6 = sc.nextDouble();
            Point a = new Point(a1, a2);
            Point b = new Point(a3, a4);
            Point c = new Point(a5, a6);
            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = b.distance(c);
            if(ab>0 && ac>0 && bc>0 && ab+ac>bc && ab+bc>ac && ac+bc>ab){
                System.out.println(String.format("%.3f", ab+ac+bc));
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
