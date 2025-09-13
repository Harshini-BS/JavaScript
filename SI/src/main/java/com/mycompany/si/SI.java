/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.si;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class SI {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      float principle=sc.nextInt();
      float interest=sc.nextInt();
      float time=sc.nextInt();
      float si=(principle*interest*time)/100;
      System.out.println("The Simple interest is "+si);
    }
}
