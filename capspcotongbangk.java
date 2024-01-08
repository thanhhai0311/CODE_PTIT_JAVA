/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Dell
 */
public class capspcotongbangk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            Map<Long, Integer> map = new TreeMap<>();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
                if(map.containsKey(a[i])){
                    map.put(a[i], map.get(a[i])+1);
                }
                else{
                    map.put(a[i], 1);
                }
            }
            long ans=0;
            for(long x : a){
                long tmp = k-x;
                if(map.containsKey(tmp)){
                    if(tmp==x){
                        ans+=map.get(tmp)-1;
                    }
                    else{
                        ans+=map.get(tmp);
                    }
                }
            }
            System.out.println(ans/2);
        }
    }
}
