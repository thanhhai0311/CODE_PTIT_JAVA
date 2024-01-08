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
public class tonguocso {
    int[] prime = new int[1000];
    
    public static void Sang(){
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long tong=0;
        while(t-->0){
            int n = sc.nextInt();
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    while(n%i==0){
                        tong+=i;
                        n/=i;
                    }
                }
            }
            if(n>1) tong+=n;
        }
        System.out.println(tong);
    }
}
