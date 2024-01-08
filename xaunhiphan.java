/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class xaunhiphan {
    static long[] fibo = new long[93];
    
    public static void khoitao(){
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3; i<93; i++){
            fibo[i]=fibo[i-2]+fibo[i-1];
        }
    }
    
    public static char Try(int n, long k){
        if(n==1) return '0';
        if(n==2) return '1';
        if(k<=fibo[n-2]){
            return Try(n-2, k);
        }
        if(k>fibo[n-2]){
            return Try(n-1, k-fibo[n-2]);
        }
        return 0;
    }
    
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int t = sc.nextInt();
//        ArrayList<String> arr = new ArrayList<>();
//        int idex = 0;
//        arr.add("0");
//        arr.add("0");
//        arr.add("1");
//        for(int i=3; i<10; i++){
//            String tmp = arr.get(i-2).concat(arr.get(i-1));
//            arr.add(tmp);
//        }
//        while(t-->0){
//            int n, k;
//            n = sc.nextInt();
//            k = sc.nextInt();
//            k--;
//            System.out.println(arr.get(n).charAt(k));
//        }

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        khoitao();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
