/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Naman Deept
 */
public class NewClass1 {
  
    public static void main(String []args) throws IndexOutOfBoundsException{
        Scanner s= new Scanner(System.in);         
        ArrayList<Integer>arr = new ArrayList<>();
        int size =10;
        for(int i=0;i<size;i++){
          //arr.add((int) (10 * Math.random()));
          int n = s.nextInt();
          arr.add(n);
        }
        //Creating an array of arraylist in java
        int count=0;
        for(int i=0;i<size;i++){
            System.out.print(arr.get(i)+" ");
            if(i+1<size && arr.get(i)>arr.get(i+1)){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        int counter=0;
        ArrayList<Integer>[]arrl = new ArrayList[count+1];
        for(int i=0;i<count+1;i++){
            arrl[i] = new ArrayList<>();
        }
        for(int i=0;i<size;i++){
            
            if(i+1<size && arr.get(i)>arr.get(i+1)){
                 arrl[counter].add(arr.get(i));
                counter++;
            } 
            else{
            arrl[counter].add(arr.get(i));
            }
        }
        for(int i=0;i<counter+1;i++){
            for(int j=0;j<arrl[i].size();j++){
                System.out.print(arrl[i].get(j)+" ");
            }
        System.out.println();
        }
    }
}
