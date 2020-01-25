import java.util.*;
class K_Prime_Sieve_Prime_Factors_AC
{
    public static void main(String args[])
    {
        ArrayList<Integer> primes=new ArrayList<Integer>();
        boolean isPrime[]=new boolean[100001];
        Arrays.fill(isPrime,true);

        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=100000;i++)
        {
            if(!isPrime[i])
                continue;
            for(int j=i*2;j<=100000;j+=i)
                isPrime[j]=false;
        }

        int k[][]=new int[100001][6];        
        int pf[]=new int[100001];

        pf[0]=0;
        pf[1]=0;
        for(int i=2;i<=100000;i++)
            if(isPrime[i])
            {
                primes.add(i);
                pf[i]=1;
            }

        for(int i=4;i<=100000;i++)    
        {
            if(isPrime[i])
                continue;
            else
            {
                int temp=i;
                for(int x:primes)
                {
                    if(x>temp)
                        break;
                    int flag=0;
                    while((temp%x)==0)
                    {
                        temp/=x;
                        flag=1;
                    }
                    if(flag==1)
                        pf[i]++;
                }
            }
        }

        //System.out.println(primes+"\n"+primes.size());

        //for(int i=0;i<=100;i++)
        //    System.out.println(i+" , "+pf[i]);

        for(int i=1;i<=100000;i++)
        {
            int index=pf[i];
            for(int j=1;j<=5;j++)
            k[i][j]+=k[i-1][j];
            if(index<6)
            k[i][index]++;
        }
        
        for(int i=0;i<=100000;i++)
        System.out.println(Arrays.toString(k[i]));

        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int A=ob.nextInt();
            int B=ob.nextInt();
            int K=ob.nextInt();
            int num=k[B][K]-k[A-1][K];
            sb.append(num+"\n");
        }
        System.out.println(sb);
    }
}
