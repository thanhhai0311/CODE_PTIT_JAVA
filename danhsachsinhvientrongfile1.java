/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getTen() {
        String s = this.ten;
        String[] arr = s.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String x : arr){
            ans+=Character.toUpperCase(x.charAt(0));
            ans+=x.substring(1);
            ans+=" ";
        }
        ans=ans.substring(0, ans.length()-1);
        return ans;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + this.lop + " " + this.email;
    }
    
    
}

public class danhsachsinhvientrongfile1 {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            SinhVien[] ds = new SinhVien[n];
            for(int i=0; i<n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String email = sc.nextLine();
                ds[i] = new SinhVien(ma, ten, lop, email);
            }
            Arrays.sort(ds, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    if(o1.getMa().compareTo(o2.getMa())<0){
                        return -1;
                    }
                    else return 1;
                }
                
            });
            for(SinhVien x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
