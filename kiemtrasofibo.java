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
public class kiemtrasofibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[93];
        a[0]=0;
        a[1]=1;
        for(int i=2; i<93; i++){
            a[i]=a[i-1]+a[i-2];
        }
        int t = sc.nextInt();
        while(t-->0){
            int ok=0;
            long n = sc.nextLong();
            for(int i=0; i<93; i++){
                if(a[i]==n){
                    ok=1;
                    break;
                }
            }
            if(ok==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
