                                              Name:Trupti C
                                              Date:22-7-2023
1.11 34
2.eror

3.syntax error

4.error

6. Method Paramter:Information can be passed to methods as parameter the Parameters act as variables inside the method.

Parameters are specified after the method name inside the parentheses. You can add as many parameters as you want just separate them with a comma.

ex:public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
1.Return Values
The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, 
you can use a primitive data type (such as int, char, etc.) instead of void and use the return keyword inside the method:
 
 ex:public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}

7.Polymorphism in Java refers to an objects capacity to take several forms. Polymorphism allows us to perform the same action in multiple ways in Java.

Polymorphism is divided into two types:

1.Compile-time polymorphism
Compile-time polymorphism is also known as static polymorphism or early binding. 
Compile-time polymorphism is a polymorphism that is resolved during the compilation process. 
Overloading of methods is called through the reference variable of a class. 
Compile-time polymorphism is achieved by method overloading and operator overloading.

1. Method overloading
We can have one or more methods with the same name that are solely distinguishable by argument numbers, type, or order.
Method Overloading occurs when a class has many methods with the same name but different parameters. 
Two or more methods may have the same name if they have other numbers of parameters different data types.

Example: 

void gfg() { ... }
void gfg(int num1 ) { ... }
void gfg(float num1) { ... }
void gfg(int num1 , float num2 ) { ... } 
2. Operator Overloading 

An operator is said to be overloaded if it can be used to perform more than one function. 
Operator overloading is an overloading method in which an existing operator is given a new meaning. In Java, the + operator is overloaded. Java
on the other hand, does not allow for user-defined operator overloading. To add integers
 the + operator can be employed as an arithmetic addition operator. It can also be used to join strings together

example:public class GFG {
 
   
    void add(int a, int b)
    {
        int sum = a + b;
        System.out.println(" Addition of two integer :"+ sum);
    }
 
    
    void add(String s1, String s2)
    {
        String con_str = s1 + s2;
        System.out.println("Concatenated strings :"+ con_str);
    }
 
    public static void main(String args[])
    {
        GFG obj = new GFG();
       
        
        obj.add(10, 10);
       
        
        obj.add("Operator ", " overloading ");
    }
}

8.Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. 
Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.
Syntax of Varargs

Internally the Varargs method is implemented by using the single dimensions arrays concept. Hence, in the Varargs method, we can differentiate arguments by using Index. A variable-length argument is specified by three periods or dots(…). 
syantax: 

public static void fun(int ... a) 
{
   
} 
Example:
class Test1 {
    
    static void fun(int... a)
    {
        System.out.println("Number of arguments: " + a.length);
 
        
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        
        fun(100);
   
        fun(1, 2, 3, 4);
		
          fun();
    }
}

9.A package in Java is used to group related classes. Think of it as a folder in a file directory. 
We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

1.Built-in Packages (packages from the Java API)
The Java API is a library of prewritten classes, that are free to use, 
included in the Java Development Environment.
syntax:
import package.name.Class;   
import package.name.*;

   
ex:import class
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}



2.User-defined Packages (create your own packages)
To create your own package, you need to understand that Java uses a file system directory to store them. 
Just like folders on your computer:
ex:package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}

10.In constructor chain a constructor is called from another constructor in the same class this process is known as constructor chaining. 
It occurs through inheritance. When we create an instance of a derived class, 
all the constructors of the inherited class (base class) are first invoked, 
after that the constructor of the calling class (derived class) is invoked.

We can achieve constructor chaining in two ways:
1.Within the same class: If the constructors belong to the same class, we use this
2.From the base class: If the constructor belongs to different classes (parent and child classes), 
we use the super keyword to call the constructor from the base class.

Rules of Constructor Chaining
*An expression that uses this keyword must be the first line of the constructor.
*Order does not matter in constructor chaining.
*There must exist at least one constructor that does not use this

Constructor Calling form another Constructor

The calling of the constructor can be done in two ways:

By using this() keyword: It is used when we want to call the current class constructor within the same class.
By using super() keyword: It is used when we want to call the superclass constructor from the base class.
syntax:
this(); or this(parameters list);  

ex:
public class ConstructorChain  
{  
ConstructorChain()  
{  
this("Javatpoint");  
System.out.println("Default constructor called.");  
}  
ConstructorChain(String str)  
{  
System.out.println("Parameterized constructor called");  
}  
public static void main(String args[])   
{    
ConstructorChain cc = new ConstructorChain();   
}   
} 
13.We will be using two methods: Arrays.sort() and Arrays.equals() from the java.util package to solve this problem.

The Arrays.sort() method sorts the elements of the array in increasing order. 
This method will accept the array which needs to be sorted and return the sorted array.

The Arrays.equals() method checks the equality of the two arrays in terms of size
data, and order of elements. This method will accept the two arrays which need to be compared
and it returns the boolean result true if both the arrays are equal and false if the arrays are not equal.  

import java.util.*;
class Main
{
public static void main(String[] args) 
  {
    Object[] a = new Object[] {1, 5, 7, 9};
    Object[] b = new Object[] {9, 5, 1, 7};
    Object[] c = new Object[] {1, 6, 7, 5};
      
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);

    boolean returnVal1 = Arrays.equals(a,b);
    System.out.println("Array a and b equal?: " + returnVal1);

    boolean returnVal2 = Arrays.equals(b,c);
    System.out.println("Array b and c equal?: " + returnVal2);
  }
}
14.Enumeration interface is one of the predefined interfaces, whose object is used for retrieving the data from collections framework variable( like Stack, Vector, HashTable etc.) 
in a forward direction only and not in the backward direction. This interface has been superceded by an iterator.

The Enumeration Interface defines the functions by which we can enumerate the elements in a collection of elements. 
For new code Enumeration is considered obsolete. 
However, several methods of the legacy classes such as vectors and properties, several API classes
application codes use this Enumeration interface.

Important Features

Enumeration is Synchronized.
1.It does not support adding, removing, or replacing elements.
2.Elements of legacy Collections can be accessed in a forward direction using Enumeration.
3.Legacy classes have methods to work with enumeration and returns Enumeration objects.

ex:

import java.util.Vector;
import java.util.Enumeration;
 
public class EnumerationClass {
 
    public static void main(String args[])
    {
        Enumeration months;
        Vector<String> monthNames = new Vector<>();
 
        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");
        months = monthNames.elements();
 
        while (months.hasMoreElements()) {
            System.out.println(months.nextElement());
        }
    }
}
 12.

        
import java.util.*;
public class xworkz {
    public static void main(String[] args)
    {
        int n = 91;
        if ((n & 1) == 1) {
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
}
15.Car a3=new Car() 
This statement will create a handle named a3 in jvm stack with all its properties in JVM heap. IF this is correct i am wondering how call by value works. 
So, if i create a method checkMethod(Car c) and call it by saying checkMethod(a3); suppose our car is

public class Car{
   int a=0;
   public int getpar(){
       return a;
   }
}
in checkMethod i try to access a using a3.a = 5; so i changed the value of a3.a it will show me in the calling class as well as it was pointing to the same fields that jvm created in the heap.

But when i do a3= null; in the calling method and go back again in the method from which i was calling checkMethod(a3) and try to see this object it is not null? Why it behaved differently as compared to property of object that is a???
 
 
16.
1.variables
2.Methods
3.Class
4.Constructor 