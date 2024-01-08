/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class SinhVien1 {
    private String ma, ten, lop, ns;
    private float gpa;
    public static int cnt = 1;
    public SinhVien1() {
    }

    public SinhVien1(String ten, String lop, String ns, float gpa) {
        this.ma = "B20DCCN" + String.format("%03d", cnt);
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
        cnt++;
    }
    
    public String getTen() {
        String s = this.ten.trim().toLowerCase();
        String[] arr = s.split("\\s+");
        String ans = "";
        for(String x : arr){
            ans+=x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.substring(0, ans.length()-1);
    }
    
    public String getNS() {
        String s = this.ns;
        StringBuilder tmp = new StringBuilder(s);
        if(tmp.charAt(1)=='/') tmp.insert(0,"0" );
        if(tmp.charAt(4)=='/') tmp.insert(3, "0");
        return tmp.toString();
    }

    public float getGpa() {
        return gpa;
    }

    
    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + this.lop + " " + this.getNS() + " " + String.format("%.2f", this.gpa);
    }
    
    
    
    
}

public class danhsachdoituongsinhvien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien1[] ds = new SinhVien1[n];
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            ds[i] = new SinhVien1(ten, lop, ns, gpa);
        }
        Arrays.sort(ds, new Comparator<SinhVien1>(){
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
                if(o1.getGpa() > o2.getGpa()) return -1;
                return 1;
            }
            
        });
        for(int i=0; i<n; i++){
            System.out.println(ds[i]);
        }
    }
}


//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1