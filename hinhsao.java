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
public class hinhsao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[100001];
        int dem1 = 0;
        int dem2 = 0;
        for(int t=1; t<n; t++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            cnt[x]++;
            cnt[y]++;
        }
        for(int i=1; i<=n; i++){
            if(cnt[i]==n-1) dem1++;
            if(cnt[i]==1) dem2++;
        }
        if(dem1==1 && dem2==n-1) System.out.println("Yes");
        else System.out.println("No");
    }
}
