/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class dayconcotongle {
    static int n;
    static int[] a = new int[200];
    static int[] X = new int[200];
    static List<String> v = new ArrayList<>();

    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            X[i] = j;
            if (i == n) {
                StringBuilder temp = new StringBuilder();
                int sum = 0;
                for (int k = 1; k <= n; k++) {
                    if (X[k] == 1) {
                        temp.append(a[k]).append(" ");
                        sum += a[k];
                    }
                }
                if (sum % 2 != 0) {
                    v.add(temp.toString().trim());
                }
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n + 1);
            for (int i = 1, j = n; i < j; i++, j--) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            v.clear();
            Try(1);
            //Collections.sort(v);
            for (String x : v) {
                System.out.println(x);
            }
        }
    }
}
