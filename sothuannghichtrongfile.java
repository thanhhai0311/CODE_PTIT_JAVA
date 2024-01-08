/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dell
 */
public class sothuannghichtrongfile {
    public static boolean tn(int n) {
        int dao = 0;
        int dem = 0;
        while(n>0){
            int cs = n%10;
            dem++;
            if(cs%2==0) return false;
            dao = dao * 10 + cs;
            n/=10;
        }
        return n==dao && dem>1 && dem%2==1;
    }
    
    public static boolean check(String s) {
        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
            ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
            Set<Integer> set = new TreeSet<>();
            int[] cnt = new int[1000001];
            for(Integer x : a){
                cnt[x]++;
            }
            for(Integer x : b){
                cnt[x]++;
            }
            for(Integer x : a){
                if(b.contains(x) && check(x.toString())){
                    set.add(x);
                }
            }
            int dem=0;
            for(Integer x : set){
                if(dem>10) break;
                System.out.println(x + " " + cnt[x]);
                dem++;
            }
            
        } catch(FileNotFoundException ex) {
            
        }
    }
}
