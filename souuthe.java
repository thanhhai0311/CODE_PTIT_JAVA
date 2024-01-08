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
public class souuthe {
    public static String check(String s){
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return "INVALID";
            }
        }
        int demchan = 0;
        int demle = 0;
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)-'0')%2==0) demchan+=1;
            else demle+=1;
        }
        if(s.length()%2==0 && demchan>demle) return "YES";
        if(s.length()%2!=0 && demle>demchan) return "YES";
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(check(s));
        }
        
    }
}

