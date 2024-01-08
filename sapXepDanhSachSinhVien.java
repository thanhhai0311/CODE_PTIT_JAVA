/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.*;
import java.util.*;

class dssv implements Comparable<dssv> {

    private String ma, ten, sdt, email;
    private String ho, tengoi, tendem;

    public dssv(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        String[] r = ten.trim().split("\\s+");
        this.ho = r[0];
        this.tengoi = r[r.length - 1];
        for (int i = 1; i < r.length - 1; i++) {
            tendem += r[i] + " ";
        }
        tendem.trim();
        this.tendem=tendem;
    }
    public int compareTo(dssv x){
        if( !tengoi.equals(x.tengoi)){
            return tengoi.compareTo(x.tengoi);
        }
        if( !ho.equals(x.ho)){
            return ho.compareTo(x.ho);
        }
        if( !tendem.equals(x.tendem)){
            return tendem.compareTo(x.tendem);
        }
        return ma.compareTo(x.ma);
    }
    public String toString(){
        return ma+" "+ten+" "+sdt+" "+email;
    }
}

public class sapXepDanhSachSinhVien {
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<dssv> ans= new ArrayList<>();
        while( n-->0){
            ans.add(new dssv(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    sc.nextLine()));
        }
        Collections.sort(ans);
        for( dssv i : ans){
            System.out.println(i);
        }
    }
}
