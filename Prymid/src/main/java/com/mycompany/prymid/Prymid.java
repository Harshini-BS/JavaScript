/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prymid;

/**
 *
 * @author Admin
 */
public class Prymid {

    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
