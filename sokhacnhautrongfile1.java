/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Dell
 */
public class sokhacnhautrongfile1 {
    public static void main(String[] args) throws IOException{
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            TreeMap<Integer, Integer> map = new TreeMap<>();
            while(sc.hasNext()){
                int n = sc.nextInt();
                //System.out.println(n);
                if(map.containsKey(n)){
                    map.put(n, map.get(n)+1);
                }
                else{
                    map.put(n, 1);
                }
            }
            Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
            for(Map.Entry<Integer, Integer> entry : entrySet){
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
            
        } catch(FileNotFoundException ex){
            
        }
        
    }
}
