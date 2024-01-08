/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class xaukhacnhaudainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.compareTo(b)==0){
                System.out.println("-1");
            }
            else{
                System.out.println(max(a.length(), b.length()))
                        
                        ;
            }
        }
    }
}
