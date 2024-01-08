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
public class tinhluythua {
    //int const mod = (int) (1e9+7);
    static final long mod = (long)(1e9+7);
   
    public static long solve(long a, long b){
        if(b==0) return 1;
        if(b==1) return a;
        long ans = (long) (solve(a, b/2)%mod);
        if(b%2==0) return (long) (ans%mod*ans%mod)%mod;
        else return (long) (ans%mod*ans%mod*a%mod)%mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0 && b==0) return;
            System.out.println(solve(a, b));
        }
    }
}
