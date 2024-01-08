/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class chiahetcho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            if(a.mod(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO)==0){
                System.out.println("1");
            }
            else System.out.println("0");
        }
    }
}
