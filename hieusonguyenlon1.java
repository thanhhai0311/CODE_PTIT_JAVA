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
public class hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger tmp;
            BigInteger ans;
            if(a.compareTo(b)>0){
                tmp = a;
                ans = a.subtract(b);
            }
            else{
                tmp = b;
                ans = b.subtract(a);
            }
            if(ans.toString().length()==tmp.toString().length()){
                System.out.println(ans);
            }
            else{
                System.out.println("0" + ans);
            }
        }
    }
}
