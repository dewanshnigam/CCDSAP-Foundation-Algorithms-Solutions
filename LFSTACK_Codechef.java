import java.util.*;
import java.io.*;
class LFSTACK_Codechef
{
    public static void main(String args[])throws IOException
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=ob.nextInt();
            ArrayList<Stack<Integer>> al=new ArrayList<>();
            for(int i=0;i<n;i++)
                al.add(new Stack<Integer>());
            Stack<Integer> num=new Stack<>();
            int total=0;
            for(int i=0;i<n;i++)
            {
                int number=ob.nextInt();
                total+=number;
                for(int j=0;j<number;j++)
                {
                    int temp=ob.nextInt();
                    al.get(i).push(temp);
                }
            }
            HashMap<Integer,Integer> h=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int top=al.get(i).peek();
                h.put(i,top);
            }
            for(int i=0;i<(total);i++)
            {
                int data=ob.nextInt();
                num.push(data);
            }
            boolean flag=true;
            while(!num.isEmpty())
            {
                int ele=num.pop();
                Integer d=h.get(ele);
                if(d==null)
                {
                    flag=false;
                    break;
                }
                al.get(d).pop();
                if(al.get(d).isEmpty())
                {
                    h.put(d,null);
                    continue;
                }
                h.put(d,al.get(d).peek());
            }
            if(flag)
            sb.append("Yes\n");
            else
            sb.append("No\n");
        }
        System.out.println(sb);
    }
}
