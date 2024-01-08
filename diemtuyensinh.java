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
class ThiSinh {
    private String ma, ten, dt, kv;
    private float diem;
    public static int cnt = 1;

    public ThiSinh() {
    }

    public ThiSinh(String ten, float diem, String dt, String kv) {
        this.ma = "TS" + String.format("%02d", cnt);
        this.ten = ten;
        this.dt = dt;
        this.diem = diem;
        this.kv = kv;
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
    
    public float getDiemUuTienKV() {
        if(this.kv.compareTo("1")==0) return (float) 1.5;
        if(this.kv.compareTo("2")==0) return 1;
        if(this.kv.compareTo("3")==0) return 0;
        return 0;
    }
    
    public float getDiemUuTienDT() {
        if(this.dt.compareTo("Kinh")!=0) return (float) 1.5;
        else return 0;
    }
    
    public float getTong() {
        return this.diem + this.getDiemUuTienDT() + this.getDiemUuTienKV();
    }
    
    public String getTrangThai() {
        if(this.getTong() >= 20.5) return "Do";
        else return "Truot";
    }

    public String getMa() {
        return ma;
    }

    public String getDt() {
        return dt;
    }

    public float getDiem() {
        return diem;
    }

    public String getKv() {
        return kv;
    }

    public static int getCnt() {
        return cnt;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + String.format("%.1f", this.getTong()) + " " + this.getTrangThai();
    }
    
    
    
}

public class diemtuyensinh {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            ThiSinh[] ds = new ThiSinh[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                float diem = Float.parseFloat(sc.nextLine());
                String  dt = sc.nextLine();
                String kv = sc.nextLine();
                ds[i] = new ThiSinh(ten, diem, dt, kv);
            }
            Arrays.sort(ds, new Comparator<ThiSinh>(){
                @Override
                public int compare(ThiSinh o1, ThiSinh o2) {
                   if(o1.getTong() == o2.getTong()){
                       if(o1.getMa().compareTo(o2.getMa())<0){
                           return -1;
                       }
                       else return 1;
                   }
                   else{
                       if(o1.getTong() > o2.getTong()) return -1;
                       else return 1;
                   }
                }
                
            });
            for(ThiSinh x :  ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
