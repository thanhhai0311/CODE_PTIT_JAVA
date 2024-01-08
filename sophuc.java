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
class SoPhuc {
    private int thuc, ao;

    public SoPhuc() {
    }

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    
    public SoPhuc cong(SoPhuc a){
        int thuccong = this.thuc + a.thuc;
        int aocong = this.ao + a.ao;
        return new SoPhuc(thuccong, aocong);
    }
    
    public SoPhuc nhan(SoPhuc a){
        int thucnhan = this.thuc*a.thuc-this.ao*a.ao;
        int aonhan = this.thuc*a.ao+this.ao*a.thuc;
        return new SoPhuc(thucnhan, aonhan);
    }

    @Override
    public String toString() {
        if(this.ao>0){
            return this.thuc + " + " + this.ao + "i";
        }
        else if(this.ao<0){
            return this.thuc + " - " + this.ao + "i";
        }
        else{
            return this.thuc + "";
        }
    }
    
    
}
public class sophuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int thuc1 = sc.nextInt();
            int ao1 = sc.nextInt();
            int thuc2 = sc.nextInt();
            int ao2 = sc.nextInt();
            SoPhuc a = new SoPhuc(thuc1, ao1);
            SoPhuc b = new SoPhuc(thuc2, ao2);
            SoPhuc c = a.cong(b);
            c = c.nhan(a);
            SoPhuc d = a.cong(b);
            d = d.nhan(d);
            System.out.println(c + ", " + d);
        }
    }
}
