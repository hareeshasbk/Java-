// Program :2

// Write a Java programme to illustrate types of variables
//  local variables ,instance variables, static variable

class Student{
    int rollno; //instance variables
    int m1;  //instance variables
    int m2;  //instance variables
    static String branch_name="Computer Science";  //String variable


void getData(int x,int y,int z){
    rollno=x;
    m1=y;
    m2=z;

}

void Display(){
    float avg=(m1+m2)/2 ; // avg is local variable
    System.out.println("Roll No:"+rollno);
    System.out.println("M1:"+m1);
    System.out.println("M2:"+m2);
    System.out.println("Average:"+avg);
    System.out.println("Branch:"+branch_name);
}

}

// Main class

class Typ_variable_Student_Details{
    public static void main(String[] args) {
        Student v=new Student();
        v.getData(33, 78, 97);
        v.Display();
    }
}






// Program :3
// Write a Java programme to illustrate different types of constructor 
// default constructor, parameterized construct

class Bank{
    String customer_name;
    int acc_no;
    float balance;

// Default Constructor

Bank()
{
    customer_name="Rama";
    acc_no=1234;
    balance=10000f;
}

// Parameterized Constructor

Bank(String x,int y,float z){

    customer_name=x;
    acc_no=y;
    balance=z;
    
}

void Display(){
    System.out.println("Account name:"+customer_name);
    System.out.println("Account no:"+acc_no);
    System.out.println("Balance:"+balance);

}
}
// Main class

class Constructor_Bank{
    public static void main(String[] args) {
        System.out.println("Default Constructor:");
        Bank b=new Bank();
        b.Display();
        System.out.println();


        System.out.println("Parameterized Constructor:");
        Bank b1=new Bank("Ramesh",10023,4000.0f);
        b1.Display();

    }
}






// Program :4
// Java programme to illustrate garbage collector with 
// finalised method

class Destructor{
    protected void finialize(){
        System.out.println("Object is destroyed by the Garbage Collector");
    }


    public static void main(String[] args) {
        Destructor de=new Destructor();
        de.finialize();
        de=null;
        System.gc();
        System.out.println("Inside the main() method");

    }
} 





// Program :5
// Java program to illustrate Autoboxing and Unboxing

class Box{
    public static void main(String[] args) {
        // Autoboxing
        // Autoboxing of int
        System.out.println("Autoboxing of Integer:-");
        int a=5;
        Integer A=a;
        System.out.println(A);


        // Autoboxing of char
        System.out.println("Autoboxing of Charecters:-");
        char c='a';
        Character C=c;
        System.out.println(C);

        // Autoboxing of float
        System.out.println("Autoboxing of float:-");
        float f=10.5f;
        Float F=f;
        System.out.println(F);

        // Autoboxing of double
        System.out.println("Autoboxing of double");
        double d=18.58;
        Double D=d;
        System.out.println(D);

        // Unboxing
        // Unboxing of Integer
        System.out.println("\n\nUnboxing of integer");
        Integer I =66;
        int i=I;
        System.out.println(i);

        // Unboxing of Character
        System.out.println("Unboxing of char");
        Character C1='B';
        char c2=C1;
        System.out.println(c2);

        // Unboxing of Float
        System.out.println("Unboxing of Float");
        Float F3=10.5f;
        float f4=F3;
        System.out.println(f4);

        // Unboxing of Double
        System.out.println("Unboxing of Double");
        Double D1=10.7;
        double d2=D1;
        System.out.println(d2);

    }
}




// Program :6
// Java program to evaluate expression using command line arguments

class cmdln_argument_Si{
    public static void main(String[] args) {
        float SI;
        float p=Float.parseFloat(args[0]);
        int t =Integer.parseInt(args[1]);
        float r=Float.parseFloat(args[2]);
        SI=(p*t*r)/100;
        System.out.println("Simple Interest="+SI);

    }
}


// Program :8
// Java program to illustrate Bidirectional Statements (if-else)

class Bidirectional_Statements{
    public static void main(String[] args) {
        int age=20;
        if (age>=18)
        System.out.println(age+",Eligible To Vote");
        else
        System.out.println(age+",Is Not Eligible To Vote");
    }
}




// Program :9
// Java program to illustrate the use of Switch

class Switch {
    public static void main(String[] args) {
        char c='y';
        switch (c) 
        {
            case 'a':System.out.println("Vowel");
            break;
            case 'e':System.out.println("Vowel");
            break;
            case 'i':System.out.println("Vowel");
            break;
            case 'o':System.out.println("Vowel");
            break;
            case 'u':System.out.println("Vowel");
            break;
            default: System.out.println("Not a Vowel");

        }
    }
}







// Program :10
// Java program to check whether a no. is prime or not 

class for_loop_prime{
    public static void main(String[] args) {

    int N=4;
    int flag=0; 

for(int i=2;i<=N/2;++i) {
    if (N%i==0){

        flag=1;
        break;
    }
}
    
if (flag==1)
System.out.println(N+" is composite number");
else
System.out.println(N+" is prime number");

       } 
    }




// Program :11
// Java program to print the numbers which are divisible by 7

class divisible_for_loop{
    public static void main(String[] args) {
        
        for (int i=7;i<=100;i=i+7){
            System.out.println(i);
        }
    }
}



// Program :12
// Java program to find Sum of Elements in Arrays 

/ import java.util.Arrays;

class Array_for_loop{
    public static void main(String[] args) {

        int a[]={10,50,60,54,98,65};

        System.out.println(Arrays.toString(a));
        
        int i,sum=0;
        for (i=0;i<a.length;i++)
        sum=sum+a[i];

        // int sum=0;
        // for (int i=0;i<a.length;i++)
        // sum=sum+a[i];
        System.out.println("Sum="+sum);

    }
}




// Program :13
// Java program to print 2D-Array

/ import java.util.Arrays;

class Transpose_for_loop{
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};

        System.out.println("Original Matrix:");

        for (int i=0;i<a.length;i++){

            for (int j=0;j<a.length;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Transpose of given matrix:");
            for (int i=0;i<a.length;i++){

                for (int j=0;j<a.length;j++){
                    
                    System.out.print(a[j][i]+" ");
                }
            System.out.println();   
        }
    }
}





// Program :14
// Java program to implement String Manipulation

class String_Manipulation{
    public static void main(String[] args) {

        // Print the Original String
        System.out.println("The Original String:");
        String s="I am a Student";
        System.out.println(s);
        System.out.println("The character at index 2 is: "+s.charAt(2));
        System.out.println("The length of given String is: "+s.length());
        System.out.println("The substrig from index 4:"+s.substring(4));
        System.out.println("The substring from index 5 to 10:"+s.substring(5,10));
        System.out.println("Checks the string contains the given string:"+s.contains("am"));
        System.out.println("Checks the string are equal or not:"+s.equals("am student"));
        System.out.println("The concatenated string:"+s.concat(",my name is Rahul"));
        System.out.println("The replaced string:"+ s.replace('I','i'));
        System.out.println("Checks the strings are equal or not (Ignoring the case):"+s.equalsIgnoreCase("I am a student"));
        System.out.println();

        System.out.println("The index of char 'a' is: "+s.indexOf('a'));
        System.out.println("The trimmed String is: "+s.trim());
        System.out.println("The lowercase String is : "+s.toLowerCase());
        System.out.println("The Uppercase String is : "+s.toUpperCase());
        System.out.println("Checks the string starts with the specified string:"+s.startsWith("Iam"));
        System.out.println("Checks the string ends with the specified string "+s.endsWith("student"));
    
    }
}




// Program :15
// Java program to implement single inheritence

// Supre class 

class Employee{
    int salary=25000;
}

// Subclass 

class Programmer_Single_inherit extends Employee{
    int bonus=2000;
    public static void main(String[] args) {
        Programmer_Single_inherit p=new Programmer_Single_inherit();
        System.out.println("Programmer Salary is "+p.salary);
        System.out.println("Bonus of Programmer is "+p.bonus);
        
    }
}




// Program :16
// Java program to implement multilevel inheritence

// Supre class

class A{
    void methA()
    {
        System.out.println("A class method");
    }
}

// Sub class 

class B extends A{
    void methB(){
        System.out.println("B class method");
    }
}

// Sub class

class C extends B{
    void methC(){
        System.out.println("C class method");
    }
}

class Multilevel_Inheritence{
    public static void main(String[] args) {
        {
            C c=new C();
            c.methA();
            c.methB();
            c.methC();
        }
    }
}





// Program :17
// Java program to illustrate polymorphism (Method Overriding)

// Super class 
class Shape{
    void draw(){
        System.out.println("Drawing");
    }
}


// Sub class 
class Rect extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle:");
    }
}

// Sub class
class Tri extends Shape{
    void draw(){
        System.out.println("Drawing Triangle:");
    }
}

class Poly_Meth_Overriding{
    public static void main(String[] args) {
        Shape s;
        s=new Rect();
        s.draw();
        s=new Tri();
        s.draw();
    }
}




// Program :18
// Java program to implement interface

// Create an interfeace class

interface C{
    void drawA();
    void drawB();
}

class D implements C{
    public void drawA(){
        System.out.println("Drawing Tool 1");
    }


public void drawB(){
    System.out.println("Drawing Tool 2");
}
}

class Interface_Test{
    public static void main(String[] args){
        C c =new D();
        c.drawA();
        c.drawB();
    }
}






// Program :19
// Java program to implement Abstraction

// Super class 

abstract class Sem4{
    abstract void display();
}

// Sub class 1
class Java extends Sem4{
    void display(){
        System.out.println("Java is one of the subject in 4th Sem ");
    }
}

// Sub class 2
class DSP extends Sem4{
    void display(){
        System.out.println("DSP is one of the subject in 4th Sem");
    }
}


// Sub class 3
class SE extends Sem4{
    void display(){
        System.out.println("SE is one of the subject in 4th Sem");
    }
}

// Sub class 4
class OS extends Sem4{
    void display(){
        System.out.println("OS is one of the subject in 4th Sem");
    }
}


class Abstraction{
    public static void main(String[] args) {
        Sem4 d;
        d=new Java();
        d.display();

        d=new DSP();
        d.display();

        d=new SE();
        d.display();
        
        d=new OS();
        d.display();
        
    }
}




// Program :20
// Java program to implement ISP (Interface Segregation Principle)

interface ST{
    public void soft();
}

interface CT{
    public void elect();
}

interface MT{
    public void magnet();
}

interface HT{
    public void hard();

}

class IK implements ST,CT,MT,HT{
    public void soft(){
        System.out.println("These are Soft Toys:");
    }

    public void elect(){
        System.out.println("These are Electrical or Current Toys");
    }

    public void magnet(){
        System.out.println("These are Magnetic Toys");
    }
    
    public void hard(){
        System.out.println("These are Hard Toys:");
    }
}


class Interface_Segregation_Principle{
    public static void main(String[] args) {
        IK a=new IK();
        a.soft();
        a.elect();
        a.magnet();
        a.hard();
    }
}


// Program :21
// Java program to implement Exception Handling

class Exception{
    public static void main(String[] args) {
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println("c="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Zero Division Error");
        }
        System.out.println("End of program");
    }
}
