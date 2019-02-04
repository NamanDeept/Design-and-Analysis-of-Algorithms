/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naman Deept
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        BufferedWriter bw2;
        BufferedWriter bw3;
        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter("input1.txt"))) {
            bw2 = new BufferedWriter(new FileWriter("C:\\Users\\Naman Deept\\Desktop\\output2.txt"));
            bw3 = new BufferedWriter(new FileWriter("C:\\Users\\Naman Deept\\Desktop\\output4.txt"));
            for(int i=0;i<10000;i++)
            {
                //Scanner scan = new Scanner(System.in);
                long time1 = 0 , time , start ,end ;
                String f;
                f = String.format("%d",(int)Math.random()*10000);
                double num = Double.parseDouble(falana);
                bw1.append(f+"\n");
                if(num == 0){
                    System.out.println("Cannot divide by 0 (Math Error)");
                }
                String ans="";
                if(num<0){
                    ans ="-0.";
                }
                else if(num>0 && num!=1){
                    ans="0.";
                }
                else if(num==1){
                    ans = "";
                }
                num = Math.abs(num);
                String str;
                str = Double.toString(num);
                String zeroes;
                start = System.nanoTime();
                zeroes = "1"+generateZero(num);
                end=System.nanoTime();
                time1 += end -start;
                bw2.append(Long.toString(time1)+" ");
                long dividend = Long.parseLong(zeroes);
                start = System.nanoTime();
                long divisor = returnback(num);
                end=System.nanoTime();
                time1 += end -start;
                int precision = 0;
                int quotient;
                ans+=generateAZero(num);
                start = System.nanoTime();
                while(precision<=100)
                {
                    quotient = 0;
                    while(dividend>=divisor)
                    {
                        dividend = dividend - divisor;
                        quotient++;
                    }
                    precision++;
                    ans+=quotient;
                    if(dividend==0)
                        break;
                    String divStr = Long.toString(dividend);
                    int counter =0;
                    while(true)
                    {
                        dividend= Long.parseLong(divStr);
                        divStr+="0";
                        if(dividend > divisor)
                            break;
                        precision++;
                        counter++;
                    }
                    ans+=addZero(counter);
                }
                end = System.nanoTime();   
                time = (end - start);
               // System.out.println(ans);
                bw3.append(Long.toString(time)+"\n");
            }
        }
        bw2.close();
        bw3.close();
                
    }
    public static String addZero(int c)
    {
        String res="";
        for(int i=1;i<c;i++)
            res+=0;
        return res;
    }
    public static String generateZero(double num)
    { 
        String temp = Double.toString(num);
        String numZero = "";
        for(int i=0;i<temp.length();i++)
        {
            if(temp.charAt(i)=='.')
                continue;
            numZero +="0";
        }
        return numZero;
    }
    public static String generateAZero(double nm)
    {
       String result ="";
       int num = (int)Math.round(nm);
         String len= Integer.toString(num);
         for(int i=1;i<len.length();i++)
             result+="0";
         return result;
    }
    public static long returnback(double num)
    {
        String str = Double.toString(num);
        String res ="";
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
                continue;
            res+=str.charAt(i);
        }
        long result = Long.parseLong(res);
        return result;
    }
}
