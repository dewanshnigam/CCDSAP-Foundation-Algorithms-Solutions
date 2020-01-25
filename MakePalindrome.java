import java.util.*;
import java.io.*;
class MakePalindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String s=ob.readLine();
        char a[]=s.toCharArray();
        int y=a.length-1;
        int x=0;
        int flag=0;
        while(x<y)
        {
            if(a[x]=='*' && a[y]=='*')
            {
                a[x]='a';
                a[y]='a';
            }
            else if(a[x]=='*' && a[y]!='*')
                a[x]=a[y];
            else if(a[y]=='*' && a[x]!='*')
                a[y]=a[x];
            else
            {
                if(a[x]!=a[y])
                {
                    flag=1;
                    break;
                }
            }
            x++;
            y--;
        }        
        if(flag==1)
            System.out.println("Not Possible!");
        else
        {
            String str="";
            for(int i=0;i<a.length;i++)
            str+=a[i];
            System.out.println("Possible! Palindrome: "+str);
        }
    }
}
