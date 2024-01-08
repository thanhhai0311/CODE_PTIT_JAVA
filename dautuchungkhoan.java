/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Dell
 */
public class dautuchungkhoan {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            int[] a = new int[n];
//            for(int i=0; i<n; i++){
//                a[i] = sc.nextInt();
//            }
//            Stack<Integer> st = new Stack<>();
//            int[] cnt = new int[n];
//            for(int i=0; i<n; i++){
//                cnt[i]=1;
//            }
//            System.out.print(cnt[0] + " ");
//            for(int i=1; i<n; i++){
//                for(int j=0; j<=i; j++){
//                    if(a[i]>a[j]){
//                        cnt[i] = cnt[i]+cnt[j];
//                        cnt[j]=0;
//                    }
//                }
//                System.out.print(cnt[i]+ " ");
//            }
//            System.out.println("");
//        }
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            a[0] = 1000000000;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for (int i = 1; i <= n; i++) {
                while (st.size() > 0 && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                System.out.print(i - st.peek() + " ");
                st.push(i);
            }
            System.out.println();
        }
    }
}

