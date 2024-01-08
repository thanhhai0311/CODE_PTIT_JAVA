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
public class tonguocso1 {
    static int prime[] = new int[2000001];
    
    public static void sang(){
        for(int i=2; i<Math.sqrt(2000001); i++){
            if(prime[i]==0){
                for(int j=i*i; j<2000001; j+=i){
                    prime[j]=i;
                }
            }
        }
        for(int i=2; i<2000001; i++){
            if(prime[i]==0){
                prime[i]=i;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        long sum=0;
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            while(n!=1){
                sum+=prime[n];
                n/=prime[n];
            }
        }
        System.out.println(sum);
    }
}
