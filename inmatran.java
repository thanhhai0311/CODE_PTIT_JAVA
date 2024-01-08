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
public class inmatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int i=0;
            while(i<n){
                if(i%2==0){
                    for(int j=0; j<n; j++){
                        System.out.print(a[i][j] + " ");
                    }
                    i++;
                }
                else{
                    for(int j=n-1; j>=0; j--){
                        System.out.print(a[i][j] + " ");
                    }
                    i++;
                }
            }
            System.out.println("");
        }
    }
}
