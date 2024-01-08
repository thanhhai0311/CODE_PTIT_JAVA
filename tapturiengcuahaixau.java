/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Dell
 */
public class tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            String s1 = sc.nextLine();
            String[] arr1 = s1.split("\\s+");
            for(String x : arr1){
                set1.add(x);
            }
            String s2 = sc.nextLine();
            String[] arr2 = s2.split("\\s+");
            for(String x : arr2){
                set2.add(x);
            }
            for(String x : set1){
                if(!set2.contains(x)){
                    System.out.print(x + " ");
                }
            }
            System.out.println("");
        }
    }
}
