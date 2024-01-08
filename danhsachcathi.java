/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
class CaThi implements Comparable<CaThi> {
    private String ma, ngay, gio, phong;
    private Date ngaygio;
    private SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    public static int cnt = 1;
    
    public CaThi(String ngay, String gio, String phong) {
        this.ma = "C" + String.format("%03d", cnt);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
        try {
            this.ngaygio = spd.parse(this.ngay + " " + this.gio);
        } catch (ParseException ex) {
            Logger.getLogger(CaThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnt++;
    }
    
    public Date getNgayGio() throws ParseException {
        Date tmp = spd.parse(this.ngay + " " + this.gio);
        return tmp;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ngay + " " + this.gio + " " + this.phong;
    }

    public String getMa() {
        return ma;
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }

    public String getPhong() {
        return phong;
    }

    public SimpleDateFormat getSpd() {
        return spd;
    }

    public static int getCnt() {
        return cnt;
    }
    

    @Override
    public int compareTo(CaThi o) {
        try {
            if(this.ngaygio.compareTo(o.getNgayGio())==0){
                if(this.ma.compareTo(o.getMa())<0){
                    return -1;
                }
                else return 1;
            }
            else{
                try {
                    if(this.ngaygio.compareTo(o.getNgayGio())<0){
                        return -1;
                    }
                    else return 1;
                } catch (ParseException ex) {
                    Logger.getLogger(CaThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(CaThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
    
    
}
public class danhsachcathi {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("CATHI.in"));
            int n = Integer.parseInt(sc.nextLine());
            List<CaThi> ds = new ArrayList<>();
            for(int i=0; i<n; i++){
                String ngay = sc.nextLine();
                String gio = sc.nextLine();
                String phong = sc.nextLine();
                ds.add(new CaThi(ngay, gio, phong));
            }
            Collections.sort(ds);
            for(CaThi x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
