import java.util.Scanner;

class multiple<T,V>
{
    T ob1;
    V ob2;

    multiple(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes()
    {
        System.out.println("Type of first : "+ob1.getClass().getName());
        System.out.println("Type of second : "+ob2.getClass().getName());
    }
    T getob1()
    {
        return ob1;
    }
    V getob2()
    {
        return ob2;
    }
    
}

class start
{
    public static void main(String[] args) 
    {
        multiple<String,Double> tobj = new multiple<String,Double>("Hello",123.45);
        tobj.showTypes();
        String strn = tobj.getob1();
        System.out.println("Value of set 2:"+strn);
        double vd = tobj.getob2();
        System.out.println("Value of set 2"+vd);    
    }
    
}