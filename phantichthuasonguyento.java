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
public class phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            System.out.printf("Test " + tc + ": ");
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    int dem=0;
                    while(n%i==0){
                        dem++;
                        n/=i;
                    }
                    System.out.printf(i + "(" + dem + ") ");
                }
            }
            if(n>1) System.out.printf(n + "(1)");
            System.out.println("");
        }
    }
}
