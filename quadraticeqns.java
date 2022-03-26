import java.util.*;

class quadraticSolution
{
  public static void main(String args[])
  {
    int a,b,c,res;
    double root1, root2, dis;
    System.out.print("Enter the coefficients of ax^2+bx+c : ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    dis = b*b - 4*a*c;

    if(dis > 0)
    res = 1;
    else if(dis == 0.0)
    res = 2;
    else
    res = 3;

   switch(res)
   {
     case 1:
        System.out.println("Roots are real.");
        root1 = (-b +(float)(Math.sqrt(dis) ) )/ (2*a) ;
        root2 = (-b -(float)(Math.sqrt(dis) ) )/ (2*a) ;
        System.out.print("Root 1 : "+root1+"\nRoot 2: "+root2);
        break;
        
     case 2:
        System.out.println("Roots are equal.");
        root1 = (float)(-b) / (2*a);
        System.out.print("Roots are: "+root1);
        break;
      case 3:
        System.out.println("Roots are imaginary.");
        root1 = (float)( -b )/ (2*a);
        root2 = (float)(Math.sqrt(-dis) ) / (2*a);
        System.out.println("Roots are : \n"+root1+"+i"+root2 );
        System.out.println(root1+"-i"+root2 );
        break;

   }

  }
}
