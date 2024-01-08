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
public class dayuuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split(" ");//tách theo nhiều dấu cách

            int[] b = new int[a.length];
            int c = 0, l = 0, n = a.length;
            for (int i = 0; i < a.length; i++) {
                b[i] = Integer.parseInt(a[i]);
                if (b[i] % 2 == 0) {
                    c++;
                } else {
                    l++;
                }
            }
            if (n % 2 == 0 && c - l > 0) {
                System.out.println("YES");
            } else if (n % 2 == 1 && l - c > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
