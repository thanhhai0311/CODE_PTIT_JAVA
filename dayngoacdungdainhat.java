/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import static java.lang.Integer.max;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Dell
 */
public class dayngoacdungdainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int dem=0;
            for(int i=0; i<s.length(); i++){
                char k = s.charAt(i);
                if(k=='(') st.push(i);
                else{
                    st.pop();
                    if(!st.empty()){
                        dem=max(dem, i-st.peek());
                    }
                    else{
                        st.push(i);
                    }
                }
            }
            System.out.println(dem);
        }
    }
}
