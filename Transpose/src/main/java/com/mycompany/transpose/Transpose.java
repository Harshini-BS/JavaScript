/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transpose;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Transpose {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of rows:");
       int rows=sc.nextInt();
       System.out.println("Enter the no.of colms:");
       int colms=sc.nextInt();
       
       int[][] matrix=new int[rows][colms];
       int[][] transpose=new int[colms][rows];
       
       System.out.println("Enter the value for matrix A:");
       for(int i=0;i<rows;i++){
           for(int j=0;j<colms;j++){
               matrix[i][j]=sc.nextInt();
           }
       }
       System.out.println("Transpose of matrix is:");
       for(int i=0;i<rows;i++){
           for(int j=0;j<colms;j++){
               transpose[j][i]=matrix[i][j];
           }
       }
       for(int i=0;i<colms;i++){
           for(int j=0;j<rows;j++){
               System.out.print(transpose[i][j]+" ");
           }
           System.out.println();
       }
       
    }
}
