/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dell
 */
public class bobasopytago {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            long[] a = new long[n];
//            //Set<Integer> set = new TreeSet<>();
//            //ArrayList<Integer> arr = new ArrayList<>();
//            for(int i=0; i<n; i++){
//                a[i] = sc.nextLong();
//                a[i] = a[i]*a[i];
//                //set.add(a[i]*a[i]);
//                //arr.add(a[i]*a[i]);
//            }
//            int ok=0;
//            Arrays.sort(a);
//            for(int i=0; i<n; i++){
//                for(int j=i+1; j<n; j++){
//                    long k = a[i]+a[j];
//                    if(Math.sqrt(k) != (long) Math.sqrt(k)) break;
//                    if(Arrays.binarySearch(a, k)>j){
//                        ok=1;
//                        break;
//                    }
//                }
//            }
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
            int n = sc.nextInt(), ok = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long k = (long) Math.sqrt(a[i] * a[i] + a[j] * a[j]);
                    if (k * k != a[i] * a[i] + a[j] * a[j]) {
                        break;
                    }
                    if (Arrays.binarySearch(a, k) > 0) {
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
