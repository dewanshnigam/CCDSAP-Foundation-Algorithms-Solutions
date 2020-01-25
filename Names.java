import java.util.*;
import java.io.*;
class Names
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=Integer.parseInt(ob.readLine());
            String a[][]=new String[n][2];
            for(int i=0;i<n;i++)
            {
                a[i]=ob.readLine().split(" ");
            }
            //for(int i=0;i<n;i++)
            //System.out.println(Arrays.toString(a[i]));
            HashMap<String,Integer> h=new HashMap<String,Integer>();
            for(int i=0;i<n;i++)
            {
                Integer d=h.get(a[i][0]);
                if(d==null)
                    h.put(a[i][0],1);
                else
                    h.put(a[i][0],++d);
            }
            for(int i=0;i<n;i++)
            {
                Integer d=h.get(a[i][0]);
                if(d==1)
                sb.append(a[i][0]+"\n");
                else
                sb.append(a[i][0]+" "+a[i][1]+"\n");
            }
        }
        System.out.println(sb);
    }
}
