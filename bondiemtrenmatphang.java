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
class Point3D {
    private int x, y, z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
        int abx = b.x - a.x;
        int aby = b.y - a.y;
        int abz = b.z - a.z;
        int acx = c.x - a.x;
        int acy = c.y - a.y;
        int acz = c.z - a.z;
        int adx = d.x - a.x;
        int ady = d.y - a.y;
        int adz = d.z - a.z;
        int abacx = aby*acz - abz*acy;
        int abacy = -(abx*acz - abz*acx);
        int abacz = abx*acy - aby*acx;
        int D = -(abacx*a.x + abacy*a.y + abacz*a.z);
        int ans = abacx*d.x + abacy*d.y +abacz*d.z + D;
        if(ans==0) return true;
        return false;
    }
}

public class bondiemtrenmatphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}


//3
//1 2 0
//2 3 0
//4 0 0
//0 0 0
//1 1 1
//2 2 2
//3 3 3
//4 4 4
//5 6 7
//-8 -9 -10
//12 19 0
//3 1 5

 