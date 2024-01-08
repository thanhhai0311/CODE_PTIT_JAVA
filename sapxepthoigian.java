/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class ThoiGian {
    private int gio, phut, giay;

    public ThoiGian() {
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return this.gio + " " + this.phut + " " + this.giay;
    } 
}

public class sapxepthoigian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThoiGian[] ds = new ThoiGian[n];
        for(int i=0; i<n; i++){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            ds[i] = new ThoiGian(gio, phut, giay);
        }
        Arrays.sort(ds, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if(o1.getGio() == o2.getGio()){
                    if(o1.getPhut() == o2.getPhut()){
                        return o1.getGiay() - o2.getGiay();
                    }
                    else return o1.getPhut() - o2.getPhut();
                }
                else return o1.getGio() - o2.getGio();
            }
        });
        for(ThoiGian x : ds){
            System.out.println(x);
        }
    }
}
