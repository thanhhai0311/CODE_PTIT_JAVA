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
public class chiatamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for(int i=1; i<n; i++){
                System.out.printf("%.6f ", h * Math.sqrt(i/n));
            }
            System.out.println();
        }
    }
}
