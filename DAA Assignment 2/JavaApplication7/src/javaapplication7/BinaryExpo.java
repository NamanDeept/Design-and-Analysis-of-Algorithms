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
public class BinaryExpo {
  //  static double x[] = new double[10000];
  
    static double computePower(double a,double n){
        if(n == 1){
            return a;
        }
            double value;
              value = computePower(a,(n/2));  
           return value*value;
        }
    
    public static void main(String args[]){
        System.out.println(computePower(3.32342,16));        
    }
}
