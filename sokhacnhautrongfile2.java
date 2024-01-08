/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class sokhacnhautrongfile2 {
    public static void main(String[] args) throws IOException{
        try {       
            DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
            int[] a = new int[1000];
            for(int i=0; i<100000; i++){
                a[in.readInt()]++;
            }
            for(int i=0; i<1000; i++){
                if(a[i]>0){
                    System.out.println(i + " " + a[i]);
                }
            }
            in.close();
        } catch(FileNotFoundException ex){
            
        }
    }
}
