import java.util.*;
import java.lang.*;
import java.io.*;
class NextHappyNumber
{
    public static boolean check;
    public static boolean touched[];
    public static void checkHappy(int num)
    {
        if(touched[num])
            return;
        touched[num]=true;
        if(num==1)
        {            
            check=true;
            return;
        }
        int sum=0;
        while(num!=0)
        {
            int a=num%10;
            sum+=(a*a);
            num/=10;
        }
        System.out.println(sum);
        checkHappy(sum);
    }

    public static void main (String[] args)
    {
        boolean happy[]=new boolean[1101];
        touched=new boolean[1101];
        for(int i=1;i<1101;i++)
        {
            check=false;
            Arrays.fill(touched,false);
            checkHappy(i);
            if(check)
            System.out.println(i+" is Happy ");
            happy[i]=check;
        }
        ArrayList<Integer> isHappy=new ArrayList<Integer>();
        for(int i=0;i<1101;i++)
            if(happy[i])
                isHappy.add(i);
        System.out.println(isHappy);
        Scanner ob=new Scanner(System.in);
        //code
        StringBuilder sb=new StringBuilder();
        int t=ob.nextInt();
        while(t-->0)
        {
            int n=ob.nextInt();
            for(int i=n+1;i<happy.length;i++)
            {
                if(happy[i])
                {
                    sb.append(i+"\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}