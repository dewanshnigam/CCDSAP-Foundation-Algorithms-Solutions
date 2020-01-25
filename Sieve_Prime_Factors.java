/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sieve_Prime_Factors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		boolean isPrime[]=new boolean[100001];
		Arrays.fill(isPrime,true);
		ArrayList<Integer> primes=new ArrayList<Integer>();
		
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i<100001;i++)
		{
		    if(!isPrime[i])
		    continue;
		    for(int j=i*2;j<100001;j+=i)
		    isPrime[j]=false;
		}
		
		for(int i=0;i<100001;i++)
		if(isPrime[i])
		primes.add(i);
		
		//System.out.println(primes);
		
		int primeFactors[]=new int[100001];
		primeFactors[0]=0;
		primeFactors[1]=0;
		for(int i=2;i<=100000;i++)
		{
		    if(isPrime[i])
		    {
		        primeFactors[i]=1;
		        continue;
		    }
		    int temp=i;
		    for(int x:primes)
		    {
		        int flag=0;
		        while((temp%x)==0)
		        {
		            temp/=x;
		            flag=1;
		        }
		        if(flag==1)
		        primeFactors[i]++;
		    }
		}
		
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		StringBuilder sb=new StringBuilder();
		while(t-->0)
		{
		    int a=ob.nextInt();
		    int b=ob.nextInt();
		    int k=ob.nextInt();
		    int totalCount=0;
		    for(int i=a;i<=b;i++)
		    {
		        if(primeFactors[i]==k)
		        totalCount++;
		    }
		    sb.append(totalCount+"\n");
		}
		System.out.println(sb);
	}
}