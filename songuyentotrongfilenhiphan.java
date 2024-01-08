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
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class songuyentotrongfilenhiphan {
    public static int nto(int n){
        if(n<2) return 0;
        for(int i=2; i<=sqrt(n); i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            int[] cnt = new int[10005];
            ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
            for(Integer x : a){
                cnt[x]++;
            }
            for(int i=0; i<=10000; i++){
                if(nto(i)==1 && cnt[i]>0){
                    System.out.println(i + " " + cnt[i]);
                }
            }
        } catch(FileNotFoundException ex){
             
        }      
    }
}
