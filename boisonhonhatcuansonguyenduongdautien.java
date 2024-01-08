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
public class boisonhonhatcuansonguyenduongdautien {
    public static long bcnn(long a, long b){
        long tich = a*b;
        while(b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return tich/a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long ans=1;
            for(int i=2; i<=n; i++){
                ans = bcnn(ans, i);
            }
            System.out.println(ans);
        }
    }
}
