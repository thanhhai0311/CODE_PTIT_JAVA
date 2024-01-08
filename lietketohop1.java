///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codeptit.next;
//
//import java.util.Scanner;
//
///**
// *
// * @author Dell
// */
//public class lietketohop1 {
//    static int ok;
//    static int[] a;
//    static int n, k;
//    
//    public static void khoitao(){
//        for(int i=1; i<=k; i++){
//            a[i]=i;
//        }
//    }
//    
//    public static void sinh(){
//        int i=k;
//        while(i>0 && a[i]==n-k+i){
//            i--;
//        }
//        if(i==0) ok=1;
//        else{
//            a[i]++;
//            for(int j=i+1; j<=k; j++){
//                a[j]=a[j-1]+1;
//            }
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        k = sc.nextInt();
//        a = new int[k+1];
//        khoitao();
//        ok=0;
//        int dem=0;
//        while(ok==0){
//            dem++;
//            for(int i=1; i<=k; i++){
//                System.out.print(a[i]+" ");
//            }
//            sinh();
//            System.out.println("");
//        }
//        System.out.println("Tong cong co " + dem + " to hop");
//    }
//}


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
public class lietketohop1 {
    static int ok;
    static int[] a;
    static int n, k;
    
    public static void khoitao(){
        for(int i=1; i<=k; i++){
            a[i]=i;
        }
    }
    
    public static void sinh(){
        int i=k;
        while(i>0 && a[i]==n-k+i){
            i--;
        }
        if(i==0) ok=1;
        else{
            a[i]++;
            for(int j=i+1; j<=k; j++){
                a[j]=a[j-1]+1;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[k+1];
        khoitao();
        ok=0;
        int dem=0;
        while(ok==0){
            dem++;
            for(int i=1; i<=k; i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            sinh();
        }
        System.out.println("");
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
