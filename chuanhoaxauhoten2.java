/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Dell
 */
public class chuanhoaxauhoten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            for (int i = 1; i < a.size(); i++) {
                String k = a.get(i);
                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1));
                if (i != a.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(", " + a.get(0).toUpperCase());
        }
    }
}


//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH

//import java.util.Scanner;
//import java.util.Vector;
//
//public class chuanhoaxauhoten2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- > 0) {
//            String s = sc.nextLine();
//            Vector<String> a = new Vector<String>();
//            String x = "";
//            s = s.toLowerCase() + " ";
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == ' ') {
//                    if (x != "") {
//                        a.add(x);
//                        x = "";
//                    }
//                } else {
//                    x += s.charAt(i);
//                }
//            }
//            for (int i = 1; i < a.size(); i++) {
//                String k = a.get(i);
//                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1));
//                if (i != a.size() - 1) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(", " + a.get(0).toUpperCase());
//        }
//    }
//}
