import java.util.*;
import java.io.*;
import java.lang.*;
public class DAA1 {

    /**
     * @param args the command line arguments
     */
    public static int checkPythagorean(int n)
    {
        while(n%2 == 0)
        {
            n = n/2;
        }
        int l = (int)Math.sqrt(n);
        for(int i = 3;i<l;i+=2)
        {
            if(n%i == 0 && (n-1)%4==0)
                return 1;
            while(n%i==0)
            {
                n=n/i;
            }
        }
        if(n>2 && (n-1)%4==0)
            return 1;
        return 0;
    }
    public static void main(String[] args) throws IOException , FileNotFoundException{
        // TODO code application logic here
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("javainput.txt"));
        BufferedWriter bw2= new BufferedWriter(new FileWriter("javaoutput.txt"));
        BufferedWriter bw3= new BufferedWriter(new FileWriter("javaminmax.txt"));
        for(int n = 1;n<100;n++)
        {
            int a[] = new int [1000];
            String str1 = Integer.toString(10000*n);
            bw1.append(str1+" ");
            for (int i = 0 ;i<a.length;i++)
            {
                a[i] = (int) (Math.random()*(10000)+10000*n);
            }
            int min = 10000000,max = 0;
            long start,end;
            long interval=0;
            for(int i=0;i<1000;i++)
            {
                start = System.nanoTime();
                int m = checkPythagorean(a[i]);
                end=System.nanoTime();
                interval+=(end-start);
                if( m == 1)
                {
                    if(a[i]>max)
                        max = a[i];
                    if(a[i]<min)
                        min = a[i];
                }
            }
            
   
            //System.out.println(max+" "+min+" "+m);
            String str3 = Integer.toString(max)+" "+Integer.toString(min);
            bw3.append(str3+" ");
            String str2 = Long.toString(interval);
            bw2.append(str2+" ");
        }
        bw1.close();
        bw2.close();
        bw3.close();
    }
}