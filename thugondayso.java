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
public class thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=1; i<n; i++){
            if(a[i]!=0 && a[i-1]!=0){
                sum = sum + a[i] + a[i-1];
                if(sum%2==0){
                    a[i]=0;
                    a[i-1]=0;
                }
                sum=0;
            }
        }
        int dem=0;
        for(int i=0; i<n; i++){
            if(a[i]!=0) dem++;
        }
        System.out.println(dem);
    }
}
