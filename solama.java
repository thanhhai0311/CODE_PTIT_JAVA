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
public class solama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lama = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] so = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){  
            int ans = 0;
            String s = sc.nextLine();
            while(!s.isEmpty()){ 
                for(int i=0; i<13; i++){
                    if(s.startsWith(lama[i])){
                        ans+=so[i];
                        s = s.substring(lama[i].length());
                        continue;
                    }   
                }
            }
            System.out.println(ans);
        }
    }
}
