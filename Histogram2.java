import java.util.*;
import java.lang.*;
import java.io.*;
class Histogram2
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
            Stack<Integer> st=new Stack<Integer>();
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++)
                map.put(i,1);
            Iterator itr;
            for(int i=0;i<n;i++)
            {            
                Collections.reverse(st);
                itr=st.iterator();
                int copy=0;
                while(itr.hasNext())
                {
                    int index=(int)itr.next();
                    int number=(int)map.get(index);
                    //System.out.println("@ : "+i+" : "+"("+index+" , "+number+")");
                    if(a[i]<=a[index])
                    {
                        itr.remove();
                        copy=Math.max(copy,number);
                    }
                    else
                    {
                        number++;
                        map.put(index,number);
                        long rectArea=(a[index]*((long)number));
                        maxSoFar=Math.max(maxSoFar,rectArea);
                    }
                }
                st.push(i);
                map.put(i,(copy+1));
                //System.out.println("@ Index : "+i+" Stack : "+st+" , "+map);                
                long rectArea=(a[i]*((long)(copy+1)));
                //System.out.println("Max So Far : "+maxSoFar);
                maxSoFar=Math.max(maxSoFar,rectArea);
            }
            sb.append(maxSoFar+"\n");
        }
        System.out.println(sb);
    }
}