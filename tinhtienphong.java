/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class KhachHang {
    private String ma, ten, soPhong;
    private long ngay, tienDV;
    public static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String ten, String soPhong, long ngay, long tienDV) {
        this.ma = "KH" + String.format("%02d", cnt);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngay = ngay;
        this.tienDV = tienDV;
        cnt++;
    }
    
    public long donGia(){
        if(this.soPhong.charAt(0)=='1') return 25;
        if(this.soPhong.charAt(0)=='2') return 34;
        if(this.soPhong.charAt(0)=='3') return 50;
        if(this.soPhong.charAt(0)=='4') return 80;
        return 0L;
    }
    
    public long tien() {
        return this.ngay * this.donGia() + this.tienDV;
    }

    public String getMa() {
        return ma;
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

    public String getSoPhong() {
        return soPhong;
    }

    public long getNgay() {
        return ngay;
    }

    public long getTienDV() {
        return tienDV;
    }

    public static int getCnt() {
        return cnt;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + this.soPhong + " " + this.ngay + " " + this.tien();
    }
    
    
}

public class tinhtienphong {
    public static void main(String[] args) throws IOException, ParseException{
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int n = Integer.parseInt(sc.nextLine());
            SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
            KhachHang[] ds = new KhachHang[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                String soPhong = sc.nextLine();
                String ngayDen = sc.nextLine();
                String ngayDi = sc.nextLine();
                long tienDV = Long.parseLong(sc.nextLine());
                StringBuilder s1 = new StringBuilder(ngayDen);
                if(s1.charAt(1)=='/') s1.insert(0, "0");
                if(s1.charAt(4)=='/') s1.insert(3, "0");
                StringBuilder s2 = new StringBuilder(ngayDi);
                if(s2.charAt(1)=='/') s2.insert(0, "0");
                if(s2.charAt(4)=='/') s2.insert(3, "0");
                Date d1 = spd.parse(s1.toString());
                Date d2 = spd.parse(s2.toString());
                long ngay = (d2.getTime()-d1.getTime())/(1000*60*60*24);
                ds[i] = new KhachHang(ten, soPhong, ngay+1, tienDV);
            }
            Arrays.sort(ds, new Comparator<KhachHang>(){
                @Override
                public int compare(KhachHang o1, KhachHang o2) {
                    return (int) (o2.tien() - o1.tien());
                }
                
            });
            for(KhachHang x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
