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
public class boisochungnhonhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger tich = a.multiply(b);
            BigInteger c = a.gcd(b);
            System.out.println(tich.divide(c));
        }
    }
}
