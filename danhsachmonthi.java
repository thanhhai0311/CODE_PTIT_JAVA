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
class MonThi {
    private String ma, ten, hinhThuc;

    public MonThi() {
    }

    public MonThi(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hinhThuc; 
    }
    
    
}

public class danhsachmonthi {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            MonThi[] ds = new MonThi[n];
            for(int i=0; i<n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                String hinhThuc = sc.nextLine();
                ds[i] = new MonThi(ma, ten, hinhThuc);
            }
            Arrays.sort(ds, new Comparator<MonThi>(){
                @Override
                public int compare(MonThi o1, MonThi o2) {
                    if(o1.getMa().compareTo(o2.getMa())<0){
                        return -1;
                    }
                    else return 1;
                }
                
            });
            for(MonThi x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
            
        }
    }
}
