import java.util.*;
class Mid_Of_Stack
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        Stack<Integer> st=new Stack<Integer>();        
        int counter=0;
        int midIndex=0;
        int midValue=0;
        System.out.println("Enter 1 to push value | -1 to pop value | 0 to Exit : ");
        for(int i=0;i<1;i--)
        {
            int ch=ob.nextInt();
            if(ch==0)
                break;
            if(ch==1)
            {
                System.out.println("Enter the value : ");
                int value=ob.nextInt();
                st.push(value);
                counter++;
                if(counter%2!=0)
                {
                    midIndex++;
                    midValue=st.peek();
                }
                System.out.println(" Stack : "+st+" Current Mid Element : "+midValue +" at Index : "+midIndex);                
                continue;
            }
            else
            {
                st.pop();
                counter--;
                if(counter%2!=0)
                    midIndex--;
                System.out.println(" Stack : "+st+" Current Mid Element : "+midValue +" at Index : "+midIndex);                
            }
        }
    }
}
