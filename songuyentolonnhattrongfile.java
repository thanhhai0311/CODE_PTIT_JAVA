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
import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class songuyentolonnhattrongfile {
    public static int nto(int n){
        if(n<2) return 0;
        for(int i=2; i<=sqrt(n); i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
            int[] cnt = new int[1000001];
            ArrayList<Integer> b = new ArrayList<>();
            for(Integer x : a){
                cnt[x]++;
                if(nto(x)==1 && cnt[x]==1) b.add(x);
            }
            Collections.sort(b, Comparator.reverseOrder());
            for(int i=0; i<10; i++){
                System.out.println(b.get(i) + " " + cnt[b.get(i)]);
            }
        } catch(FileNotFoundException ex) {
            
        }
    }
}
