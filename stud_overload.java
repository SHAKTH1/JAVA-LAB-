import java.util.*;
class Student
{
    String USN, name;
    Student(String USN, String name)
    {
        this.USN = USN;
        this.name = name;
    }
}

class Marks extends Student
{
    int[] marks = new int[3];

    Marks(String USN, String name,int marks[])
    {
        super(USN,name);
        for(int i=0;i<3;i++)
            this.marks[i] = marks[i];
    }

    void printMarks()
    {
        for(int i=0;i<3;i++)
        System.out.print(marks[i]+" ");
        System.out.println();
    }

    double averageMarks()
    {
        double avg = 0;
        for(int i = 0;i<3;i++)
            avg += marks[i];
        return (double)avg/3.0;
    }
}

class start
{
    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        String USN, name;

        Marks students[] = new Marks[3];
        for(int i = 0; i<3; i++)
        {
            System.out.print("Enter the USN : ");
            USN = sc.next();
            System.out.print("Enter your Name : ");
            name = sc.next();
            System.out.print("Enter the marks of 3 subjects : ");
            for(int j = 0; j< 3; j++)
                marks[j] = sc.nextInt();
            students[i] = new Marks(USN,name,marks);
        }

        for(int i = 0; i < 3; i++)
        {
            System.out.print("The marks of "+students[i].name+" is ");students[i].printMarks();
            System.out.println("The average of "+students[i].name+" is "+students[i].averageMarks());
        }
    }
}
