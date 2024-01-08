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
public class catdoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine(); 
            int ok=1;
            char[] a = s.toCharArray();
            for(int i=0; i<s.length(); i++){
                if(a[i]!='0' && a[i]!='1' && a[i]!='8' && a[i]!='9'){
                    ok=0;
                    break;
                }
                else{
                    if(a[i]=='8' || a[i]=='9') a[i]='0';
                }
            }
            int i=0;
            while(i<s.length() && a[i]=='0'){
                i++;
            }
            if(ok==0 || i==s.length()) System.out.println("INVALID");
            else{
                for(int j=i; j<s.length(); j++){
                    System.out.print(a[j]);
                }
                System.out.println("");
            }
        }
    }
}
