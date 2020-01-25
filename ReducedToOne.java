/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReducedToOne
{
    public static long MOD=(long)1e9+7;
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner ob=new Scanner(System.in);
        long fc[]=new long[1000000];
        fc[0]=1;
        for(int i=2;i<=1000000;i++)
        {
            fc[i-1]=(fc[i-2]%MOD * i%MOD)%MOD;
        }
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=ob.nextInt();
            long ans=fc[n];
            ans--;
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}
