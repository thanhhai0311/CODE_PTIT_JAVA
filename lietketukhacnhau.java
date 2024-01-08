/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dell
 */

class WordSet {
    Set<String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            s = s.toLowerCase();
            set.add(s);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(String x : set){
            s += x + "\n";
        }
        return s;
    }
    
    
    
    
}
public class lietketukhacnhau {
    public static void main(String[] args) throws IOException{
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
