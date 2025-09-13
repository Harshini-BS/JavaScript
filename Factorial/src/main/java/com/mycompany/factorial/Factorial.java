/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class Factorial {
    /*public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
}

    public static void main(String[] args) {
        System.out.println("Factorial of the no is "+fact(5));
    }*/
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
             result*=i;
        }
        System.out.println("The factorial of given no is  "+result);
    }

}
