import java.util.*;

class complexNumbers
{
    double real,img;

    complexNumbers(double real, double img)
    {
        this.real = real;
        this.img = img;
    }

    static complexNumbers add(complexNumbers a, complexNumbers b)
    {
        complexNumbers c  = new complexNumbers(0, 0);
        c.real = a.real + b.real;
        c.img = a.img + b.img;
        return c;
    }
    static  complexNumbers sub(complexNumbers a, complexNumbers b)
    {
        complexNumbers  c = new complexNumbers(0, 0);
        c.real = a.real - b.real;
        c.img = a.img - b.img;
        return c;
    }
}

class start
{
    public static void main(String args[]) 
    {
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the value of a and for a + ib : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        complexNumbers a = new complexNumbers(x, y);
        
        System.out.print("\nEnter the value of a and for c + id : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        complexNumbers b = new complexNumbers(x, y);
        
        complexNumbers res = new complexNumbers(0, 0);

        res = complexNumbers.add(a,b);
        if(res.img > 0)
        System.out.print("\nDifference of the numbers is "+res.real+"+i"+res.img);
        else
        System.out.print("\nDifference of the numbers is "+res.real+"-i"+(-res.img));
        res = complexNumbers.sub(a,b);
        if(res.img > 0)
        System.out.print("\nDifference of the numbers is "+res.real+"+i"+res.img);
        else
        System.out.print("\nDifference of the numbers is "+res.real+"-i"+(-res.img));
    }
}
