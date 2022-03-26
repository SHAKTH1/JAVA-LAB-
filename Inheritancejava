import java.util.*;
class Police
{
    String job,name;
    int age,id;
    Police(String name, int age, int id)
    {
        job = "Police";
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    void printDetails()
    {
        System.out.println("Job : "+job);
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Id : "+ id);
    }

}

class Male extends Police
{
    String gender;
    Male(String name, int age, int id)
    {
        super(name,age,id);
        gender = "Male"; 

    }
    
    void printDetails()
    {
        System.out.println("Job : "+job);
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Id : "+ id);
        System.out.println("Gender : "+ gender);
    }
}

class Female extends Police
{
    String gender;
    Female(String name, int age, int id)
    {
        super(name,age,id);
        gender = "Female"; 

    }
    
    void printDetails()
    {
        super.printDetails();
        System.out.println("Gender : "+ gender);
    }

}

class lawAndOrder extends Female
{
    String mainTask;
    lawAndOrder(String name, int age, int id)
    {
        super(name,age,id);
	    mainTask = "Law and Order";

    }

    void printDetails()
    {
        super.printDetails();
        System.out.println("Main Task  : "+ mainTask );
    }
}

class crimeBranch extends Male
{
    String mainTask;
    crimeBranch(String name, int age, int id)
    {
        super(name,age,id);
        mainTask = "Crime Branch";
    }

    void printDetails()
    {
        super.printDetails();
        System.out.println("Main Task  : "+ mainTask);
    }
}


class start
{
    public static void main(String[] args) 
    {
        String name;
        int age,id;
        Scanner sc = new Scanner(System.in);
        for(;;)
        { 
            System.out.println("\n1.Police\n2.Male\n3.Female\n4.Law and Order\n5.Crime Branch");
            int ch = sc.nextInt();
            switch(ch)
            { 
                case 1:
                System.out.println("Enter the name : ");
                name = sc.next();
                System.out.println("Enter the age : ");
                age = sc.nextInt();
                System.out.println("Enter your id :");
                id = sc.nextInt();
                Police p1 = new Police(name,age,id);
	            p1.printDetails();
		        break;

		case 2:
                System.out.println("Enter the name : ");
                name = sc.next();
                System.out.println("Enter the age : ");
                age = sc.nextInt();
                System.out.println("Enter your id :");
                id = sc.nextInt();
                Male m1 = new Male(name,age,id);
	            m1.printDetails();
		        break;


		case 3:
                System.out.println("Enter the name : ");
                name = sc.next();
                System.out.println("Enter the age : ");
                age = sc.nextInt();
                System.out.println("Enter your id :");
                id = sc.nextInt();
                Female f1 = new Female(name,age,id);
	            f1.printDetails();
		        break;

		case 4:
                System.out.println("Enter the name : ");
                name = sc.next();
                System.out.println("Enter the age : ");
                age = sc.nextInt();
                System.out.println("Enter your id :");
                id = sc.nextInt();
                lawAndOrder l1 = new lawAndOrder(name,age,id);
	            l1.printDetails();
		        break;

		case 5:
                System.out.println("Enter the name : ");
                name = sc.next();
                System.out.println("Enter the age : ");
                age = sc.nextInt();
                System.out.println("Enter your id :");
                id = sc.nextInt();
                crimeBranch c1 = new crimeBranch(name,age,id);
	            c1.printDetails();
		        break;

        	default:return;
            }
        }
    }
  
}

