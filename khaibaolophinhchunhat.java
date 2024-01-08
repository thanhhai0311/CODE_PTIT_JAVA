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

class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        String tmp = this.color.toLowerCase().substring(2);
        String ans = "" + Character.toUpperCase(this.color.charAt(1));
        String res = ""+ans+tmp;
        return res;
        //return res;
    }
    
    public double findArea() {
        return this.height * this.width;
    }
    
    public double findPerimeter() {
        return (this.height+this.width)*2;
    }
    
}

public class khaibaolophinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hight = sc.nextDouble();
        double weight = sc.nextDouble();
        String color = sc.nextLine();
        if(hight<=0 || weight<=0) System.out.println("INVALID");
        else{
            Rectange hcn = new Rectange(hight, weight, color);
            System.out.println((int)hcn.findPerimeter() + " " + (int)hcn.findArea() + " " + hcn.getColor());
            String s = hcn.getColor();
        }
    }
}
