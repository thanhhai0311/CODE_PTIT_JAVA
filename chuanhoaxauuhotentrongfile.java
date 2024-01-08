/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class chuanhoaxauuhotentrongfile {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(true){
                String s = sc.nextLine();
                if(s.compareTo("END")==0){
                    break;
                }
                else{
                    s = s.toLowerCase().trim();
//                    s = s.toLowerCase();
//                    int idx = 0;
//                    while(idx<s.length() && s.charAt(idx)==' '){
//                        idx++;
//                    }
//                    int idx2 = s.length()-1;
//                    while(idx2>=0 && s.charAt(idx2)==' '){
//                        idx2--;
//                    }
//                    idx2++;
//                    s = s.substring(idx, idx2);
                    String[] arr = s.split("\\s+");
                    for(String x : arr){
                        System.out.print(Character.toUpperCase(x.charAt(0)));
                        for(int i=1; i<x.length(); i++){
                            System.out.print(x.charAt(i));
                        }
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
