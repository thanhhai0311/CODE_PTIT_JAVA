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
public class sotamphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int ok=1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2'){
                    ok=0;
                    break;
                }
            }
            if(ok==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
