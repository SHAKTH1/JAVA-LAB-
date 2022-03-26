import java.util.*; 
class PrimeNumber
{
  public static void main(String args[])
  {
    int num,i,f=0;
    System.out.println("Enter a number : ");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    for(i = num - 1; i > 1; i--)
    {
     if(num % i == 0)
       {
	System.out.println(num+" is not a prime number.");
   	f=1;
        break;
       }
    }
   if(f==0)
   System.out.println(num+" is a prime number.");

}
}
       