/*

Approach : Make use of a stack and number '0' to differentiate between the two operations
seperated with brackets.

   */
import java.util.*;
import java.io.*;
class MMASS_Molecule_SPOJ_Stack_Implementation_Very_Important
{
    public static int getAns(String str)
    {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('C',12);
        h.put('H',1);
        h.put('O',16);
        str='('+str+')';
        char a[]=str.toCharArray();
        Stack<Integer> stack=new Stack<>();
        for(char x:a)
        {
            if(x=='(')
            {
                stack.push(0);
                continue;
            }
            else if(x==')')
            {
                int sum=0;
                int ptr=stack.pop();
                while(ptr!=0)
                {
                    sum+=ptr;
                    ptr=stack.pop();
                }
                stack.push(sum);
                continue;
            }
            Integer d=h.get(x);
            if(d!=null)
            {
                stack.push(d);
                continue;
            }
            int val=stack.pop()*(x-'0');
            stack.push(val);
        }
        return stack.pop();
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String s=ob.readLine();
        int sol=getAns(s);
        System.out.println(sol);
    }
}
