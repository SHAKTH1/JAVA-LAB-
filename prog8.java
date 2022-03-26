/*Write a program which creates two threads, one thread displaying “BMS College of
Engineering” once every ten seconds and another displaying “CSE” once every two seconds.*/

class A extends Thread
{
  public void run()
  {
    System.out.println("BMS College of Engineering");
    try{
      Thread.sleep(2000);
    }catch(Exception e)
    {
      System.out.println("Thread Interrupted");
    } 
  }
}

class B extends Thread
{
  public void run()
  {
    System.out.println("CSE");
    try{
      Thread.sleep(2000);
    }catch(Exception e)
    {
      System.out.println("Thread Interrupted");
    }   
  }
}

class start
{
  public static void main(String args[])
  {
    int x = 0;
    while(x<10)
    {
      new A().start();
      new B().start();
      x+=1;
    }
  }
}