/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
class Word {
    private String tu;
    private int ts;

    public Word() {
    }

    public Word(String tu, int ts) {
        this.tu = tu;
        this.ts = ts;
    }

    public String getTu() {
        return tu;
    }

    public int getTs() {
        return ts;
    }
    
    public boolean check() {
        for(int i=0; i<=this.tu.length()/2; i++){
            if(this.tu.charAt(i)!=this.tu.charAt(this.tu.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public int doDai() {
        return this.tu.length();
    }
    
}
public class timtuthuannghichdainhat {
    public static boolean check(String s) {
        for(int i=0; i<=s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        int max = 0;
        while(sc.hasNext()){
            String s = sc.next();
            //if(s.compareTo("0")==0) break;
            if(check(s)){
                if(s.length()>max) max = s.length();
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }
                else map.put(s, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            if(entry.getKey().length()==max){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}


