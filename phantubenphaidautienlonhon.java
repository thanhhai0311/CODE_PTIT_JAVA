/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;
import java.util.*;
public class phantubenphaidautienlonhon {
    public static void check(int[] a,int n){
        for( int i=0;i<n-1;i++){
            int res=-1;
            for( int j=i+1;j<n;j++){
                if( a[j] > a[i]){
                    res=a[j];
                    break;
                }
            }
            System.out.print(res+" ");
        }
        System.out.println(-1);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int k=sc.nextInt();
            int[] a= new int[k];
            for( int i=0;i<k;i++){
                a[i]=sc.nextInt();
            }
            check(a,k);
        }
    }
}
