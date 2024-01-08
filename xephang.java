/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class Pair {
    private int x, y;

    public Pair() {
    }

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}

public class xephang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Pair[] ds = new Pair[n];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            ds[i] = new Pair(x, y);
        }
        Arrays.sort(ds, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.getX() - o2.getX();
            }
            
        });
        int ans=0;
        for(int i=0; i<n; i++){
            if(ans<ds[i].getX()){
                ans = ds[i].getX() + ds[i].getY();
            }
            else ans = ans + ds[i].getY();
        }
        System.out.println(ans);
    }
}
