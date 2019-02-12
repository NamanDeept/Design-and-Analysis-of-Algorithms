/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Naman Deept
 */
public class left_diagonal {
    public static void main(String []args){
        int size =10;
        int arr[][] = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println();
        //Lower left diagonal
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                System.out.print(arr[j][j-i]+" ");
            }
            System.out.println();
        }
        //Upper Left Diagonal
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                System.out.print(arr[j-i-1][j]+" ");
            }
            System.out.println();
        }
    }
}
