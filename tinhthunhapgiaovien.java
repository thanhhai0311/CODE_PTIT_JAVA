/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

class GiaoVien {
    String ma, ten;
    int luong;

    public GiaoVien() {
    }

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    
    public int phuCap() {
        String tmp = this.ma.substring(0, 2);
        if(tmp.compareTo("HT")==0) return 2000000;
        if(tmp.compareTo("HP")==0) return 900000;
        if(tmp.compareTo("GV")==0) return 500000;
        return 0;
    }
    
    public int heLuong() {
        int ans = (this.ma.charAt(2)-'0')*10 + this.ma.charAt(3)-'0';
        return ans;
    }
    
    public long tongLuong() {
        return (long)this.luong * this.heLuong() + this.phuCap();
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.heLuong() + " " + this.phuCap() + " " + this.tongLuong();
    }
    
    
}

public class tinhthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        int luong = sc.nextInt();
        GiaoVien a = new GiaoVien(ma, ten, luong);
        System.out.println(a);
    }
}
