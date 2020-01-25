import java.util.*;
import java.io.*;
class GuessTheLoser
{
    public static void main(String args[])throws IOException
    {
        File tcfile=new File("gtl1.txt");
        Scanner ob=new Scanner(tcfile);
        File fw=new File("gtl1sol.txt");
        FileWriter file=new FileWriter(fw);
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            long k=ob.nextLong();
            long l=ob.nextLong();
            long n=ob.nextLong();
            if(k>=l)
            {
                sb.append("Nikhil\n");
                continue;
            }
            long ptr=k;
            int count=1;
            while(ptr<=l)
            {
                count++;
                ptr+=n;
                n++;
            }
            if(count%2==0)
                sb.append("Nikhil\n");
            else
                sb.append("Sahil\n");
        }
        System.out.println(sb);
    }
}