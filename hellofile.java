/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class hellofile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Hello.txt"));
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
