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
public class chiahet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.mod(b).compareTo(BigInteger.ZERO)==0 || b.mod(a).compareTo(BigInteger.ZERO)==0) System.out.println("YES");
            else System.out.println("NO");
            //System.out.println(BigInteger.ZERO);
        }
    }
}
