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
    private String ma, ten, maPhong;
    private long ngayLuuTru;
    public static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String ten, String maPhong, long ngayLuuTru) {
        this.ma = "KH" + String.format("%02d", cnt);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayLuuTru = ngayLuuTru;
        cnt++;
    } 

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public long getNgayLuuTru() {
        return ngayLuuTru;
    }

    public static int getCnt() {
        return cnt;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.maPhong + " " + this.ngayLuuTru;
    }
    
    
}

public class danhsachluutru {
    public static void main(String[] args) throws IOException, ParseException{
        try {
            Scanner sc = new Scanner(new File("KHACH.in"));
            int n = Integer.parseInt(sc.nextLine());
            KhachHang[] ds = new KhachHang[n];
            SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                String maPhong = sc.nextLine();
                Date ngayDen = spd.parse(sc.nextLine());
                Date ngayDi = spd.parse(sc.nextLine());
                long ngayLuuTru = (long) ((ngayDi.getTime()-ngayDen.getTime())/(1000*60*60*24));
                ds[i] = new KhachHang(ten, maPhong, ngayLuuTru);
            }
            Arrays.sort(ds, new Comparator<KhachHang>(){
                @Override
                public int compare(KhachHang o1, KhachHang o2) {
                    return (int) (o2.getNgayLuuTru() - o1.getNgayLuuTru());
                }
                
            });
            for(KhachHang x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
