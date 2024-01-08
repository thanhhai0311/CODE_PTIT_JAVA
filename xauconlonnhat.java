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
public class xauconlonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char k = 'a';
        String ans = "";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)>=k){
                k=s.charAt(i);
                ans+=s.charAt(i);
            }
        }
        for(int i = ans.length()-1; i>=0; i--){
            System.out.print(ans.charAt(i));
        }
    }
}
