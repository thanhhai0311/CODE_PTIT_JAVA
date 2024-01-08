/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dell
 */
public class capsonguyentotrongfile1 {
    public static boolean nto(int n){
        if(n<2) return false;
        for(int i=2; i<=sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
            ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
            Collections.sort(a);
            Collections.sort(b);
            ArrayList<Integer> c = new ArrayList<>();
            for(Integer x : a){
                if(x<1000000/2 && nto(x)){
                    if(nto(1000000-x) && b.contains(1000000-x) && !c.contains(x)){
                        c.add(x);
                        System.out.println(x + " " + (1000000-x));
                    }
                }
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
