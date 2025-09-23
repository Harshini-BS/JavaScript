/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearch;

/**
 *
 * @author Admin
 */
import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
       int[] a={100,546,212,77410,299};
       Arrays.sort(a);
       int searchkey=77410;
       int start=0;
       int stop=a.length-1;
      
       while(start<=stop){
           int mid=(start+stop)/2;
           if(a[mid]==searchkey){
               System.out.println("The Element "+ a[mid]+" found at "+mid);
               break;
           }
           else if(a[mid]>searchkey){
               stop=mid-1;
           }
           else{
               start=mid+1;
           }
       }
       
    }
}
