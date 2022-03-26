class box
{
  double h,l,b;
  double volume()
  {
    return h*l*b;
  }
  
  void setdim(double h, double l, double b)
  {
    this.h = h;
    this.l = l;
    this.b = b;
  }
}

class boxdemo
{
  public static void main(String args[])
  {
    box box1 = new box();
    box1.setdim(2,3,4);
    System.out.println("Volume of the box " + box1.volume());
  }
}
