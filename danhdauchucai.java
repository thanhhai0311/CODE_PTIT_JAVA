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
public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for(int i=0; i<s.length(); i++){
            cnt[s.charAt(i)-'0']=1;
        }
        int dem=0;
        for(int i=0; i<256; i++){
            if(cnt[i]==1) dem++;
        }
        System.out.println(dem);
    }
}
