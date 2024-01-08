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
public class sodep2 {
    
    public static int check1(String s){
        for(int i=0; i<=s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return 0;
            }
        }
        return 1;
    }
    
    public static int check2(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += (s.charAt(i)-'0');
        }
        if(s.charAt(s.length()-1)!='8') return 0;
        if(sum%10!=0) return 0;
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check1(s)==1 && check2(s)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
