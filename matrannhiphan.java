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
public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0; i<n; i++){
            int dem=0;
            for(int j=0; j<3; j++){
                if(a[i][j]==1){
                    dem++;
                }
            }
            if(dem>3/2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
