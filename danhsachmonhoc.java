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
class MonHoc {
    private String ma, ten;
    private int soTC;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, int soTC) {
        this.ma = ma;
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.soTC;
    }

    public String getTen() {
        return ten;
    }
    
    
}
public class danhsachmonhoc {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            MonHoc[] ds = new MonHoc[n];
            for(int i=0; i<n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int soTC = Integer.parseInt(sc.nextLine());
                ds[i] = new MonHoc(ma, ten, soTC);
            }
            Arrays.sort(ds, new Comparator<MonHoc>(){
                @Override
                public int compare(MonHoc o1, MonHoc o2) {
                    if(o1.getTen().compareTo(o2.getTen())<0){
                        return -1;
                    }
                    else return 1;
                }
                
            });
            for(MonHoc x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex){ 
            
        }
    }
}
