class Shape
{
    double x,y;
    Shape(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    double printArea()
    {
        return 0;
    }

}

class Triangle extends Shape
{
    Triangle(int h, int b)
    {
        super(h, b);
    }
    double printArea()
    {
        return x * y * 0.5;
    }
}

class Rectangle extends Shape
{
    Rectangle(int h, int b)
    {
        super(h, b);
    }

    double printArea()
    {
        return x * y;
    }
}

class Circle extends Shape
{

    Circle(int h, int b)
    {
        super(h, b);
    }
    double printArea()
    {
        return 3.14*Math.pow(x,2);
    }
}

class overriding
{
    public static void main(String args[]) 
    {
        Shape r;
        Triangle a1 = new Triangle(10,20);    
        Rectangle a2 = new Rectangle(10,20);
        Circle a3 = new Circle(10,1);

        r = a1;
        System.out.println("Area of Triangle : " + r.printArea());
    
        r = a2;
        System.out.println("Area of Triangle : " + r.printArea());
    
        r = a3;
        System.out.println("Area of Triangle : " + r.printArea());
    }
}