/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class Pair<K1, K2> {
    K1 x;
    K2 y;

    public Pair() {
    }
    
    public Pair(K1 x, K2 y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean nto(int n) {
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public boolean isPrime() {
        if(this.nto((Integer)x) && this.nto((Integer)y)) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
    
    
}

public class loppair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    } 
}
