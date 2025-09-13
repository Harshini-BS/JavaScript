/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonnaci;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Fibonnaci {

    public static void main(String[] args) {
       int a=0,b=1;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           System.out.println(a+" ");
           int next=a+b;
           a=b;
           b=next;
       }
        
       
    }
}
