///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codeptit.next;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
///**
// *
// * @author Dell
// */
//public class tenviettat {
//    public static void main(String[] args) throws IOException{
//        try {
//            Scanner sc = new Scanner(new File("DANHSACH.in"));
//            int n = Integer.parseInt(sc.nextLine());
//            String[] ds = new String[n];
//            String[] ds1 = new String[n];
//            for(int i=0; i<n; i++){
//                String s = sc.nextLine();
//                ds1[i] = s;
//                String[] arr = s.split("\\s+");
//                String tmp = "";
//                for(String x : arr){
//                    tmp+=x.charAt(0);
//                }
//                ds[i] = tmp;
//            }
//            int t = Integer.parseInt(sc.nextLine());
//            while(t-->0){
//                List<String> list = new ArrayList<>();
//                String s = sc.nextLine();
//                String[] arr = s.split("\\.");
////                for(int i=0; i<arr.length; i++){
////                    System.out.println(arr[i]);
////                }
//                for(int i=0; i<n; i++){
//                    int ok=1;
//                    for(int j=0; j<arr.length; j++){
//                        //System.out.println(arr[j]);
//                        if("*".equals(arr[j])) continue;
//                        else{
//                            if(arr[j].compareTo(""+ds[i].charAt(j))!=0){
//                                ok=0;
//                                break;
//                            }
//                        }
//                    }
//                    if(ok==1) list.add(ds1[i]);
//                }
//                Collections.sort(list, new Comparator<String>(){
//                    @Override
//                    public int compare(String o1, String o2) {
//                        String[] tmp1 = o1.split("\\s+");
//                        String[] tmp2 = o2.split("\\s+");
//                        if(tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1])==0){
//                            if(tmp1[0].compareTo(tmp2[0])<0) return -1;
//                            else return 1;
//                        }
//                        else{
//                            if(tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1])<0) return -1;
//                            else return 1;
//                        }
//                    }
//                    
//                });
//                for(String x : list){
//                    System.out.println(x);
//                }
//                //System.out.println("");
//            }
//        } catch(FileNotFoundException ex) {
//            
//        }
//    }
//}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.*;
import java.util.*;

class tensv implements Comparable<tensv> {

    private String ho, ten, tat,hoten;

    public tensv(String s) {
        this.hoten = s;
        String[] a = s.trim().split("\\s+");
        this.ho = a[0];
        this.ten = a[2];
        String tmp = "";
        for (String i : a) {
            tmp += i.charAt(0) + ".";
        }
        this.tat = tmp.substring(0, tmp.length()-1);
    }

    public int compareTo(tensv x) {
        if (ten.equals(x.ten)==false) {
            return ten.compareTo(x.ten);
        } else {
            return ho.compareTo(x.ho);
        }
    }
    public boolean compare(String s){
        if( s.length() != tat.length()){
            return false;
        }
        for( int i=0;i<s.length();i++){
            if( s.charAt(i)=='*'){
                continue;
            }
            if( s.charAt(i) != tat.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public String getTat() {
        return tat;
    }

    public String toString() {
        return hoten;
    }
}

public class tenVietTat {

    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<tensv> ans = new ArrayList<>();
        while (n-- > 0) {
            ans.add(new tensv(sc.nextLine()));
        }
        Collections.sort(ans);
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String s=sc.nextLine();
            for( tensv i: ans){
                if( i.compare(s)){
                    System.out.println(i);
                }
            }
        }
    }
}
