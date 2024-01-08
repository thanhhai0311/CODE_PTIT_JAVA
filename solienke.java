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
public class solienke {
    public static int check(String s){
        for(int i=0; i<s.length()-1; i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))!=1) return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
