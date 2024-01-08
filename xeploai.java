/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class SinhVien {
    private String ma, ten;
    private float diemLT, diemTH, diemThi;
    public static int cnt = 1;

    public SinhVien() {
    }

    public SinhVien(String ten, float diemLT, float diemTH, float diemThi) {
        this.ma = "SV" + String.format("%02d", cnt);
        this.ten = ten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemThi = diemThi;
        cnt++;
    }
    
    public String getTen() {
        String s = this.ten.trim().toLowerCase();
        String[] arr = s.split("\\s+");
        String ans = "";
        for(String x : arr){
            ans+=Character.toUpperCase(x.charAt(0));
            ans+=x.substring(1);
            ans+=" ";
        }
        return ans.substring(0, ans.length()-1);
    }
    
    public float diemTK() {
        return (float) (this.diemLT*0.25 + this.diemTH*0.35 + this.diemThi*0.4);
    }
    
    public String xepHang() {
        if(this.diemTK()>=8) return "GIOI";
        else if(this.diemTK()>=6.5) return "KHA";
        else if(this.diemTK()>=5) return "TRUNG BINH";
        else return "KEM";
    }

    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + String.format("%.2f", this.diemTK()) + " " + this.xepHang();
    }
}

public class xeploai {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("BANGDIEM.in"));
            int n = Integer.parseInt(sc.nextLine());
            SinhVien[] ds = new SinhVien[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                float diemLT = Float.parseFloat(sc.nextLine());
                float diemTH = Float.parseFloat(sc.nextLine());
                float diemThi = Float.parseFloat(sc.nextLine());
                ds[i] = new SinhVien(ten, diemLT, diemTH, diemThi);
            }
            Arrays.sort(ds, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    if(o1.diemTK() > o2.diemTK()) return -1;
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
