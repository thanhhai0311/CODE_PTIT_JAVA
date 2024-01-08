/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class songuyento {
    public static int ngto(int n){
        if(n<2) return 0;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(ngto(n)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
