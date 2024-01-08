/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class sokhacnhautrongfile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            int[] a = new int[1000];
            for(Integer x : list){
                a[x]++;
            }
            for(int i=0; i<1000; i++){
                if(a[i]>0){
                    System.out.println(i + " " + a[i]);
                }
            }
        } catch(FileNotFoundException ex){
             
        }
        
    }
}
