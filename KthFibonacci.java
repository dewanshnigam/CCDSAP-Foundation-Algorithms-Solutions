import java.util.*;
class KthFibonacci
{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int count=3;
        System.out.print(a+" " +b+" ");
        for(int i=2;i<480;i++)
        {
            if(i%15==0)
            System.out.println();
            if(i%60==0)
            System.out.println();
            int c=(a+b)%10;
            a=b;
            b=c;
            count++;
            System.out.print(c+" ");
        }
    }
}
