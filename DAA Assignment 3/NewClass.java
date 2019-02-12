/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Naman-Deept
 */
public class NewClass {
    public static void main(String [] agrs){
      int arr[][] = new int[5][5];
      for(int i=0;i<5;i++){
          for(int j =0 ; j< 5;j++){
              arr[i][j] =(int) (Math.random() * 10);
          }
      }
     for(int i=0;i<5;i++){
          for(int j =0 ; j< 5;j++){
              System.out.print(arr[i][j]+"\t");
          }
          System.out.println();
      }
     System.out.println();
     for(int k=0;k<5;k++){
         ArrayList <Integer>upper = new ArrayList <Integer>();
         ArrayList <Integer>lower = new ArrayList <Integer>();
       for(int i=0;i<5;i++){
         for(int j=0;j<5;j++){
             if(i+k==j){
                 upper.add(arr[i][j]);
             }
             else if(j+k==i && k>0){
                 lower.add(arr[i][j]);
             }
         }
      }
       for(int l=0;l<upper.size();l++){
           System.out.print(upper.get(l)+" ");
       }
       System.out.println();
       for(int z=0;z<lower.size();z++){
           System.out.print(lower.get(z)+" ");
       }
       System.out.println();
     }
   }
}