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
    private String ma, ten;
    private float diemToan, diemLy, diemHoa;
    //private float diemChuan;

    public ThiSinh() {
    }

    public ThiSinh(String ma, String ten, float diemToan, float diemLy, float diemHoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        //this.diemChuan = diemChuan;
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
    
    public float diemUuTien() {
        if(this.ma.charAt(2)=='1') return (float) 0.5;
        if(this.ma.charAt(2)=='2') return (float) 1;
        if(this.ma.charAt(2)=='3') return (float) 2.5;
        return 0;
    }
    
    public String sdiemUuTien() {
        if(this.ma.charAt(2)=='1') return String.format("%.1f", 0.5);
        if(this.ma.charAt(2)=='2') return String.format("%.0f", 1.0);
        if(this.ma.charAt(2)=='3') return String.format("%.1f", 2.5);
        return null;
        
    }
    
    public float fdiemXetTuyen() {
        return this.diemToan*2 + this.diemLy + this.diemHoa + this.diemUuTien();
    }
    
    public String sdiemXetTuyen() {
        if(this.fdiemXetTuyen() == (int) this.fdiemXetTuyen()) return String.format("%.0f", this.diemToan*2 + this.diemLy + this.diemHoa + this.diemUuTien());
        else return String.format("%.1f", this.diemToan*2 + this.diemLy + this.diemHoa + this.diemUuTien());
    }
    
    public String getMa() {
        return ma;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

//    public String KQ() {
//        if(this.fdiemXetTuyen()>=this.diemChuan) return "TRUNG TUYEN";
//        else return "TRUOT";
//    }
    public float getDiemHoa() {    
        return diemHoa;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + this.sdiemUuTien() + " " + this.sdiemXetTuyen();
    }
    
}

public class danhsachtrungtuyen {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            ThiSinh[] ds = new ThiSinh[n];
            for(int i=0; i<n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                float diemToan = Float.parseFloat(sc.nextLine());
                float diemLy = Float.parseFloat(sc.nextLine());
                float diemHoa = Float.parseFloat(sc.nextLine());
                ds[i] = new ThiSinh(ma, ten, diemToan, diemLy, diemHoa);
            }
            Arrays.sort(ds, new Comparator<ThiSinh>(){
                @Override
                public int compare(ThiSinh o1, ThiSinh o2) {
                    if(o1.fdiemXetTuyen() == o2.fdiemXetTuyen()){
                        if(o1.getMa().compareTo(o2.getMa())<0){
                            return -1;
                        }
                        else return 1;
                    }
                    else{
                        if(o1.fdiemXetTuyen() > o2.fdiemXetTuyen()) return -1;
                        else return 1;
                    }
                }
                
            });
            int chiTieu = Integer.parseInt(sc.nextLine());
            float diemChuan = ds[chiTieu-1].fdiemXetTuyen();
            System.out.println(String.format("%.1f", diemChuan));
            for(ThiSinh x : ds){
                System.out.print(x);
                if(x.fdiemXetTuyen()>=diemChuan) System.out.println(" " + "TRUNG TUYEN");
                else System.out.println(" TRUOT");
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
