/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class sapxepmatran {
    public static int[][] chuyenVi(int n, int m, int[][] a){
        int[][] ans = new int[m][n];
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                ans[j][i] = a[i][j]; 
            }
        }
        return ans;
    }
    
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("MATRIX.in"));
            int t = Integer.parseInt(sc.nextLine());
            while(t-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                //System.out.println(n + " " + m + " " + k);
                int[][] a = new int[n][m];
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        a[i][j] = sc.nextInt();
                        
                    }
                }
                int[][] b = chuyenVi(n, m, a);
                Arrays.sort(b[k-1]);
                int[][] ans = chuyenVi(m, n, b);
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        System.out.print(ans[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
