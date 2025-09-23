/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.duplicates;

/**
 *
 * @author Admin
 */
public class Duplicates {

    public static void main(String[] args) {
       int[] a={1,2,3,4,5,6,7,1,2,3,3,3,6,6};
       int duplicates=0;
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
                  duplicates++; 
               }
           }
       }
       System.out.println("No.of Duplicates in the array:"+duplicates);
    }
}
