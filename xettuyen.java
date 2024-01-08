/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class NguoiThiTuyen {
    private String ma;
    private String ten;
    private int namSinh;
    private int diem;
    private String xepLoai;

    public NguoiThiTuyen(String ma, String ten, int namSinh, int diem, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diem = diem;
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + namSinh + " " + diem + " " + xepLoai;
    }
    
}

public class xettuyen {
   public static String formatName(String name) {
        String[] s = name.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : s) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        List<NguoiThiTuyen> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = formatName(sc.nextLine());
            String ns = sc.nextLine();
            int tuoi = 2021 - Integer.parseInt(ns.substring(ns.length() - 4));
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d = (d1 + d2) / 2;
            if (d1 >= 8 && d2 >= 8) {
                d += 1;
            } else if (d1 >= 7.5 && d2 >= 7.5) {
                d += 0.5;
            }
            int diem = round(d);
            if(diem > 10) diem = 10;
            String xepLoai;
            if (diem < 5) {
                xepLoai = "Truot";
            } else if (diem < 7) {
                xepLoai = "Trung binh";
            } else if (diem == 7) {
                xepLoai = "Kha";
            } else if (diem == 8) {
                xepLoai = "Gioi";
            } else {
                xepLoai = "Xuat sac";
            }
            l.add(new NguoiThiTuyen(String.format("PH%02d", i + 1), ten, tuoi, diem, xepLoai));
        }
        for (NguoiThiTuyen i : l) {
            System.out.println(i);
        }
    } 
}
