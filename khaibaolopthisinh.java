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
class ThiSinh {
    private String ten, ns;
    private float diem1, diem2, diem3;

    public ThiSinh() {
    }

    public ThiSinh(String ten, String ns, float diem1, float diem2, float diem3) {
        this.ten = ten;
        this.ns = ns;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return this.ten + " " + this.ns + " " + String.format("%.1f", diem1+diem2+diem3);
    }
    
    
}

public class khaibaolopthisinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ns = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        ThiSinh s = new ThiSinh(ten, ns, diem1, diem2, diem3);
        System.out.println(s);
    }
}
