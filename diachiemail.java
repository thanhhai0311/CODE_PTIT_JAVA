/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(t-->0){
            String n = sc.nextLine();
            String s;
            int idx = 0;
            while(idx < n.length()){
                if(n.charAt(idx)==' '){
                    idx++;
                }
                else break;
            }
            s = n.substring(idx, n.length());
            //System.out.println(s);
            s = s.toLowerCase();
            String[] arr = s.split("\\s+");
            String tmp = arr[arr.length-1];
            //System.out.print(arr[arr.length-1]);
            for(int i=0; i<arr.length-1; i++){
                tmp += arr[i].charAt(0);
                //System.out.print(arr[i].charAt(0));
            }
            if(map.containsKey(tmp)){
                System.out.println(tmp + (map.get(tmp)+1) + "@ptit.edu.vn");
                map.put(tmp, map.get(tmp)+1);
            }
            else{
                System.out.println(tmp + "@ptit.edu.vn");
                map.put(tmp, 1);
            }
            
            //System.out.print("@ptit.edu.vn");
            //System.out.println("");
        }
    }
}


//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH