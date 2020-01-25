import java.util.*;
import java.io.*;
class Profit
{
    public static void main(String args[])throws IOException
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=ob.nextInt();
            long a[]=new long[n];
            long b[]=new long[n];
            long adp[]=new long[n];
            long bdp[]=new long[n];            
            for(int i=0;i<n;i++)
            {
                a[i]=ob.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                b[i]=ob.nextInt();
            }

            adp[0]=a[0];
            bdp[0]=b[0];
            for(int i=1;i<n;i++)
            {
                adp[i]=a[i]+adp[i-1];
                bdp[i]=b[i]+bdp[i-1];
            }
            long maxProfit=0L;
            maxProfit=Math.max(maxProfit,bdp[n-1]);
            maxProfit=Math.max(maxProfit,adp[n-1]);            
            for(int i=0;i<n;i++)
            {
                long sum=adp[i]+(bdp[n-1]-bdp[i]);
                maxProfit=Math.max(maxProfit,sum);
            }
            sb.append(maxProfit+"\n");
        }
        System.out.println(sb);
    }
}
