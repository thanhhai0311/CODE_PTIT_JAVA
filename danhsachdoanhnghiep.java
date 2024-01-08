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
class DoanhNghiep {
    private String ma, ten;
    private int soSV;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSoSV() {
        return soSV;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.soSV;
    }    
}

public class danhsachdoanhnghiep {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = Integer.parseInt(sc.nextLine());
            DoanhNghiep[] ds = new DoanhNghiep[n];
            for(int i=0; i<n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int soSV = Integer.parseInt(sc.nextLine());
                ds[i] = new DoanhNghiep(ma, ten, soSV);
            }
            Arrays.sort(ds, new Comparator<DoanhNghiep>(){
                @Override
                public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                    if(o1.getMa().compareTo(o2.getMa())<0){
                        return -1;
                    }
                    else return 1;
                }
                
            });
            for(DoanhNghiep x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex){
            
        }
    }
}
