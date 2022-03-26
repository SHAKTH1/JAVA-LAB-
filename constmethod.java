class A
{
  int i;
  A()
  {
    i = 10;
  }
}

class B
{
  int j;
  B()
  {
    j = 90;
  }
}

class C
{
  double d;
  C()
  {
    d = 323.456;
  }
}

class constmethod
{
  public static void main(String args[])
  {
    A a1 = new A();
    B b1 = new B();
    C c1 = new C();

    System.out.println("Value of A is "+a1.i);
    System.out.println("Value of B is "+b1.j);
    System.out.println("Value of C is "+c1.d);
  }
}