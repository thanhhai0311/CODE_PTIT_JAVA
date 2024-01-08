/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class MatHang {
    private String ma, ten, donvi;
    private long giamua, giaban;
    public static int cnt = 1;

    public MatHang() {
    }
    
    public MatHang(String ten, String donvi, long giamua, long giaban) {
        this.ma = "MH" + String.format("%03d", cnt);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        cnt++;
    }

    public String getMa() {
        return ma;
    }
    
    public long loiNhuan() {
        return this.giaban - this.giamua;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donvi + " " + this.giamua + " " + this.giaban + " " + this.loiNhuan();
    } 
}

public class danhsachmathang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] ds = new MatHang[n];
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            long giamua = Long.parseLong(sc.nextLine());
            long giaban = Long.parseLong(sc.nextLine());
            ds[i] = new MatHang(ten, donvi, giamua, giaban);
        }
        Arrays.sort(ds, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.loiNhuan() == o2.loiNhuan()){
                    if(o1.getMa().compareTo(o2.getMa())<0) return -1;
                    else return 1;
                }
                else{
                    return (int)o2.loiNhuan() - (int)o1.loiNhuan();
                }
            } 
        });
        for(MatHang x : ds){
            System.out.println(x);
        }
    }
}
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000