/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Dell
 */
public class kiemtradayngoacdung {
    public static int check(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char k = s.charAt(i);
            if(k==')'){
                if(st.empty() || st.peek()!='(') return 0;
                st.pop();
            }
            else if(k==']'){
                if(st.empty() || st.peek()!='[') return 0;
                st.pop();
            }
            else if(k=='}'){
                if(st.empty() || st.peek()!='{') return 0;
                st.pop();
            }
            else{
                st.push(k);
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

//2
//[()]{}{[()()]()}
//[(])