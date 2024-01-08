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
class ThiSinh {
    private String ma, ten;
    private float diemToan, diemLy, diemHoa;

    public ThiSinh() {
    }

    public ThiSinh(String ma, String ten, float diemToan, float diemLy, float diemHoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public float getDiemUuTien() {
        if(this.ma.charAt(2)=='1') return (float) 0.5;
        else if(this.ma.charAt(2)=='2') return 1;
        return (float) 2.5;
    }
    
    public String sgetDiemUuTien() {
        if(this.getDiemUuTien() == (int) this.getDiemUuTien()) return String.format("%.0f", this.getDiemUuTien());
        else return String.format("%.1f", this.getDiemUuTien());
    }
    
    public float getTongDiem() {
        return this.diemHoa + this.diemToan*2 + this.diemLy;
    }
    
    public String sgetTongDiem() {
        if(this.getTongDiem() == (int) this.getTongDiem()) return String.format("%.0f", this.getTongDiem());
        else return String.format("%.1f", this.getTongDiem());
    }
    
    public String getKQ() {
        if((this.getTongDiem() + this.getDiemUuTien())>=24) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.sgetDiemUuTien() + " " + this.sgetTongDiem() + " " + this.getKQ();
    }
}

public class baitoantuyensinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        float diemToan = Float.parseFloat(sc.nextLine());
        float diemLy = Float.parseFloat(sc.nextLine());
        float diemHoa = Float.parseFloat(sc.nextLine());
        ThiSinh a = new ThiSinh(ma, ten, diemToan, diemLy, diemHoa);
        System.out.println(a);
    }
}
