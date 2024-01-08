/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class tonggiaithua {
    public static long gt(int n){
        long tich=1;
        for(int i=2; i<=n; i++){
            tich*=i;
        }
        return tich;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong=0;
        for(int i=1; i<=n; i++){
            tong+=gt(i);
        }
        System.out.println(tong);
    }
}
