/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class SinhVien {
    private String ma, ten, ns, lop;
    private double gpa;
    public static int cnt = 1;

    public SinhVien() {
    }

    public SinhVien(String ten, String ns, String lop, double gpa) {
        this.ma = "B20DCCN" + String.format("%03d", cnt);
        this.ten = ten;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;
        cnt++;
    }

    public String getNs() {
        StringBuilder s = new StringBuilder(this.ns);
        if(s.charAt(1)=='/') s.insert(0, "0");
        if(s.charAt(4)=='/') s.insert(3, "0");
        return s.toString();
    }
    
    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.getNs() + " " + String.format("%.2f", this.gpa);
    }
    
    
    
}

public class danhsachsinhvientrongfile2 {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("SV.in"));
            int n = Integer.parseInt(sc.nextLine());
            SinhVien[] ds = new SinhVien[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String ns = sc.nextLine();
                Double gpa = Double.parseDouble(sc.nextLine());
                ds[i] = new SinhVien(ten, ns, lop, gpa);
                //System.out.println(a);
            }
            for(SinhVien x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex){
            
        }
    }
}
