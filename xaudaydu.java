/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class xaudaydu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            Set<Character> set = new HashSet<>();
            for(int i=0; i<s.length(); i++){
                set.add(s.charAt(i));
            }
            if(s.length()<26 || (26-set.size())>k){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
