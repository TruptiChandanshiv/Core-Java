                                                     APPITUDE TEST
1.b
2.a
3.c
4.b
5.d
6.C
7.a
8.d
9.a
10.b
11.a
12.b
13.d
14.c
                                               THEORY QUESTION

1.constructor:constructor is block code similar to the method.it is called when an instance	of the class is created	
is called as constructor	
   public class Main {
  private String name;
  Main() {
    System.out.println("Constructor Called:");
    name = "Programiz";
  }

  public static void main(String[] args) {

    
    Main obj = new Main();
    System.out.println("The name is " + obj.name);
  }
}

 
2.1.default constructor 
 * it is  a constructor 
 *default constructor means it does not have parameters is called as default constructor

for ex:
class Bike1{  
Bike1(){System.out.println("Bike is created");}  
public static void main(String args[]){    
Bike1 b=new Bike1();  
}  
}  
2.parameterized constructor 
parameterize constructor means which has specific number of parameter 
 is called parameterize constructor
 
3.objects is a programming language its  having a states and beheviours
*beheviours are nothing but actions
*states are nothing but properties

syntax:classname obj = new classname();
example:students stu = new students;
 
 example for states:
 price
 color
 model
 
 example for beheviours:
 driving;
 review;
 

4.class is obeject oriented programming language a class is basic building of block
*class is defined as a templates


        There 3 types
*method 
*subclass
*fields
*constructor

5.method overloading its is having same method deferrent parameter is called as method overloading

*method overloading is 3 ways 
1.number of parameter;
2.type of parameter;
3.size of parameter;
ex:
public class MethodClass{
 public static void main(String[] args){
 multiply();
 count();
 add();
 insert();
 numbers();
 }
 
 public static void multiply(){
 int[] studentMarks={35,45,25,15,55};
 System.out.println("studentMarks");
 for(int i=0;i<studentMarks.length;i++)
 {
 System.out.println(studentMarks[i]);
 }
 }
 
 public static void count(){
 float[] length={3.5f,5.8f,6.8f};
 System.out.println("length");
 for(int i=0;i<length.length;i++)
 {
 System.out.println(length[i]);
 }
 }

public static void add(){
float[] Heights = {5.2f , 3.7f , 4.2f , 4.8f , 5.3f};
System.out.println("Heights");
for(int i=0;i<Heights.length;i++)
{
	System.out.println(Heights[i]);
}
}

public static void insert(){
char[] conconents = {'B' , 'C' , 'D' , 'F' , 'G' , 'H' , 'J' ,'K' , 'L' , 'M' , 'N' , 'P' , 'Q' , 'R' , 'T' , 'V' , 'W' , 'X' , 'Y' , 'Z'};
System.out.println("conconents");
for(int i=0;i<conconents.length;i++)
{
	System.out.println(conconents[i]);
}
}

public static void numbers(){
byte[] numberOfStudentsPresent = {45 , 35, 0 , 10 , 45};
System.out.println("numberOfStudentsPresent");
for(int i=0;i<numberOfStudentsPresent.length;i++)
{
	System.out.println(numberOfStudentsPresent[i]);
}
}

}



6.variables is a container whic is used to store the value using the diffrent datatypes
there are two types
1.static: it is used to store the value which is comman to many object

*static variables will be intialize once and accessed many times

2.instance: this used to intialize or store value and can be accessed throught the class
public class Variables{
example for variables:

	public static void main(String[] args){
		
	int totalNumberOfStudents = 20;
	System.out.println(totalNumberOfStudents);
	
	String nameOfCompany = "Xworks";
	System.out.println(nameOfCompany);
	
	int numberOfEmployees = 50;
	System.out.println(numberOfEmployees);
	
	char divisionOfCompany = 'A';
	System.out.println(divisionOfCompany);
	
	int numberOfClasses = 2;
	System.out.println(numberOfClasses);
	
	String nameOfTrainee = "SAKSHI";
	System.out.println(numberOfClasses);
	
	byte workingDaysOfCompany = '7';
	System.out.println(workingDaysOfCompany);
	
	String modeOfTraining = "Online";
	System.out.println(modeOfTraining);
	
	boolean isMondayWorkingDay = true;
	System.out.println(isMondayWorkingDay);
	
	int batchStrenght = 28;
	System.out.println(batchStrenght);
}
}

7.this keyword The this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between
 class attributes and parameters with the same name 
 
 
8.string is non primitive datatype A String variable contains 
a collection of characters surrounded by double qoutes;

A string is a data type used in programming, such as an integer and floating point unit, 
but is used to represent text rather than numbers.

ex;
String greeting = "Hello";

10.1. it is security security
*string value can not be fixed





                                PROGRAMMING QUESTIONS
1.public class laptop(){
int price;
string brand;
string color;
string size;

public laptop("int price, string brand, string color, string size");
this.price = price;
this.brand = brand;
this.color = color;}

public static void main(string[] args)
System.out.println(laptop.price);
System.out.println(laptop.brand);
System.out.println(laptop.color);
}
}

2.public class Washingmachine{
int price;
int size;
String brand;
String color;
int weight;

static String type1;
static String material;
static String type2;
static int capacity;
static int warranty;


static{
    System.out.println("static block");
    type1="top load";
    type2="Front load";
    material="Metal";
    capacity=7;
    warranty=5;


    
} 

public static void main(String[] args){


 Washingmachine washingmachine = new Washingmachine();

 washingmachine.brand ="whirlpool";
 washingmachine.color = "grey";
 washingmachine.price=10000;
 washingmachine.size=3;
 washingmachine.weight=10;
 
 
 
Washingmachine washingmachine1 = new Washingmachine();
washingmachine1 .brand ="LG";
 washingmachine1.color = "black";
 washingmachine1.price=30000;
 washingmachine1.size=2;
 washingmachine1.weight=10;
 

 
 
 Washingmachine washingmachine2 = new Washingmachine();
 washingmachine2 .brand ="Harier";
 washingmachine2.color = "pink";
 washingmachine2.price=10000;
 washingmachine1.size=3;
 washingmachine1.weight=3;
 
 
 

 Washingmachine washingmachine3 = new Washingmachine();
 washingmachine3 .brand ="realme techlife";
 washingmachine3.color =  "blue";
 washingmachine3.price=14000;
 washingmachine3.size=2;
 washingmachine3.weight=10;
 
 

 
 
 Washingmachine washingmachine4 = new Washingmachine();
 washingmachine4 .brand ="ondia";
 washingmachine4.color = "black";
 washingmachine4.price=10000;
 washingmachine4.size=4;
 washingmachine4.weight=10;


 Washingmachine washingmachine5 = new Washingmachine();
 washingmachine5 .brand ="godrej";
 washingmachine5.color = "white";
 washingmachine5.price=11000;
 washingmachine5.size=2;
 washingmachine5.weight=20;
 
 
 

 
 System.out.println(washingmachine1.brand);
 System.out.println(washingmachine1.price);
 System.out.println(washingmachine1.color);
 System.out.println(washingmachine1.weight);
 System.out.println(washingmachine1.size);
 
 System.out.println("---------------------------------");
 
 System.out.println(washingmachine2.brand);
 System.out.println(washingmachine2.price);
 System.out.println(washingmachine2.color);
 System.out.println(washingmachine2.weight);
 System.out.println(washingmachine2.size);

 
 System.out.println("---------------------------------");

 System.out.println(washingmachine3.brand);
 System.out.println(washingmachine3.price);
 System.out.println(washingmachine3.color);
 System.out.println(washingmachine3.weight);
 System.out.println(washingmachine3.size);

 System.out.println("---------------------------------");

 System.out.println(washingmachine4.brand);
 System.out.println(washingmachine4.price);
 System.out.println(washingmachine4.color);
 System.out.println(washingmachine4.weight);
 System.out.println(washingmachine4.size);

 System.out.println("---------------------------------");



 System.out.println(washingmachine5.brand);
 System.out.println(washingmachine5.price);
 System.out.println(washingmachine5.color);
 System.out.println(washingmachine5.weight);
 System.out.println(washingmachine5.size);

 System.out.println("---------------------------------");



 
 
 }
 }
 
 
4. public class ArrayClass{
public static void main(String[] args)
{
	//Literals
int[] studentMarks = {35 , 45 , 25 , 15, 55};
System.out.println("studentMarks");
for(int i=0;i<studentMarks.length;i++)
{
	System.out.println(studentMarks[i]);
}
studentMarks[2] = 10;
System.out.println(studentMarks[2]);
int[] weightOfPatients = {50 , 45 , 35 , 70 , 25 , 60 , 28 , 30};
System.out.println("weightOfPatients");
for(int i=0;i<weightOfPatients.length;i++)
{
	System.out.println(weightOfPatients[i]);
}
int[] numberOfWins = {2 , 3 , 5, 6 , 1 , 8 , 3 , 7};
System.out.println("numberOfWins");
for(int i=0;i<numberOfWins.length;i++)
{
	System.out.println(numberOfWins[i]);
}
float[] Heights = {5.2f , 3.7f , 4.2f , 4.8f , 5.3f};
System.out.println("Heights");
for(int i=0;i<Heights.length;i++)
{
	System.out.println(Heights[i]);
}
float[] weightInKilograms = {1.5f , 2.5f , 3.0f , 4.57f, 7.0f , 2.5f};
System.out.println("weightInKilograms");
for(int i=0;i<weightInKilograms.length;i++)
{
	System.out.println(weightInKilograms[i]);
}
float[] balance = {1000.56f , 205.5f ,3000.678f , 3.63f , 45678.787f , 2347.567f };
System.out.println("balance");
for(int i=0;i<balance.length;i++)
{
	System.out.println(balance[i]);
}
char[] conconents = {'B' , 'C' , 'D' , 'F' , 'G' , 'H' , 'J' ,'K' , 'L' , 'M' , 'N' , 'P' , 'Q' , 'R' , 'T' , 'V' , 'W' , 'X' , 'Y' , 'Z'};
System.out.println("conconents");
for(int i=0;i<conconents.length;i++)
{
	System.out.println(conconents[i]);
}
char[] attendenceOfStudents = {'P' , 'P' , 'P' , 'A' , 'A' , 'P' };
System.out.println("attendenceOfStudents");
for(int i=0;i<attendenceOfStudents.length;i++)
{
	System.out.println(attendenceOfStudents[i]);
}
char[] Initials = {'M' , 'T' , 'P' , 'H' , 'P' , 'A' };
System.out.println("Initials");
for(int i=0;i<Initials.length;i++)
{
	System.out.println(Initials[i]);
}
byte[] numberOfStudentsPresent = {45 , 35, 0 , 10 , 45};
System.out.println("numberOfStudentsPresent");
for(int i=0;i<numberOfStudentsPresent.length;i++)
{
	System.out.println(numberOfStudentsPresent[i]);
}
//Using New KeyWord
char[] vowels = new char[5];
vowels[3] = 'O';
System.out.println("vowels");
for(int i=0;i<vowels.length;i--)
{
	System.out.println(vowels[i]);
}
int[] numbers = new int[10];
numbers[0] = 0;
numbers[1] = 1;
numbers[2] = 2;
numbers[3] = 3;
numbers[4] = 4;
numbers[5] = 5;
numbers[6] = 6;
numbers[7] = 7;
numbers[8] = 8;
numbers[9] = 9;
System.out.println("numbers");
for(int i=0;i<numbers.length;i++)
{
	System.out.println(numbers[i]);
}

}
}
   
3.public class Fish(){
string color;
string size;
string shape;
string type;
int price;

public Fish("int price, string type, string color, string size");
this.price = price;
this.type = type;
this.color = color;}

public static void main(string[] args)
System.out.println(Fish.price);
System.out.println(Fish.brand);
System.out.println(Fish.color);
}
}
public class Camera(){
string color;
string size;
string type;
int price;

public camera("int price, string type, string color, string size");
this.price = price;
this.type = type;
this.color = color;
this,type = type;
}

public static void main(string[] args)
System.out.println(camera.price);
System.out.println(camera.brand);
System.out.println(camera.color);
}

public class Headphones(){
string color;
string size;
string shape;
string type;
int price;

public headphone("int price, string type, string color, string size");
this.price = price;
this.type = type;
this.color = color;}

public static void main(string[] args)
System.out.println(headphone.price);
System.out.println(headphone.brand);
System.out.println(headphone.color);
}




								
								









































































































































						 