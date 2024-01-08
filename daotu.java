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
public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x : arr){
                StringBuilder tmp = new StringBuilder(x);
                System.out.print(tmp.reverse().toString() + " ");
            }
            System.out.println("");
        }
    }
}
