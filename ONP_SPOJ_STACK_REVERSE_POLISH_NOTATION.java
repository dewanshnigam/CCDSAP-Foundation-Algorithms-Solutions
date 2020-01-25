import java.util.*;
import java.io.*;
class ONP_SPOJ_STACK_REVERSE_POLISH_NOTATION
{
    public static int checkChar(char c)
    {
        if(c>=97&&c<=122)
        return 0;
        if(c=='(')
        return 1;
        if(c==')')
        return -1;
        return 2;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            String s=ob.readLine();
            char a[]=s.toCharArray();
            Stack<String> var=new Stack<String>();
            Stack<Character> br=new Stack<Character>();
            Stack<Character> opr=new Stack<Character>();
            for(char x:a)
            {
                int ch = checkChar(x);
                if(ch==1)
                {
                    br.push(x);
                    continue;
                }
                if(ch==0)
                {
                    String st=""+x;
                    var.push(st);
                    continue;
                }
                if(ch==2)
                {
                    opr.push(x);
                    continue;
                }
                br.pop();
                String op1=var.pop();
                String op2=var.pop();
                String operate = op2+op1+opr.pop();
                var.push(operate);
            }
            sb.append(var.pop()+"\n");
        }
        System.out.println(sb);
    }
}
