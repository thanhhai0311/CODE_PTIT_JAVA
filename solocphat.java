/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Dell
 */
public class solocphat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        while(true){
            String s = q.poll();
//            System.out.println(s);
            list.add(s);
            if(s.length()==16){
                break;
            }
            else{
                q.add(s+"6");
                q.add(s+"8");
            }
        }
        //Collections.sort(list, Collections.reverseOrder());
        while(t-->0){
            int dem=0;
            ArrayList<Long> ans = new ArrayList<>();
            int n = sc.nextInt();
            for(String x : list){
                if(x.length()<=n){
                    dem++;
                    ans.add(Long.parseLong(x));
                } 
            }
            Collections.sort(ans, Collections.reverseOrder());
            System.out.println(dem);
            for(long x : ans){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
