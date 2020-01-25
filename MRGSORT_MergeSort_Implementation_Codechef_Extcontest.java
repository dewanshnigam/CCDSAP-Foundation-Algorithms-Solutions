import java.io.*;
import java.util.*;
class MRGSORT_MergeSort_Implementation_Codechef_Extcontest
{
    static StringBuilder ans;
    static int count=0;
    public static void mergesort(int start,int end,int index)
    {
        if(!(start<=index&&index<=end))
        return;
        if(start>end)
        return;
        if(start==end)
        {
            count++;
            ans.append(start+" "+end+"\n");
            return;
        }
        count++;
        ans.append(start+" "+end+"\n");
        int mid=(start+end)/2;
        mergesort(start,mid,index);
        mergesort(mid+1,end,index);
    }
    public static void main(String args[])throws IOException
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int s=ob.nextInt();
            int e=ob.nextInt();
            int i=ob.nextInt();
            if(e<s||i<s||i>e)
            {
                sb.append(-1+"\n");
                continue;
            }
            ans=new StringBuilder();
            count=0;
            mergesort(s,e,i);
            sb.append(ans+""+count+"\n");
        }
        System.out.println(sb);
    }
}
