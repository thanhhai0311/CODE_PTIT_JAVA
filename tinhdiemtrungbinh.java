/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dell
 */
class SinhVien {
    private String ma, ten;
    private float diem1, diem2, diem3;
    public static int cnt = 1;

    public SinhVien() {
    }

    public SinhVien(String ten, float diem1, float diem2, float diem3) {
        this.ma = "SV" + String.format("%02d", cnt);
        this.ten = ten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
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
    
    public float diemTB() {
        return (diem1*3+diem2*3+diem3*2)/8;
    }

    public String getMa() {
        return ma;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public static int getCnt() {
        return cnt;
    }
    
    
    
    @Override
    public String toString() {
        return this.ma + " " +  this.getTen() + " " + String.format("%.2f", this.diemTB());
    } 
}

public class tinhdiemtrungbinh {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("BANGDIEM.in"));
            int n = Integer.parseInt(sc.nextLine());
            SinhVien[] ds = new SinhVien[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                float diem1 = Float.parseFloat(sc.nextLine());
                float diem2 = Float.parseFloat(sc.nextLine());
                float diem3 = Float.parseFloat(sc.nextLine());
                ds[i] = new SinhVien(ten, diem1, diem2, diem3);
            }
            ArrayList<Float> xh = new ArrayList<>();
            for(SinhVien x : ds){
                if(!xh.contains(x.diemTB())){
                    xh.add(x.diemTB());
                }
            }
            Collections.sort(xh, Collections.reverseOrder());
            Arrays.sort(ds, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    if(o1.diemTB() == o2.diemTB()){
                        if(o1.getMa().compareTo(o2.getMa())<0){
                            return -1;
                        }
                        else return 1;
                    }
                    else{
                        if(o1.diemTB()>o2.diemTB()) return -1;
                        return 1;
                    }
                }  
            });
            int dem = 1;
            for(int i=0; i<ds.length; i++){
                if(i==0){
                    System.out.println(ds[i] + " " + dem);
                }
                else{
                    if(ds[i].diemTB() == ds[i-1].diemTB()){
                        System.out.println(ds[i] + " " + dem);
                    }
                    else{
                        System.out.println(ds[i] + " " + (i+1));
                    }
                }
//                System.out.println(x + " " + dem);
//                dem++;
//                for(int i=0; i<xh.size(); i++){
//                    if(xh.get(i)==x.diemTB()){
//                        System.out.println(i+1);
//                        break;
//                    }
//                }
            }
            
        } catch(FileNotFoundException ex) {
            
        }
    }
}
