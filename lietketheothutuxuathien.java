/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class lietketheothutuxuathien {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
            ArrayList<String> arr = (ArrayList<String>) in.readObject();
            Set<String> set1 = new LinkedHashSet<>();
            for(String x : arr){
                x = x.trim().toLowerCase();
                String[] arr1 = x.split("\\s+");
                for(String y : arr1){
                    set1.add(y);
                }
            }
            
            Scanner sc = new Scanner(new File("VANBAN.in"));
            ArrayList<String> check = new ArrayList<>();
            while(sc.hasNext()){
                String s = sc.next().toLowerCase();
                if(set1.contains((Object)s) && !check.contains(s)){
                    System.out.println(s);
                    check.add(s);
                }
                
            }
        } catch(FileNotFoundException ex){
            
        }
    }
}
