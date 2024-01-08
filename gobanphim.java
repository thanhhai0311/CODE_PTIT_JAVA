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
public class gobanphim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char k = s.charAt(i);
            if(k=='<'){
                if(st1.size()>0){
                    st2.push(st1.peek());
                    st1.pop();
                }
            }
            else if(k=='>'){
                if(st2.size()>0){
                    st1.push(st2.peek());
                    st2.pop();
                }
            }
            else if(k=='-'){
                if(st1.size()>0){
                    st1.pop();
                }
            }
            else st1.push(k);
            
        }
        while(st1.size()>0){
            st2.push(st1.peek());
            st1.pop();
        }
        while(st2.size()>0){
            System.out.print(st2.peek());
            st2.pop();
        }
        System.out.println("");
    }
}
