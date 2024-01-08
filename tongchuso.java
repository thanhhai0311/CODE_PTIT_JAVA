/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class tongchuso {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<String> list = (ArrayList<String>) in.readObject();
            for(String x : list){
                //String s = list.get(i);
                String so = "";
                int tong = 0;
                for(int j=0; j<x.length(); j++){
                    if(Character.isDigit(x.charAt(j))){
                        so += x.charAt(j);
                        tong += x.charAt(j)-'0';
                    }
                }
                BigInteger ans = new BigInteger(so);
                System.out.println(ans + " " + tong);
            }
//        ObjectInputStream sc= new ObjectInputStream(new FileInputStream("DATA.in"));
//        ArrayList<String> a=(ArrayList<String>) sc.readObject();
//        for( String x : a){
//            String s="";
//            int sum=0;
//            for( int i=0;i<x.length();i++){
//                if( Character.isDigit(x.charAt(i))){
//                    s+=x.charAt(i);
//                    sum+=x.charAt(i)-'0';
//                }
//            }
//            BigInteger ans= new BigInteger(s);
//            System.out.println(ans +" "+sum);
//        }
//        
        } catch(FileNotFoundException ex) {
            
        }
    }
}
