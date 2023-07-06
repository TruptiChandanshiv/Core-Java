public class Washingmachine{
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
 