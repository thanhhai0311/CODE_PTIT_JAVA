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
public class tinhtong {
    public static void main(String[] args) throws IOException{
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;
            while(sc.hasNext()){
                String tmp = sc.next();
                try {
                    sum += Integer.parseInt(tmp);
                } catch(NumberFormatException ex){
                    
                }
            }
            System.out.println(sum);
        } catch(FileNotFoundException ex){
            
        }
    }
}
