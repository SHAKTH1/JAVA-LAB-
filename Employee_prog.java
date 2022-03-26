import java.util.*;
class Employee
{
    int E_id, E_Age;
    String E_Dept, E_Desg; 
    double E_Basic_Pay;
    Employee(int E_id,int E_Age, String E_Dept, String E_Desg,double E_Basic_Pay)
    {
        this.E_Age = E_Age;
        this.E_id = E_id;
        this.E_Dept = E_Dept;
        this.E_Basic_Pay = E_Basic_Pay;
        this.E_Desg = E_Desg;
    }
}
class Salesperson extends Employee
{
    int Units_Sold;
    Salesperson(int E_id,int E_Age, String E_Dept, String E_Desg,double E_Basic_Pay,int Units_Sold)
    {
        super(E_id, E_Age, E_Dept, E_Desg, E_Basic_Pay);
        this.Units_Sold = Units_Sold;

    }
    double Calculate_Comission()
    {
        if(Units_Sold < 100)
        return(0.02*E_Basic_Pay);
        else
        return(0.04*E_Basic_Pay);
    }
}

class start
{
    public static void main(String[] args) 
    {
        int E_id,E_Age,Units_Sold;;
        String E_Dept,E_Desg;
        double E_Basic_Pay;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of employees : ");
        int n = sc.nextInt();
        Salesperson s1[] = new Salesperson[n];
        for(int i = 0; i<n; i ++)
        {
            System.out.print("\nEnter Employee id : ");
            E_id = sc.nextInt();
            System.out.print("\nEnter Employee age : ");
            E_Age = sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter Employee Dept. : ");
            E_Dept = sc.nextLine();
            System.out.print("\nEnter Employee Desg. : ");
            E_Desg = sc.nextLine();
            System.out.print("\nEnter Employee Basic Pay : ");
            E_Basic_Pay = sc.nextDouble();
            System.out.print("\nEnter no. of units sold by the employee : ");
            Units_Sold = sc.nextInt();
            s1[i] = new Salesperson(E_id, E_Age, E_Dept, E_Desg, E_Basic_Pay,Units_Sold);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print("The comission of Sales person "+(i+1)+" is : " +s1[i].Calculate_Comission());
        }
    }
}
