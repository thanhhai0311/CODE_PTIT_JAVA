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
public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[201];
        int max = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i]>max) max = a[i];
            cnt[a[i]]=1;
        }
        int ok=0;
        for(int i=1; i<=max; i++){
            if(cnt[i]!=1){
                ok=1;
                System.out.println(i);
            }
        }
        if(ok==0) System.out.println("Excellent!");
    }
}
