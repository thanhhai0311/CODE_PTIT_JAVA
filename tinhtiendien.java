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
class KhachHang {
    private String ma, ten, loai;
    private int CSD, CSC, dinhMuc;
    public static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String ten, String loai, int CSD, int CSC) {
        this.ma = "KH" + String.format("%02d",cnt);
        this.ten = ten;
        this.loai = loai;
        this.CSD = CSD;
        this.CSC = CSC;
        cnt++;
    }

    public int getDinhMuc() {
        if(this.loai.compareTo("A")==0) return 100;
        if(this.loai.compareTo("B")==0) return 500;
        if(this.loai.compareTo("C")==0) return 200;
        return 0;
    }
    
    public String getTen() {
        String s = this.ten.trim().toLowerCase();
        String[] arr = s.split("\\s+");
        String ans = "";
        for(String x : arr){
            ans+=Character.toUpperCase(x.charAt(0));
            ans+=x.substring(1);
            ans+=" ";
        }
        return ans.substring(0, ans.length()-1);
    }
    
    public int tienTrongDinhMuc() {
        int tmp = this.CSC - this.CSD;
        if(tmp > this.getDinhMuc()) return this.getDinhMuc() * 450;
        else return tmp * 450;
    }
    
    public int tienVuotDinhMuc() {
        int tmp = this.CSC - this.CSD;
        if(tmp > this.getDinhMuc()) return (tmp-this.getDinhMuc())*1000;
        else return 0;
    }
    
    public int thueVAT() {
        return (int) (0.05 * this.tienVuotDinhMuc());
    }
    
    public int soTienPhaiNop() {
        return (int) (this.tienTrongDinhMuc() + this.tienVuotDinhMuc() + this.thueVAT());
    }

    @Override
    public String toString() {
        return this.ma + " " + this.getTen() + " " + this.tienTrongDinhMuc() + " " + this.tienVuotDinhMuc() + " " + (int)this.thueVAT() + " " + this.soTienPhaiNop();
    }   
}

public class tinhtiendien {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int n = Integer.parseInt(sc.nextLine());
            KhachHang[] ds = new KhachHang[n];
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();;
                String s = sc.nextLine();
                String[] arr = s.split("\\s+");
                String loai = arr[0];
                int CSD = Integer.parseInt(arr[1]);
                int CSC = Integer.parseInt(arr[2]);
                ds[i] = new KhachHang(ten, loai, CSD, CSC);
            }
            Arrays.sort(ds, new Comparator<KhachHang>(){
                @Override
                public int compare(KhachHang o1, KhachHang o2) {
                    if(o1.soTienPhaiNop() > o2.soTienPhaiNop()) return -1;
                    else return 1;
                }
                
            });
            for(KhachHang x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        } 
    }
}
