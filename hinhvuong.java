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
public class hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int x = Math.min(a1, a2);
        int y = Math.min(b1, b2);
        int z = Math.max(c1, c2);
        int t = Math.max(d1, d2);
        int canh = Math.max(Math.abs(x-z), Math.abs(y-t));
        System.out.println(canh*canh);
    }
}
