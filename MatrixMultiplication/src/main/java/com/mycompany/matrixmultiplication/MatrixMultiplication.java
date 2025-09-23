/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixmultiplication;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows in marix A:");
        int r1=sc.nextInt();
        System.out.println("Enter no.of cols in marix A:");
        int c1=sc.nextInt();
        System.out.println("Enter no.of rows in marix B:");
        int r2=sc.nextInt();
        System.out.println("Enter no.of clos in marix B:");
        int c2=sc.nextInt();
        
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        int[][] c=new int[r1][c2];
        
        
        System.out.println("Enter values for Matrix A:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
         
        System.out.println("Enter values for Matrix B:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
                
            }
        }
         
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                c[i][j]=0;
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                
                }
                
            }
        }
        System.out.println("Final Matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
               System.out.print(c[i][j]+" ");
                
            }
        }
        System.out.println();
        
    }
}
