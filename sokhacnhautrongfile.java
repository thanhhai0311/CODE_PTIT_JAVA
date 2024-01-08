/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Dell
 */
public class sokhacnhautrongfile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
//            Scanner sc = new Scanner(new File("DATA.in"));
//            DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
            TreeMap<Integer, Integer> map = new TreeMap<>();
//            while(sc.hasNext()){
//                int n = sc.nextInt();
//                if(map.containsKey(n)){
//                    map.put(n, map.get(n)+1);
//                }
//                else map.put(n, 1);
//            }
            for(Integer n : arr){
               // int n = in.readInt();
                if(map.containsKey(n)){
                    map.put(n, map.get(n)+1);
                }
                else map.put(n, 1);
            }
            Set<Entry<Integer, Integer>> entrySet = map.entrySet();
            for(Entry<Integer, Integer> entry : entrySet){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            in.close();
        }
        catch(FileNotFoundException ex) {
            
        }
    }
}
