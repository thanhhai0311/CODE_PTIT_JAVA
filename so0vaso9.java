/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class so0vaso9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Queue<String> q = new LinkedList<>();
            q.add("9");
            long n = sc.nextLong();
            while(true) {
                //String n = sc.next();
                String s = q.poll();
                //System.out.println(s);
                //BigInteger a = new BigInteger(s);
                long a = Long.parseLong(s);
//                if(a.mod(new BigInteger(n)).compareTo(BigInteger.ZERO)==0){
//                    System.out.println(s);
//                    break;
//                }
                if(a%n==0){
                    System.out.println(a);
                    break;
                }
                else{
                    q.add(s+"0");
                    q.add(s+"9");
                }
            }
        }
    }
}
