/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Dell
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    private String ma, ten;
    private String donGia, phi;

    public LoaiPhong() {
    }

    public LoaiPhong(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        this.ma = arr[0];
        this.ten = arr[1];
        this.donGia = arr[2];
        this.phi = arr[3];
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonGia() {
        return donGia;
    }

    public String getPhi() {
        return phi;
    }

    @Override
    public int compareTo(LoaiPhong x) {
        return this.ten.compareTo(x.ten);
    }
    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donGia + " " + this.phi;
    }
    
    
}

public class loaiphong {
    public static void main(String[] args) throws IOException{
//        try {
//            Scanner sc = new Scanner(new File("PHONG.in"));
//            int n = Integer.parseInt(sc.nextLine());
//            Phong[] ds = new Phong[n];
//            for(int i=0; i<0; i++){
//                String ma = sc.next();
//                String ten = sc.next();
//                double donGia = Double.parseDouble(sc.next());
//                double phi = Double.parseDouble(sc.next());
//                ds[i] = new Phong(ma, ten, donGia, phi);
//            }
//            Arrays.sort(ds, new Comparator<Phong>(){
//                @Override
//                public int compare(Phong o1, Phong o2) {
//                    if(o1.getTen().compareTo(o2.getTen())<0){
//                        return -1;
//                    }
//                    return 1;
//                }
//                
//            });
//            for(Phong x : ds){
//                System.out.println(x);
//            }
//        } catch(FileNotFoundException ex){
//            
//        }
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
