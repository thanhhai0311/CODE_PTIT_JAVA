/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Dell
 */
public class daycontangdan {
    static int n; 
    static int[] a = new int[25];
    static int[] x = new int[25];
    static Vector<String> v = new Vector<>();
    
    static void Try(int i, int pos){
        for(int j=pos; j<=n; j++){
            if(a[j]>x[i-1]){
                x[i]=a[j];
                if(i>=2){
                    String s = "";
                    for(int k=1; k<=i; k++){
                        s += x[k] + " ";
                    }
                    v.add(s);
                }
                Try(i+1, j+1);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("DAYSO.in"));
            n = sc.nextInt();
            a[0] = 0;
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
            Try(1, 1);
            Collections.sort(v);
            for(String x : v){
                System.out.println(x);
            }
            
        } catch(FileNotFoundException ex){ 
            
        }
        
    }
}
