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
public class uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int dem=0;
            for(int i=1; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    if(i%2==0) dem++;
                    if((n/i)%2==0 && (n/i)!=i) dem++;
                }
            }
            System.out.println(dem);
        }
    }
}
