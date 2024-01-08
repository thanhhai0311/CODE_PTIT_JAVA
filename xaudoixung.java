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
public class xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int n = s.length();
            String s1 = "", s2= "";
            if(n%2==0){
                s1 = s.substring(0, (n/2));
                s2 = s.substring((n/2), n);
                StringBuilder tmp = new StringBuilder(s2);
                s2 = tmp.reverse().toString();
            }
            else{
                s1 = s.substring(0, (n/2));
                s2 = s.substring((n/2)+1, n);
                StringBuilder tmp = new StringBuilder(s2);
                s2 = tmp.reverse().toString();
            }
            int dem=0;
            for(int i=0; i<n/2; i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    dem++;
                }
            }
            if((n%2==0 && dem==1) || (n%2!=0 && dem<=1)) System.out.println("YES");
            else System.out.println("NO");
            //System.out.println(s1);
            //System.out.println(s2);
        }
    }
}
