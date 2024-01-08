/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

class SinhVien {
    private String ma, ten, lop, ns;
    float gpa;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String ns, float gpa) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    
    public String chuanHoa() {
        StringBuilder s = new StringBuilder(this.ns);
        if(s.charAt(1)=='/') s.insert(0, "0");
        if(s.charAt(4)=='/') s.insert(3, "0");
        return s.toString();
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.chuanHoa() + " " + String.format("%.2f", this.gpa);
    }
    
    
    
}

public class khaibaolopsinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = "B20DCCN001";
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ns = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien a = new SinhVien(ma, ten, lop, ns, gpa);
        System.out.println(a);
    }
}


//Nguyen Hoa Binh
//D20CQCN04-B
//2/2/2002
//2