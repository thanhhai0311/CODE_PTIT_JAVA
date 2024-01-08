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
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
class SinhVien {
    private String ten, tgBatDau, tgKetThuc;
    private int tg;

    public SinhVien() {
    }

    public SinhVien(String ten, String tgBatDau, String tgKetThuc) {
        this.ten = ten;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
    }

    public String getTen() {
        return ten;
    }

    public String getTgBatDau() {
        return tgBatDau;
    }

    public String getTgKetThuc() {
        return tgKetThuc;
    }

    public float getTg() throws ParseException {
        SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date bd = spd.parse(this.tgBatDau);
        Date kt = spd.parse(this.tgKetThuc);
        return (kt.getTime() - bd.getTime())/(1000*60);
    }

    @Override
    public String toString() {
        try {
            return this.ten + " " + (int)this.getTg();
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
}

public class thoigianonlinelientuc {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("ONLINE.in"));
            int n = Integer.parseInt(sc.nextLine());
            SinhVien[] ds = new SinhVien[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                String bd = sc.nextLine();
                String kt = sc.nextLine();
                ds[i] = new SinhVien(ten, bd, kt);
            }
            Arrays.sort(ds, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    try {
                        if(o1.getTg() == o2.getTg()){
                            if(o1.getTen().compareTo(o2.getTen())<0){
                                return -1;
                            }
                            else return 1;
                        }
                        else{
                            if(o1.getTg() > o2.getTg()) return -1;
                            else return 1;
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(thoigianonlinelientuc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return 0;
                }
                
            });
            for(SinhVien x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
