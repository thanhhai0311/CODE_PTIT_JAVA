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
public class diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int tongphai=0;
            int ok=0;
            for(int i=1; i<n; i++){
                tongphai+=a[i-1];
                if(tongphai*2==sum-a[i]){
                    System.out.println(i+1);
                    ok=1;
                    break;
                }
            }
            if(ok==0) System.out.println("-1");
        }
    }
}
