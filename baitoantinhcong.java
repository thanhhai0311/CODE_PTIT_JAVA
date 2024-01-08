/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
class NhanVien {
    private String ma, ten;
    private int luong, ngayCong;
    private String chucVu;
    public static int cnt = 1;

    public NhanVien() {
    }

    public NhanVien(String ten, int luong, int ngayCong, String chucVu) {
        this.ma = "NV"+String.format("%02d", cnt);
        this.ten = ten;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        cnt++;
    }
    
    public int getLuong() {
        return this.luong * this.ngayCong;
    }
    
    public int getPhuCap() {
        if(this.chucVu.compareTo("GD")==0) return 250000;
        else if(this.chucVu.compareTo("PGD")==0) return 200000;
        else if(this.chucVu.compareTo("TP")==0) return 180000;
        else return 150000;
    }
    public int getThuong() {
        if(this.ngayCong>=25) return this.getLuong()/5;
        else if(this.ngayCong>=22) return this.getLuong()/10;
        else return 0;
    }
    
    public int getThuNhap() {
        return this.getLuong() + this.getPhuCap() + this.getThuong();
    }
    @Override
    public String toString() {
         return this.ma + " " + this.ten + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + this.getThuNhap();
    }
}

public class baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int ngayCong = Integer.parseInt(sc.nextLine());
        String chucVu = sc.nextLine();
        NhanVien a = new NhanVien(ten, luong, ngayCong, chucVu);
        System.out.println(a);
    }
}
