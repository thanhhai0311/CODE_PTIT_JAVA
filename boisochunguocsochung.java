/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class boisochunguocsochung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ucln, bcnn;
            long tich = a*b;
            while(b!=0){
                long r = a%b;
                a=b;
                b=r;
            }
            ucln=a;
            bcnn=tich/ucln;
            System.out.println(bcnn + " " + ucln);
        }
    }
}
