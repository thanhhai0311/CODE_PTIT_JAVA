/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class khoangcachnhohonk {
    public static int lowerBound(int[] a, int l, int r, int k){ // tìm vị trí đầu tiên >=k
        int res=-1;
        while(l<=r){
            int m = (l+r)/2;
            if(a[m]>=k){
                res=m;
                r=m-1;
            }
            else l=m+1;
        }
        return res;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           int k = sc.nextInt();
           int[] a = new int[n];
           for(int i=0; i<n; i++){
               a[i] = sc.nextInt();
           }
           long ans=0;
           Arrays.sort(a);
           for(int i=0; i<n; i++){
               int res = lowerBound(a, i+1, n-1, a[i]+k);
               if(res==-1) ans+=n-i-1;
               else{
                   ans += res-i-1;
               }
           }
           System.out.println(ans);
       }
    }
}
