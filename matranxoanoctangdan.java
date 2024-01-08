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
public class matranxoanoctangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*n];
        for(int i=0; i<n*n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] b = new int[n][n];
        int cnt = 0;
        int h1=0, h2=n-1, c1=0, c2=n-1;
        while(h1<=h2 && c1<=c2){
            for(int j=c1; j<=c2; j++){
                b[h1][j]=a[cnt++];
            }
            h1++;
            for(int i=h1; i<=h2; i++){
                b[i][c2]=a[cnt++];
            }
            c2--;
            if(c1<=c2){
                for(int j=c2; j>=c1; j--){
                    b[h2][j]=a[cnt++];
                }
                h2--;
            }
            if(h1<=h2){
                for(int i=h2; i>=h1; i--){
                    b[i][c1]=a[cnt++];
                }
                c1++;
            }
            
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
