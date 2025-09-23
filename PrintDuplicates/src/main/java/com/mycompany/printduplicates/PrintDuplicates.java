/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printduplicates;

import java.util.LinkedHashSet;

/**
 *
 * @author Admin
 */import java.util.*;
public class PrintDuplicates {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,1,2,3,3,3,4,6,7};
        Set <Integer> update=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            update.add(a[i]);
        }
        System.out.println(update);
        for(int num:update){
            System.out.println(num);
        }
    }
}
