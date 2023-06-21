public class MethodClassNew{
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

