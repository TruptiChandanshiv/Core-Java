public class Institute{
public static void main(String[] args)
{
//area(12,33);
//area(12);
//area(5f,6f);
//area(12);
}
public static int area(int value1,int value2)
{
int value3=value1*value2;
System.out.println("area of rectangle");
return value3;
}
public static int area(int value)
{
int value3=value*value;
System.out.println("area of sqaure");
return value3;
}

public static float area(float b, float h)
{
float area;
area=(b*h)/2;
System.out.println("area of triangle");
return area;

}
public static double area(double value1)
{
double area;
double pi = 3.14;
System.out.println("area of circle");
return area;
}
}




