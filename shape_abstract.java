import java.util.*;

abstract class Solid
{
    final double pi = 3.14;
    double h,r;
    abstract double printArea(double h, double r);
    abstract double printVolume(double h, double r);
}

class Cylinder extends Solid
{
    double printArea(double h, double r)
    {
        return pi*2*Math.pow(r,2)+2*pi*r*h;
    }
    double printVolume(double h, double r)
    {
        return pi*Math.pow(r,2)*h;
    }
}

class Cone extends Solid
{
    double printArea(double r,double s)
    {
        return pi*r*s + pi*Math.pow(r, 2);
    }

    double printVolume(double h, double r)
    {
        return Math.round( ((pi*Math.pow(r,2)*h)/3)*1000.0)/1000.0;
    }
}

class Sphere extends Solid
{
    double printArea(double r, double h)
    {
        return 4*pi*Math.pow(r, 2);
    }
    double printVolume(double r, double h)
    {
        return Math.round( ((4/3)*pi*Math.pow(r,3))*100.0)/100.0;
    }
}

class start
{   
    public static void main(String[] args) 
    {
        Cylinder cy = new Cylinder();
        Cone co = new Cone();
        Sphere sp = new Sphere();
        System.out.print("Area of cylinder : " + cy.printArea(1,1));
        System.out.print("\nVolume of cylinder : " + cy.printVolume(1,1));
        System.out.print("\nArea of Cone : " + co.printArea(1,1));
        System.out.print("\nVolume of Cone : " + co.printVolume(1,1));
        System.out.print("\nArea of Sphere : " + sp.printArea(1,1));
        System.out.print("\nVolume of Sphere : " + sp.printVolume(1,1));
    }

}
