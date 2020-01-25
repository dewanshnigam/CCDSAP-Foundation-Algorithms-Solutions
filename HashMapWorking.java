import java.util.*;
import java.io.*;
public class HashMapWorking
{
    public static void main(String args[])
    {
        Employee emp1 = new Employee(1,"Nishcarsh",10_00_00_000.0);
        Employee emp2 = new Employee(2,"Dewansh",1_00_00_000.0);
        Employee emp3 = new Employee(3,"Jack",100.0);
        Employee emp4 = new Employee(4,"Jack",100.0);
        HashMap<Employee,Integer> office=new HashMap<>();
        //               EmpID
        office.put(emp1,1);
        office.put(emp2,2);
        office.put(emp3,3);
        office.put(emp4,4);        
        System.out.println(" Size : "+office.size());
        for(Map.Entry m:office.entrySet())
        {
            Employee temp=(Employee)m.getKey();
            int ID=(int)m.getValue();
            System.out.println("Key : "+temp.name+" , "+temp.ID+" , "+" Value : "+ID);
        }
    }
}
class Employee
{
    int ID;
    String name;
    double salary;
    public static int hashcode;
    public Employee(int ID,String name,double salary)
    {
        this.ID=ID;
        this.name=name;
        this.salary=salary;
        hashcode=0;
    }

    public String getName()
    {return name;}

    public int getID()
    {return ID;}

    public double getSalary()
    {return salary;}

    @Override
    public boolean equals(Object obj)
    {
        Employee temp=(Employee)obj;
        if(temp.name==name)
        return true;
        return false;
    }
    @Override
    public int hashCode()
    {
        return 0;
    }
}    