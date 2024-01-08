/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class HoTen {
    private String ho, dem, ten;

    public HoTen() {
    }

    public HoTen(String ho, String dem, String ten) {
        this.ho = ho;
        this.dem = dem;
        this.ten = ten;
    }

    public String getHo() {
        String s = this.ho.substring(0, 1).toUpperCase() + this.ho.substring(1);
        return s;
    }

    public String getDem() {
        String[] arr = this.dem.toLowerCase().split("\\s+");
        String s = "";
        for(String x : arr){
            s+=x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase()+" ";
        }
        return s.substring(0, s.length()-1);
    }

    public String getTen() {
        String s = this.ten.substring(0, 1).toUpperCase() + this.ten.substring(1);
        return s;
    }
    
    public String getAll() {
        return this.getHo() + " " + this.getDem() + " " + this.getTen();
    }
    @Override
    public String toString() {
        return this.getHo() + " " + this.getDem() + " " + this.getTen();
    }
}

public class chuanhoavasapxep {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("DANHSACH.in"));
            List<HoTen> ds = new ArrayList<>();
            while(sc.hasNext()){
                String s = sc.nextLine();
                String[] arr = s.trim().toLowerCase().split("\\s+");
                String ho = arr[0];
                String dem = "";
                for(int i=1; i<arr.length-1; i++){
                    dem+=arr[i]+" ";
                }
                dem = dem.substring(0, dem.length()-1);
                String ten = arr[arr.length-1];
                HoTen a = new HoTen(ho, dem, ten);
                ds.add(a);
            }
            Collections.sort(ds, new Comparator<HoTen>(){
                @Override
                public int compare(HoTen o1, HoTen o2) {
                    if(o1.getTen().compareTo(o2.getTen())==0){
                        if(o1.getHo().compareTo(o2.getHo())==0){
                            if(o1.getDem().compareTo(o2.getDem())<0){
                                return -1;
                            }
                            else return 1;
                        } 
                        else{
                            if(o1.getHo().compareTo(o2.getHo())<0){
                                return -1;
                            }
                            else return 1;
                        }
                    }
                    else{
                        if(o1.getTen().compareTo(o2.getTen())<0){
                            return -1;
                        }
                        else return 1;
                    }
                }
                
            });
            for(HoTen x : ds){
                System.out.println(x);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
