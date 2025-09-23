/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixaddition;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no. of cols");
        int cols=sc.nextInt();
        int[][] a=new int[rows][cols];
        int[][] b=new int[rows][cols];
        int[][] c=new int[rows][cols];
        
        System.out.println("Enter the values for matrix A:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the values for matrix B:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Final Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(c[i][j]+" ");
            }
        }
        System.out.println();
       
    }
}
