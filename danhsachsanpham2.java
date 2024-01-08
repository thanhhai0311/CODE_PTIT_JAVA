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
class SanPham {
    private String ma, ten;
    private int gia, thoiHan;

    public SanPham() {
    }

    public SanPham(String ma, String ten, int gia, int thoiHan) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thoiHan = thoiHan;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public int getThoiHan() {
        return thoiHan;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.gia + " " + this.thoiHan ;
    }
    
    
}

public class danhsachsanpham2 {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            int n = Integer.parseInt(sc.nextLine());
            SanPham[] ds = new SanPham[n];
            for(int i=0; i<n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int gia = Integer.parseInt(sc.nextLine());
                int thoiHan = Integer.parseInt(sc.nextLine());
                ds[i] = new SanPham(ma, ten, gia, thoiHan);
            }
            Arrays.sort(ds, new Comparator<SanPham>(){
                @Override
                public int compare(SanPham o1, SanPham o2) {
                    if(o1.getGia() == o2.getGia()){
                        if(o1.getMa().compareTo(o2.getMa())<0) return -1;
                        return 1;
                    }
                    else{
                        return o2.getGia() - o1.getGia();
                    }
                }
                
            });
            for(SanPham x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
