/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class tachdoivatinhtong {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            BigInteger n = sc.nextBigInteger();
            while(true){
                String s = n.toString();
                if(s.length()==1) break;
                else{
                    String s1 = s.substring(0, s.length()/2);
                    String s2 = s.substring(s.length()/2);
                    BigInteger a = new BigInteger(s1);
                    BigInteger b = new BigInteger(s2);
                    n = a.add(b);
                    System.out.println(n);
                }
            }
        } catch(FileNotFoundException ex) {
            
        }
        
        
    }
}
