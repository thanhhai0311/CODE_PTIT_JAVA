/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class dayconcokphantutangdan {
    static void solve(int arr[], int res[], int k, int i, int j) {
        while (j <= arr.length - k + i) {
            res[i] = arr[j];
            if (i < k - 1) {
                solve(arr, res, k, i + 1, j + 1);
            } else if (i == k - 1) {
                for (int tmp = 0; tmp < k; tmp++) { //in
                    System.out.print(res[tmp] + " ");
                }
                System.out.println();
            }
            j++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int res[] = new int[k];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            solve(arr, res, k, 0, 0);
        }
    }
}
