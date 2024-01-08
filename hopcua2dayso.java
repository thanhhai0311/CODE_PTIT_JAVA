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
public class hopcua2dayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            set1.add(x);
        }
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            set2.add(x);
        }
        TreeSet<Integer> set3 = new TreeSet<>();
        for(Integer x : set1){
            set3.add(x);
        }
        for(Integer x : set2){
            set3.add(x);
        }
        for(Integer x : set3){
            System.out.printf(x + " ");
        }
    }
}
