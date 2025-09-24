/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s;

/**
 *
 * @author Admin
 */
public class S {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1||i==n||i==(n+1)/2){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                
            }
            else if(i<(n+1)/2){
                System.out.print("*");
            }
            else{
                for(int j=1;j<n;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
