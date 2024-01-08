/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
class PhanSo {
    private long tu, mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public PhanSo rutgon() {
        long a = this.tu;
        long b = this.mau;
        while(b!=0){
            long r = a%b;
            a=b; 
            b=r;
        }
        return new PhanSo(this.tu/a, this.mau/a);
    }
    
    public PhanSo cong(PhanSo a){
        long tucong = this.tu*a.mau+a.tu*this.mau;
        long maucong = this.mau*a.mau;
        return new PhanSo(tucong, maucong);
    }
    
    public PhanSo nhan(PhanSo a){
        long tunhan = this.tu*a.tu;
        long maunhan = this.mau*a.mau;
        return new PhanSo(tunhan, maunhan);
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
    
    
}

public class tinhtoanphanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //sc.nextLine();
        while(t-->0){
            long tu1 = sc.nextLong();
            long mau1 = sc.nextLong();
            long tu2 = sc.nextLong();
            long mau2 = sc.nextLong();
            PhanSo a = new PhanSo(tu1, mau1);
            PhanSo b = new PhanSo(tu2, mau2);
            PhanSo tong = a.cong(b);
            tong = tong.nhan(tong);
            tong = tong.rutgon();
            PhanSo nhan = a.nhan(b);
            nhan = nhan.nhan(tong);
            nhan = nhan.rutgon();
            System.out.println(tong + " " + nhan);
        }
    }
}
