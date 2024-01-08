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
public class dienthoaicucgach {
    public static int check1(String s){
        for(int i=0; i<=s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String ans = "";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='b' || s.charAt(i)=='c') ans+='2';
                if(s.charAt(i)=='d' || s.charAt(i)=='e' || s.charAt(i)=='f') ans+='3';
                if(s.charAt(i)=='g' || s.charAt(i)=='h' || s.charAt(i)=='i') ans+='4';
                if(s.charAt(i)=='j' || s.charAt(i)=='k' || s.charAt(i)=='l') ans+='5';
                if(s.charAt(i)=='m' || s.charAt(i)=='n' || s.charAt(i)=='o') ans+='6';
                if(s.charAt(i)=='p' || s.charAt(i)=='q' || s.charAt(i)=='r' || s.charAt(i)=='s') ans+='7';
                if(s.charAt(i)=='t' || s.charAt(i)=='u' || s.charAt(i)=='v') ans+='8';
                if(s.charAt(i)=='w' || s.charAt(i)=='x' || s.charAt(i)=='y' || s.charAt(i)=='z') ans+='9';
            }
            if(check1(ans)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
