/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.armstrong;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        int digits=String.valueOf(num).length();
        while(num>0){
            int d=num%10;
             sum+=Math.pow(d,digits);
             num/=10;
            
            
        }
        if(sum==original){
            System.out.println(original+" Yes the given no is Armstrog number");
        }
        else{
             System.out.println(original+" No the given no is not Armstrog number");
        }
       
    }
}
