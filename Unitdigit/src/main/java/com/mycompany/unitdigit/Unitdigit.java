/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitdigit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Unitdigit {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      String[] parts=input.split("\\^");
      int a=Integer.parseInt(parts[0]);
      int b=Integer.parseInt(parts[1]);
      int base=a%10;
      if(b==0){
          System.out.println(1);
          return;
      }
      int[] cycle=new int[4];
      cycle[0]=base%10;
      for(int i=1;i<4;i++){
          cycle[i]=(cycle[i-1]*base)%10;
      }
      int idx=(b-1)%4;
      System.out.println(cycle[idx]);
      
    }
}
