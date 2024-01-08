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
    private String ma, ten, gt, ns, dc, mst, ngayki;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String gt, String ns, String dc, String mst, String ngayki) {
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.ngayki = ngayki;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.gt + " " + this.ns + " " + this.dc + " " + this.mst + " " + this.ngayki;
    }
    
    
}
public class khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = "00001";
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String ns = sc.nextLine();
        String dc = sc.nextLine();
        String mst = sc.nextLine();
        String ngayki = sc.nextLine();
        NhanVien a = new NhanVien(ma, ten, gt, ns, dc, mst, ngayki);
        System.out.println(a);
    }
}

