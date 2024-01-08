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
public class xulyvanban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
            String s1 = sc.next();
            s += s1+" ";
            //if(s1.compareTo("0")==0) break;
        }
        //System.out.println(s);
        s = s.toLowerCase().substring(0, s.length()-1);
        s = s.replace("!", ".");
        s = s.replace("?", ".");
        s = s.replace(". ", ".");
        String[] arr = s.split("\\.");
        for(String x : arr){
            if(x.isEmpty()) continue;
            System.out.print(x.substring(0, 1).toUpperCase());
            System.out.print(x.substring(1));
            System.out.println("");
        }
//        Scanner sc = new Scanner(System.in);
//        String s = "";
//        while(sc.hasNext()){
//            String s1 = sc.next();
//            s += s1+" ";
//            if(s1.compareTo("0")==0) break;
//        }
//        s=s.toLowerCase();
//        s= s.replace('?', '.');
//        s= s.replace('!', '.');
//        s= s.replace(". ", ".");
//        String[] res = s.split("\\.");
//        for(String tmp : res){
//            if(Character.isAlphabetic(tmp.charAt(0))){
//                System.out.println(Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1));
//                continue;
//            }
//            for(int i=0;i<tmp.length();i++)
//                if(Character.isAlphabetic(tmp.charAt(i))||Character.isDigit(tmp.charAt(i)) ){
//                    System.out.println(tmp);
//                    break;
//                }
//        }
    }
}
