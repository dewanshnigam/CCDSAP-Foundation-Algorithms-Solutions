import java.util.*;
import java.io.*;
class Practice_TSECJ05_Priority_Queue_Kth_MAX_Execution
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int k=ob.nextInt();
            int n=ob.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++)
                al.add(ob.nextInt());
            ArrayList<Integer> sol=new ArrayList<>();
            StringBuilder ans=new StringBuilder();
            PriorityQueue<Integer> pr=new PriorityQueue<Integer>((p1,p2)->(p1-p2));
            pr.add(-1);
            int transaction=1;
            int item;
            int current;
            while(transaction<=n)
            {
                item=al.get(transaction-1);
                if(transaction<k)
                {
                    sol.add(-1);
                    transaction++;
                    pr.add(item);
                    continue;
                }
                current=pr.peek();
                if(current<item)
                {
                    pr.poll();
                    pr.add(item);
                    current=pr.peek();
                }
                sol.add(current);
                transaction++;
            }
            for(int i:sol)
            {
                ans.append(i+" ");
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}