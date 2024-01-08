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
public class chuanhoaxauhoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String n = sc.nextLine();
            String s = "";
            int idex = 0;
            while(idex<n.length()){
                if(n.charAt(idex)==' '){
                    idex++;
                }
            }
            s = n.substring(idex, n.length()-1);
            //System.out.println(s);
            String[] a = s.toLowerCase().split("\\s+");
            for(String x : a){
                //System.out.println(x);
                System.out.print(Character.toUpperCase(x.charAt(0)));
                for(int i=1; i<x.length(); i++){
                    System.out.print(x.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

