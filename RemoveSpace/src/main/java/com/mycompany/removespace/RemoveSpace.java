/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.removespace;

/**
 *
 * @author Admin
 */
public class RemoveSpace {

    public static void main(String[] args) {
       String str="000123000";
       String result=str.replaceAll("^0+|0+$","");
       System.out.println(str);
       System.out.println(result);
    }
}
