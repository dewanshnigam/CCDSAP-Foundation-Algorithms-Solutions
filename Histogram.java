import java.util.*;
import java.lang.*;
import java.io.*;
class Histogram
{
    public static void main (String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));        
        //code
        int t=Integer.parseInt(ob.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=Integer.parseInt(ob.readLine());
            long a[]=new long[n];
            String ar[]=ob.readLine().split(" ");
            for(int i=0;i<n;i++)
                a[i]=Long.parseLong(ar[i]);
            long maxSoFar=0L;
            long rectArea;
            Stack<Integer> st=new Stack<Integer>();
            int i=0;
            while(i<n)
            {
                if(st.isEmpty() || a[st.peek()]<a[i])
                {
                    st.push(i);
                    i++;
                }
                else
                {
                    int topElement = st.peek();
                    st.pop();
                    if(st.isEmpty())
                    {
                        rectArea = a[topElement] * i;
                        maxSoFar = Math.max(maxSoFar,rectArea);
                    }
                    else
                    {
                        rectArea = a[topElement] * (i-st.peek()-1);
                        maxSoFar = Math.max(maxSoFar,rectArea);
                    }
                }
            }
            while(!st.isEmpty())
            {
                int topElement = st.peek();
                st.pop();
                if(st.isEmpty())
                {
                    rectArea = a[topElement] * i;
                    maxSoFar = Math.max(maxSoFar,rectArea);
                }
                else
                {
                    rectArea = a[topElement] * (i-st.peek()-1);
                    maxSoFar = Math.max(maxSoFar,rectArea);
                }
            }
            sb.append(maxSoFar+"\n");
        }
        System.out.println(sb);
    }
}