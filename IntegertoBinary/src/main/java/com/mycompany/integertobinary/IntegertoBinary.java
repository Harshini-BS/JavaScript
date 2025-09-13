/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.integertobinary;

/**
 *
 * @author Admin
 */
public class IntegertoBinary {

    public static void main(String[] args) {
        int num=25;
        String binary="";
        while(num>0){
            int remainder=num%2;
           binary=remainder+binary;
           num/=2;
        }
        System.out.println("The binary no is:"+binary);
        
    }
}
