import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Student
{
  String usn, name;
  int credits[] = new int[5];
  int marks[] = new int[5];
  void display()
  {
    System.out.println("USN : "+this.usn);
    System.out.println("Name : "+this.name);
    for(int i=0;i<credits.length;i++)
    System.out.println("Credits of subject no. " + (i+1) + " is: " + this.credits[i]);
    for(int i=0;i<marks.length;i++)
    System.out.println("Marks of subject no. " + (i+1) + " is: " + this.marks[i]);
  }

  void sgpa()
  {
    int total_creds = 0;
    float sgpa_final = 0;
    for(int i =0; i < 5; i++)
    {
      int grade_points;
      if(marks[i] >= 90)
        grade_points = 10;
      else if(marks[i] >= 80)
        grade_points = 9;
      else if(marks[i] >= 70)
        grade_points = 8;
      else if(marks[i] >= 60)
        grade_points = 7;
      else if(marks[i] >= 50)
        grade_points = 6;
      else if(marks[i] >= 35)
        grade_points = 5;
      else
        grade_points = 0;
    sgpa_final += grade_points*this.credits[i];
    total_creds += this.credits[i];
    }
    System.out.println("The SGPA of the student is : " + sgpa_final/total_creds);
  }
}

class start
{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();
    System.out.print("\nEnter yout USN : ");
    s1.usn = sc.nextLine();
    System.out.print("\nEnter your name : ");
    s1.name = sc.nextLine();
    System.out.print("\nEnter the total credits of 5 subjects : ");    
    for(int i = 0; i < 5; i++)
    s1.credits[i] = sc.nextInt();


    System.out.print("\nEnter the marks of  5 subjects : ");    
    for(int i = 0; i < 5; i++)
    s1.marks[i] = sc.nextInt();

    s1.display();
    s1.sgpa();

  }
}   
