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
class MatHang {
    private String ma, ten, nhom;
    private double giaMua, giaBan;
    public static int cnt = 1;

    public MatHang() {
    }

    public MatHang(String ten, String nhom, double giaMua, double giaBan) {
        this.ma = "MH" + String.format("%02d", cnt);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        cnt++;
    }
    
    public String getLoiNhuan(){
        return String.format("%.2f", this.giaBan-this.giaMua);
    }
    
    public double loiNhuan(){
        return this.giaBan - this.giaMua;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.nhom + " " + this.getLoiNhuan();
    }
}

public class sapxepmathang {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("MATHANG.in"));
            int n = Integer.parseInt(sc.nextLine());
            MatHang[] ds = new MatHang[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                String ma = sc.nextLine();
                Double giaMua = Double.parseDouble(sc.nextLine());
                Double giaBan = Double.parseDouble(sc.nextLine());
                ds[i] = new MatHang(ten, ma, giaMua, giaBan);
            }
            Arrays.sort(ds, new Comparator<MatHang>(){
                @Override
                public int compare(MatHang o1, MatHang o2) {
                    if(o1.loiNhuan()>o2.loiNhuan()) return -1;
                    else return 1;
                }
                
            });
            for(MatHang x : ds){
                System.out.println(x);
            }
            
        } catch(FileNotFoundException ex) {
            
        }
    }
}
