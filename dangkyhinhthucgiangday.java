/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class giang implements Comparable<giang>{
    private String ma,ten,sotc,hth_lt,hth_th;

    public giang(String ma, String ten, String sotc, String hth_lt, String hth_th) {
        this.ma = ma;
        this.ten = ten;
        this.sotc = sotc;
        this.hth_lt = hth_lt;
        this.hth_th = hth_th;
    }

    public String getHth_th() {
        return hth_th;
    }
    
    public boolean getCompare(){
        if( !hth_th.equalsIgnoreCase("Truc tiep")){
            return true;
        }
        return false;
    }
    public int compareTo(giang x){
        return ma.compareTo(x.ma);
    }
    public String toString(){
        return ma+" "+ten+" "+sotc+" "+hth_lt+" "+hth_th;
    }
}

public class dangkyhinhthucgiangday {
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<giang> ans= new ArrayList<>();
        while( n-->0){
            giang s= new giang(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine());
            if( s.getCompare()){
                ans.add(s);
            }
        }
        Collections.sort(ans);
        for( giang i : ans){
            System.out.println(i);
        }
    }
}
