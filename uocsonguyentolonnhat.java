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
public class uocsonguyentolonnhat {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long ans=0;
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    ans=i;
                    while(n%i==0){
                        n/=i;
                    }
                }
            }
            if(n>1) ans=n;
            System.out.println(ans);
        }
    }
}
