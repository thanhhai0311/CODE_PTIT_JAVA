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
public class giaocua2dayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int[] cnt = new int[1001];
        for(int i=0; i<1001; i++){
            cnt[i]=0;
        }
        for(int i=0; i<n; i++){
            if(cnt[a[i]]==0){
                cnt[a[i]]=1;
                for(int j=0; j<m; j++){
                    if(a[i] == b[j]){
                        System.out.print(a[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}
