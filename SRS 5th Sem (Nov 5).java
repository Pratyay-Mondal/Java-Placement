Steps to prepare first Java Application:
========================================
Stpe 1: Create a folder anywhere in your computer with any name.
Ex: E:\csbsmeworkspace

Step 2: Open Notepad or Notepad++ or Editplus and then type the program.
class Test{
		public static void main(String[] args){
          System.out.println("Hello World");
		}
}

Step 3: Save the program with any valid name.
Note: If a java class having a public class we have to save the java program with 
that public class name only.

Step 4: Compile the java application.
    A. Open the comamnd prompt.
    B. Change the location from default working directory to current working directory

        C:\Users\sarka>E:
	E:\>cd csbsmeworkspace
	E:\csbsmeworkspace>javac Demo.java
	E:\csbsmeworkspace>

Step 5: Run the application
E:\csbsmeworkspace>java Test
Hello World

Java Application With package:
-------------------------------
package com.wipro.test;
class Test{
		public static void main(String[] args){
          System.out.println("Hello World");
		}
}
How to compile a Java program with package Statement:
------------------------------------------------
javac -d . Demo.java

How To run a Java Program with package Statement:
-------------------------------------------------
java com.wipro.test.Test

Variables:
----------
Definition: A variable is a named memory location.
It is used for storing a value or object reference temorarily during program execution.

How can we create variable?
----------------------------
A variable is created by using data type either by using PDT(primitive data type) or by using RDT(Reference data type).

Based on the value represented by the variable we have two types of variable.

1. primitive  : It is used to represent primitve values.
There are 8 primitives in java byte,short,char,int,long,float,double.

2. reference  : It is used to refer objects.
We can use array/class/interface/enum/annotation as reference variables.

Syntax to create a variable:
=============================
Datatype varName=value;

Datataype can be PDT and RDT, vlaue is a single mathematical value or objct reference.

Based on position of declaration and its behavior variables are 
classified into three types.

1. non-static
2. static
3. local 

In Java we have two contexts:
1. static 
2. non-static[instance]

static :
--------
-> 'static' is a non-access modifier[non-access modifier changes the default bevaior]
-> 'static' is applicable for variable level, method level, block and for import 
                              --------------  ------------  -----         ------
statements.
------------

Based on the value represented by a variable we have two different types:
   1. primitive variable : It is used to represent primitive value. 
   2. reference variable : It is used  to refer objects.
                                                ========
Based on position of declartion and behavior all variables are callssified into
three types.
    1. non-static(instance) variable
    2. static variable
    3. local variable


1. non-static(instance) variable:
=================================
Q> When should we go for non-static variables?

-> If the value of the variable is changing with respect to object to object then we should take the variable as non-static variable.

Ex: Student roll number varies from student object to object, hence it is non-satic variable.

Q> For non-tatic variables how many copies will be created?

-> For non-static variable for every object separate copy will be created.

Q> Where non-static varibale will be stored ?

-> Non-static variable will be stored in the heap area as a part of the object.

Q> What is the default value for non-static variable?
-> For non-sttaic variable default value will be provided by JVM based on their type.


Q> Where non-static variables are decalred ?
-> 'non-static' variable are declared inside the class directly but non inside any method.

Q> When non-static variable will be created ?
-> non-static variable will be created at the time of object creation.

2. static variable:
================
Q> When should we go for static variables?

-> If the value of the variable doesn't change with respect to obejct to object 
such type of variables are called static variable.
Ex: cname is a static variabale with respect to a particular college.

Q> For Static variables how many copies will be created?
-> For static variables only one copy of that variable will be created irrespective of the number of objects.
static variable will be considered as shared variable.

Q> Where static varibale will be stored ?
-> Static variable will be stored in Method area of JVM memory.

Q> What is the default value for static variable?
-> For sttaic variable default value will be provided by JVM based on their type.
 
Q> Where static variables are decalred ?
-> 'static' variable are declared inside the class directly but non inside any method .

Q> When static variable is created ?
->'static' variable are created at the time of class loading.
Hence the lifee of static variable is as long as the lide of a class.

Q>What is class loading? How class can be loaded ?
Ans. Brininging class from hard disk to JVM memory of RAM is called class loading.

Class Loader brings the .class file from hard disk to JVM memory of RAM.

Approach #1: At the time of running the java applciation
Ex: java Test

Approach #2: Whenver we access a static variable of another class, the class which contains static variable will be loaded.
 
class Test{
	 	/*static method*/
		public static void main(String[] args){
		
				System.out.println(Student.cname);

     }    
}
class Student{		
      /*static varibale*/  
		 static	String cname;
}

In the above example when we run the application by 
writing java Test
as a part of Test.class execution in the System.out.println(Student.cname)
Student class also will be loaded.
 
->'static' variables are also called as class level variables.

-> 'static' variables are decalred with 'static' modifier. 

Q> How to access staic variable ?

-> We can access static variable in 3 different ways.

App #1 By using class name.

class Student{		
      /*static varibale*/  
		 static	String cname;
}

class Test{
	 	/*static method*/
		public static void main(String[] args){
		     /*Accessing static variable by using class name*/
				System.out.println(Student.cname);
     }    
}

App #2 Within the same class we can drop the class name.

class Test{
		static int x;
	 	/*static method*/
		public static void main(String[] args){
		     /*Accessing static variable without using class name*/
				System.out.println(x);
			
			
     }    
}
App #3: To access static variable we can even take the help of object reference.[Not recommended]
class Test{
   static int x=777;
   public sttaic void main(String[] args){
       Test t=new Test();
		System.out.println(t.x);
   }
}

local variable:
---------------

Q> What is called local variable ?

Ans. For temporary requirement of the programmer we can declare a variable inside a method or a loop or block or constructor.Such variables are called as local variable or automatic variable or temporary variable or stack variable.
 
Q> When should we go for local variable ?

-> If we use any variable for temporary purpose that variabe is called local variable.

-> For local variable before using initializing is compulsory.

Ex#1:
class Test{
   public static void main(String[] args){
       int i;
       System.out.println("i:"+i);
   }
}
Test.java:4: error: variable i might not have been initialized
       System.out.println("i:"+i);
                               ^
1 error

In the above  program before using as the local variable is not initialized hence the reason of
Compilation error.


Ex#2:
class Test{
   public static void main(String[] args){
       int i;
       System.out.println("Hello");
   }
}
O.P: Hello

In the above program as i is not used thats why even the local variable is not initialized there is no error.

-> Local variables will be stored inside the stack area.

-> Local variables will be created at the time of block execution in the block where it is declared and the variable will be destroyed once the block execution is over.

class Test{
   public static void main(String[] args){
	    /*local variable to main method*/
		int i=0;		
		for(int j=0;j<5;j++){ /*local variable to for loop*/
			i=i+j;
		}
		System.out.println(i+" : "+j);
   }
}
Test.java:8: error: cannot find symbol
                System.out.println(i+" : "+j);
                                           ^
  symbol:   variable j
  location: class Test
1 error

-> It is not recommended to initialize local variable inside any logical block. Becasue for logical block execution will take place or not that guarantee can't be given.

class Test{
   /*static variable*/
   static double area;

   public static void main(String[] args){
		double p,b,h; /*Line #1*/
		if(area==0.0){
			b=3;
			h=4;
			p=0.5;
		}
		area=p*b*h; /*Line#2*/
		System.out.println(area);
	 }
}

E:\tempworkspace>javac Test.java
Test.java:12: error: variable p might not have been initialized
                area=p*b*h; /*Line#2*/
                     ^
Test.java:12: error: variable b might not have been initialized
                area=p*b*h; /*Line#2*/
                       ^
Test.java:12: error: variable h might not have been initialized
                area=p*b*h; /*Line#2*/
                         ^
3 errors

-> For local variable only modifier that is applicable is final.

class Test{
   public static void main(String[] args){
			//public int x=0;
			//private int x=0;
			//protected int x=0;
			//static int x=0;
			final int x=0;
			System.out.println(x);
	}
}

Q# What is object ?

Ans. Object is a physical entity.It occupies some memory.
Object is called an instance of a class.

Q# How to create object in Java ?

Ans. There are multiple ways to create object to java.

Approach #1: By using new keyword or new opeartor.
============
Synatx:

Class_Name Ref_Var_Name  =  new Class_Name();

Class_Name() should be read as constructor. 

Q# What is the role of "new" keyword?

Ans. The responsibility of new keyword is as follows:
 1. It allocates memory for the object.
 2. After allocating memory for the obejct new opeartor returns(giving) the reference value of the object.


Constructor:
============
Constructor is a special method that is called at the time of  object creation by using new opeartor or new keyword.The constructor is used for initializing non-static variable.

Q#1. Why the Constructor is consdiered as a special method  ?
================================================================
Ans.The name of the constructor and the name of the class must be samethats is whcy constructor is called special method.


Syntax:
--------
[Access Modifier]Class_Name([list of paramters])[throws Exception list]{


}

Example:
class Test{
	Test(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		Test t = new Test();
	}
}

Rules of Constructor:
--------------------
Rule #1: The  name of the class and the name of the constructtor must be same.

Q#2. Is it possible to have name of the class and name of the constructor different?
====================================================================================
Ans. No, we cant give different name other the class name for a constructor.

If we provide constructor name other than class name 
then compiler will give
"invalid method declaration; return type required" because Compiler will treat
the constructor as normal java method without return type but 
for methods return type is mandatory.

class A{

}
class Test{
	A(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		Test t = new Test();
	}
}

E:\tempworkspace>javac Test.java
Test.java:5: error: invalid method declaration; return type required
        A(){
        ^
1 error

Rule #2:The accessible modifier that are applicable for constructor is public, private, protected,<default>
(pppd).

Note: If we makke the constructor as private then it is accessible only upto the class.
Beyond the class it is not accessible.

Case #1:
class Test{
	private Test(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		Test t=new Test();
	}
}

Case #2:
class Test{
	private Test(){
		System.out.println("Constructor");
	}
}
class Main{
	public static void main(String[] args){
		Test t=new Test();
	}
}
E:\tempworkspace>javac Test.java
Test.java:8: error: Test() has private access in Test
                Test t=new Test();
                       ^
1 error

Rule#3: The Constructor can't have any return type not even void also.
If we provide any return type at the time of writing constructor no compilation error and runtime error.Compile will treat as method.

class Test{
	/*non-static method*/
	void Test(){
		System.out.println("Method");
	}
	public static void main(String[] args){
		Test t=new Test();
		t.Test();
	}
}

Rule #4: If we dont write any constructor inside a class,compiler will provide one 
default construtor.
So, that means inside a class there will always be atelast one  constructor that is either 
default constructor or programmer  defined constrictor.


Q#3. Can we have a constructor and a method simultaneously inside a class with same name?
=========================================================================================
Ans. Yes it is  possible to have a class with the same name as method and construtor.
class Test{
	Test(int i){

	}
	/*non-static method*/
	void Test(){
		System.out.println("Method of Test Class");
	}
	public static void main(String[] args){
		Test t=new Test(10);
		t.Test();
	}
}

Q#4. How compiler and JVM differentiates constructor and method invocation(calling) if both have same class name?
===========================================================================================================
Ans. With the help of new keyword, if new keyword present the it is constructor calling otherwise method calling.

Q#5. How compiler and JVM differentiates constructor and method definition if both
have same class name?
===================================================================================
Ans.By using return type, if there is a return type it is considered as method, otherwise it is
considered as constructor.

Q#6. Why Constructor name must be same as class name?
======================================================
Ans. To tell new keyword which class object we want to create name of the constructor must be same as the class name.


Type of Constructor:
-------------------
1. Default Constructor: The constructor provided by Compiler in the absence of any 
programmer defined constructoris known as default constructor.
Inside default constructor the first line will always be super().
super() is used to call parent class constructor.


2. No-arg Constructor
======================
The constructor which does not take any argument is known as no-arg/no param constructor.
This constructor is explicitly written by Programmer.

3. Parameterized Constructor:
=============================
The constructors which takes some argument is known as Parameterized Constructor.
This constructor is explicitly written by Programmer.

Q#8.What do you mean by Constructor Overloading?
================================================
Ans.
Constructor Overloading:
=========================
Inside a class writing more than one constructor which differs 
in number of arguments, or type of arguments or or order /sequence of arguments is the concape of constructor
Overloading.

If we want to create different objects with different set of values then we must go for Constructor Overloading.

Case #1: Constructor overloading by differing noumber of arguments.
-------------------------------------------------------------------
class Rectangle{
	/*non-static*/
	int l,b;
	
	/*No-param constructor*/
	Rectangle(){
       //super();
		l=b=0;
	}

	/*One-param constructor */
	Rectangle(int x){  
       //super();
		l=b=x;
	}
    
    /*Two paaram constructor*/

	Rectangle(int x,int y){ // x and y are local variable
       //super();
		l=x;
		b=y;
	}
	/*non-static method*/
	void area(){
		System.out.println("Area:"+(l*b));
	}
}
/*Driver class/Main Class*/
class Test{
	public static void main(String[] args){
		/*Create Recatngle Object*/
		Rectangle r1 = new Rectangle();
		System.out.println(r1.l);
        System.out.println(r1.b);
		r1.area();

		Rectangle r2 = new Rectangle(5);    // one argument constructor
		System.out.println(r2.l);
        System.out.println(r2.b);
		r2.area();

		Rectangle r3 = new Rectangle(30,40);// Two argument constructor
		System.out.println(r3.l);
        System.out.println(r3.b);
		r3.area();
	}
}

Case #2: Constructor overloading by differing type of arguments.
----------------------------------------------------------------
class Demo{
	Demo(int i){
		System.out.println("int-arg constructor");
	}
	Demo(double  d){
		System.out.println("double-arg constructor");
	}
}
/*Driver class/Main Class*/
class Test{
	public static void main(String[] args){
		Demo d1=new Demo(10);

		Demo d2=new Demo(12.34);

	}
}

Case #3: Constructor Overloading by differing order of arguments
-----------------------------------------------------------------
class Demo{
	Demo(int i,double d){
		System.out.println("int-double arg constructor");
	}
	Demo(double  d, int i){
		System.out.println("double-int arg constructor");
	}
}
/*Driver class/Main Class*/
class Test{
	public static void main(String[] args){
		Demo d1=new Demo(10,12.34);

		Demo d2=new Demo(12.34,10);

	}
}

Q#10. What is the difference between no-arg constructor Vs. default Constructor ?
=================================================================================
Ans.

1. default constructor is provided by Compiler.
   no-arg constructor is provided by Programmer.

2. If we dont write any constructor then only default constructor will come.
   We have to write no-arg constructor explicitly.

3. For default constructor the accessibility modifier will be same as the corresponding class modifier.
   For no-arg constructir the modifer will be not same as class modifier, it may differ from class modifier.

Q#11. What is the difference between parameterized constructor Vs. default Constructor ?
========================================================================================
Ans.


Q#12. What is the difference between constructor and method?
==========================================================
Ans.

1. Purpose :
   --------
   The purpose of Constructor is to initialize non-static variable at the time of object creation.
   The method is used to expose the behavior of the object.

2. return type:
   ------------
   The constructor will not have any return type not even void.
   The method must have return type.

3. called
   -------
   Constructor will be called implicitly at the time of object creation.
   Method must be called explicitly.

4.  Name
    -----
    Constructor name must be same as class name.
    Method name may or may not be same as class name.

5. Inheritance
   -----------
   Constructor can't be inherited.
   Method can be inherited.

6. Reucrsive Call
   --------------
   Recursive Constructor calling will lead to compile time error.
   Recursive method callling will not lead to compile time error 
   but if not properly handled it may raise run time issues.

7. Default
   -------
   In the absence of any programmer defined constructor default constructor will be provided by Compiler.
   In any case method will not be provided by the Compiler.For any method programmer must need to call that    
   method explicitly. 


'this' keyword:
----------------
-> 'this' is a non-static, final reference variable used to refer current object.
               ----------  ------

Use Case of 'this' keyword:
---------------------------
1.'this' can be used to refere non-static variable of the current object.

class Test{
    /*non-static variable*/
	int x,y;
	Test(int x, int y){//local variable
		/*assigning local variable value to non-static variable*/
		this.x=x; // local =local
		this.y=y; // local =local
	}

	public static void main(String[] args){
	
		Test t=new Test(10,20);
		System.out.println(t.x);
		System.out.println(t.y);

	}
}

2. 'this' can be used to call current class non-static and static methods.

class Test{
   
    /*non-static method*/
    public void m1(){
		System.out.println("m1() method");
		m2();//this.m2();
		m3();//this.m3();
	}
	/*non-static method*/
	public void m2(){
      System.out.println("m2() method");
	}
    /*static method*/
	public static void m3(){
       System.out.println("m3() method");
	}

	/*static method*/
	public static void main(String[] args){
		Test t=new Test();
		t.m1();
	}
}

3.'this' can be used as an argument to a method call.
class Test{
	
	/*non-static method*/
	public void m2(Test x){
		System.out.println("m2() method");
	}
    /*non-static method*/
	public void m1(){
		System.out.println("m1() method");
		m2(this);
	}
	public static void main(String[] args){
		Test t=new Test();
		t.m1();
	}
}

4.'this' can be used as a return type for a method.

class Test{
	/*non-static method*/
	public Test m1(){
		System.out.println("m1() method");
		return this;
	}
    
	/*non-static method*/
	public void m2(){
		System.out.println("m2() method");	
	}
	public static void main(String[] args){
		/*
		Test t=new Test();
		Test t1=t.m1();
		t1.m2();
         */
         new Test().m1().m2();
	}
}

5. this()[this constructor] can be used to call current class constructor
 
class Test{
	/*no-arg constructor*/
	Test(){
		 this(10);
		System.out.println("No-arg Constructor");
       
    }
	/*parameterized constructor*/
	Test(int x){
      System.out.println("One-arg Constructor");
	}
	public static void main(String[] args){
        Test t=new Test();

	}
}

6. 'this' can be used as an argument to a constructor.
class Student{
    Student(Test t1){
		System.out.println("t1:"+t1.str);
	}
}
class Test{
	String str;
	Test(String str){
		Student s =new Student(this);
	}
	public static void main(String[] args){
			Test t=new Test("Java");		
	}
}

Inheritance:
------------
Q# Why Inheritance ?
--------------------
class BsnlSim{
   //300 methods
}
class AirtelSim{
  //300 methods
}
class JioSim{
  //300 methods
}
1.The above code suffers from code duplication i.e. code redundancy.
2.Length of the code is increased.
3.Readability is getting down.

900 methods ----> 90 hours

250 methods are common

class Sim{
   //250 methods
}
class BsnlSim extends Sim {
   //50 specific methods
}
class AirtelSim extends Sim{
  // 50 specific methods
}
class JioSim extends Sim{
  // 50 specific methods
}

400 methods ----> 40 hours
1. No Code Redundancy
2. Length of the code reduced.
3. Readability will be improved.

Inheritance:
------------
1. Inheritnace is one of the cornerstone of Object Oriented Programming.
2. We use "extends" keyword to achieve inheritance."extends" means increasing functionality.
3. Inheritance is a mechanism by which one class inherits the features of another class
and adds it s own feature.
4. The class which does inheriting is called as child class/derived class/sub class. 
5. The class from which inherting happens is called as parent class/ base class/ super class.

6.Inheirtance talks about "IS-A" Relaltionship.
7. We use "extends" keyword to achieve "IS-A" Relaltionship.

Ex #1:
------
class P{
	/*non-static variable*/
	int x;
	/*static variable*/
	static int y;

	/*non-static method*/
	public void m1(){
		System.out.println("P class non-static m1() method");
	}
    /*static method*/
	public static void m2(){
		System.out.println("P class static m2() method");
	}
}
class C extends P{
	/*non-static variable*/
	int x1;
	/*static variable*/
	static int y1;

	/*non-static method*/
	public void m3(){
		System.out.println("C class non-static m3() method");
	}
    /*static method*/
	public static void m4(){
		System.out.println("C class static m4() method");
	}
}
class Test{
	public static void main(String[] args){
		C c=new C();
		c.m1();
		c.m2();
		System.out.println(c.x);
		System.out.println(C.y);

		c.m3();
		c.m4();
		System.out.println(c.x1);
		System.out.println(C.y1);


	}
}

Ex #2:
------
class P{
	/*non-static method*/
	public void m1(){
		System.out.println("P class non-static m1() method");
	}
}
class C extends P{
	/*non-static method*/
	public void m2(){
		System.out.println("C class non-static m2() method");
	}   
}
class Test{
	public static void main(String[] args){
	
		/*Case #1*/
		P p=new P();  // Parent Reference Parent object
		p.m1();
		//p.m2();

		/*Case #2*/
		C c=new C(); // Child reference Child object
		c.m1();
		c.m2();

		/*Case #3*/
		P p1=new C();  // Parent ref Child object  
      p1.m1();
      //p1.m2();


      /*Case 4*/
      C c1=new P();  // Child re Parent object

	}
}

//Compiler + JVM

Con #1: Child class methods are not by default avaiable to the parent class.
Hence by usng parent class reference variabel we can only call
patent class specifies methods, we can't call child class specific methods.

Con #2: Parent class method by default avialbale to the child class.
Hence using child class reference we can call both parent class specific methods and
child class specific methods.

Con #3 :Parent reference can be used to hold child class object.But by using that reference 
we can call only Parent class specific methods,we can't call child class specific methods.


Con #4:  Child reference can't be used to hold Parent class object. It is compilation time error.

C c1=new P();  // Parent ref Child object
E:\tempworkspace>javac Test.java
Test.java:30: error: incompatible types: P cannot be converted to C
        C c1=new P();  // Child re Parent object
             ^

1 error

Method Overriding:
------------------
Parent class method by default wil be available to the child class.
If child class is not happy with parent class method implementation child class can redefine that method.This is known as Method Overrriding.


In Method Overriding method resolution(Which method will be called) is taken care by 
JVM based on run time object.
This is known as Runtime Polymorphism or Dynamic Polymorphism or Late Binding(Which method will be called)or Dynamic Method Dispatch(Which method will be called).

class P{
	public void property(){
		System.out.println("Gold + Cash + Land");
	}
	public void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();

	  /*Case #2*/
	  C c=new C();
	  c.marry();

	  /*Case #3*/
	  P p1=new C();
      p1.marry();

	}
}

O.P:
Athma
Priyanka
Priyanka

Method  Hiding:
===============
In Method Hiding method resolution(Which method will be called) is taken care by 
Cimpiler based on reference variable.
This is known as Compile-time Polymorphism or static Polymorphism or Early Binding(Which method will be called).

class P{
	public static void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public static void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();          // Athma

	  /*Case #2*/
	  C c=new C();       // Priyanka
	  c.marry();

	  /*Case #3*/      
	  P p1=new C();  
      p1.marry();        // Athma

	}
}

O.P:

Athma
Priyanka
Athma

Method Signature:
-----------------
Method Signature includes method name and argument type.
                          -----------     -------------
Q> Let us consider the following  method. find the method Signature.

public static void m1(int i, double d){
  
   //body
  
}

Ans. Method Signature: m1(int, double)

Q> Who will use Method Signature?

Ans. Compiler use method signature.

Q> Prove that Compiler uses method signtaure.

Ans.
class Test{
	public void m1(){

	}
	public void m1(){  // m1()

	}
	public static void main(String[] args){
     
	}
}
E:\tempworkspace>javac Test.java
Test.java:5: error: method m1() is already defined in class Test
        public void m1(){
                    ^
1 error

Q> Can we have more than one method with smae signature inside the same class.
Ans.Inside the same class two method with same signtaure is not possible.
It will lead to Compile time error.

class Test{
	public void m1(){

	}
	public void m1(){  // m1()

	}
	public static void main(String[] args){
     
	}
}
E:\tempworkspace>javac Test.java
Test.java:5: error: method m1() is already defined in class Test
        public void m1(){
                    ^
1 error

Rules Of Overriding:
-------------------
1. In Method Overriding method signature  must be same. 
class P{
	public void m1(){   // m1()
		System.out.println("P class m1() method");
	}
}
class C extends P{
	public void m1(){ //m1()
		System.out.println("C class m1() method");
	}
}

*****
2.In Method Overriding return type must be same(Upto Java 1.4Version).
From 1.5 Version we can have diffferent return type also but in that case 
Parent class method return type and child class method return type 
must be in a Parent-Child relationship.

This  phenomenon is known as Covariant return type.

class P{
	public Object  m1(){   // m1()
		System.out.println("P class m1() method");
		return null;
	}
}
class C extends P{
	public String  m1(){ //m1()
		System.out.println("C class m1() method");
		return null;
	}
}
class Test{
	public static void main(String[] args){
		
	}
}

P Class method return type : Object
C Class method return type : Object | String| StringBuffer......

P Class method return type : Number
C Class method return type : Number | Integer | Float | Double| Long......

P Class method return type : String
C Class method return type : String

P Class method return type : double
C Class method return type : int 

The above is not covariant return type because double and int are not having any parent child
relationship.

3. Private method can't be override.
But depending on requirement we can decalre exactly same private method of parent class.
It is possible but it not method overriding.

class P{
	private void  m1(){   // m1()
		System.out.println("P class m1() method");
	}
}
class C extends P{
	private  void  m1(){ //m1()
		System.out.println("C class m1() method");
	}
}
class Test{
	public static void main(String[] args){
		  /*Case 1*/
		  P p=new P();
		  p.m1();
		  /*Case 2*/
		  C c=new C();
          c.m1();
		  /*Case 3*/
		  P p1=new C();
          p1.m1();
	}
}

4.final method can't be override.
class P{
	public void property(){
		System.out.println("Gold + Cash + Land");
	}
	public final  void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();

	  /*Case #2*/
	  C c=new C();
	  c.marry();

	  /*Case #3*/
	  P p1=new C();
      p1.marry();

	}
}

5. Access Modifer and Overridng : 

Access Modifier : private, <default>,protected,public 
Non-Access Modifier: final, static, abstract,synchronized... 

While overriding scope of access modifier can't be reduced.We can keep it same or we can
increase. Otherwise Compile time error will come.

class P{
	public void m1(){  // Access Modifer -> <default>
		System.out.println("P class m1() method");
	}
}
class C extends P{
	void m1(){  // Access Modifer -> 
		System.out.println("P class m1() method");
	}
}
class Test {
	
	public static void main(String[] args){
	
		
	}
}

E:\testworkspace>javac Test.java
Test.java:7: error: m1() in C cannot override m1() in P
        void m1(){  // Access Modifer ->
             ^
  attempting to assign weaker access privileges; was public
1 error

6. We can't override static methods. It is considered as Method hiding.

Q#1.Can we override a non-static method as static ?

Ans. We can't override non-static method as static.
class P{
	public void m1(){
		System.out.println("P class m1() method");
	}
}
class C extends P{
	public static void m1(){
		System.out.println("P class m1() method");
	}
}
class Test{
	public static void main(String[] args){
     
	}
}

Test.java:7: error: m1() in C cannot override m1() in P
        public static void m1(){
                           ^
  overriding method is static
1 error

Q#2> Can we override a static method as non-static ?
Ans. We can't override static method as non-static.

class P{
	public static void m1(){
		System.out.println("P class m1() method");
	}
}
class C extends P{
	public  void m1(){
		System.out.println("P class m1() method");
	}
}
class Test{
	public static void main(String[] args){
     
	}
}
E:\tempworkspace>javac Test.java
Test.java:7: error: m1() in C cannot override m1() in P
        public  void m1(){
                     ^
  overridden method is static

7. We can't override constructor. 
Q# Can we override a constructor ?
Ans. No, Constructor overriding is not possible.

Q#. How to prevent method overriding?
======================================
Ans.

Approach #1: By making the method as private method.
class P{
	private void  m1(){   // m1()
		System.out.println("P class m1() method");
	}
}
class C extends P{
	private  void  m1(){ //m1()
		System.out.println("C class m1() method");
	}
}
class Test{
	public static void main(String[] args){
		  /*Case 1*/
		  P p=new P();
		  p.m1();
		  /*Case 2*/
		  C c=new C();
          c.m1();
		  /*Case 3*/
		  P p1=new C();
          p1.m1();
	}
}

Approach #2: By making the method final.

class P{
	public void property(){
		System.out.println("Gold + Cash + Land");
	}
	public final  void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();

	  /*Case #2*/
	  C c=new C();
	  c.marry();

	  /*Case #3*/
	  P p1=new C();
      p1.marry();

	}
}
E:\tempworkspace>javac Test.java
Test.java:10: error: marry() in C cannot override marry() in P
        public void marry(){
                    ^
  overridden method is final
1 error


Approach #3:  By making the method as static method.
class P{
	public static void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public static void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();          // Athma

	  /*Case #2*/
	  C c=new C();       // Priyanka
	  c.marry();

	  /*Case #3*/      
	  P p1=new C();  
      p1.marry();        // Athma

	}
}

O.P:

Athma
Priyanka
Athma

Q#Explain "final" modifier.
-----------------------------
Ans. "final" is non-access modifier applicable for variables, methods and classes.

1. At Variable Level:
=====================
For final variable reassignment is not allowed.

class Test{
	public static void main(String[] args){
		final int x=10;
		System.out.println("x:"+x);
		x=25;
		System.out.println("x:"+x);
		
	}
}

E:\tempworkspace>javac Test.java
Test.java:5: error: cannot assign a value to final variable x
                x=25;
                ^

2. At method level:
===================
For final methods overriding is not allowed.

class P{
	public void property(){
		System.out.println("Gold + Cash + Land");
	}
	public final  void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();

	  /*Case #2*/
	  C c=new C();
	  c.marry();

	  /*Case #3*/
	  P p1=new C();
      p1.marry();

	}
}
E:\tempworkspace>javac Test.java
Test.java:10: error: marry() in C cannot override marry() in P
        public void marry(){
                    ^
  overridden method is final
1 error

3. At class level
==================
We can' inherit a final class.

final class P{

}
class C extends P{

}
class Test{
	public static void main(String[] args){
     

	}
}
E:\tempworkspace>javac Test.java
Test.java:4: error: cannot inherit from final P
class C extends P{
                ^
1 error

*****
Polymorphism :
==============
Polymorphsim in Java is a concept in which single action can be performed in different ways.
One name but multiple form is the concept of Polymorphism.
Polymorphism consists of two greek words.

Poly means many.
Morph means Form.

1. Compile time  Polymorphism
A. Method Overlaoding:

class Animal{}
class Monkey extends Animal{}

class Test{
	public void m1(Animal a){
		System.out.println("Animal Version");
	}
    public void m1(Monkey m){
		System.out.println("Monkey Version");
	}
	public static void main(String[] args){
			
		Test t=new Test();

		Animal a=new Animal();
		t.m1(a);
		
		Monkey m=new Monkey();
		t.m1(m);
		
		/*parent ref child object*/
		Animal a1=new Monkey();
		t.m1(a1);

	}
}
In Method  Overloading method resolution(which method to execute)
is taken care by Compiler based on reference variable.
This is known as Compile time polymorphism or static polymorphism
or early binding.


B. Method Hiding:
==================
class P{
	public static void marry(){
		System.out.println("Athma");
	}
}
class C extends P{
	public static void marry(){
		System.out.println("Priyanka");
	}
}
class Test{
	public static void main(String[] args){
      /*Case #1*/
	  P p=new P();
	  p.marry();          // Athma

	  /*Case #2*/
	  C c=new C();       // Priyanka
	  c.marry();

	  /*Case #3*/      
	  P p1=new C();  
      p1.marry();        // Athma

	}
}

O.P:

Athma
Priyanka
Athma

C. Variable Hiding:
================
In Variable Hiding variable resolution(which variable to execute)is take care by 
Compiler based on reference variable.
This concept is knwon as Variable Hiding.

class P{
	int x=111;
}
class C extends P{
	int x=222;
}

class Test{
	public static void main(String[] args){
	
		/*Case #1*/
		P p =new P();
		System.out.println(p.x);
		/*Case #2*/
		C c=new C();
        System.out.println(c.x);
		/*Case #3*/
		P p1=new C();
		System.out.println(p1.x);
	}
}
E:\testworkspace>java Test
111
222
111

Note: Here taking the variable as static or non-static does not have any effect.



    
2. Run time Polyporphism  :
     1. Method Overridng

3. Parent ref child object 

A boy starts the relationship love with the word "Friendship".
A girl ends the relationship love with the word "Friendship".

class Animal{}
class Monkey extends Animal{}

class Test{
	public void m1(Animal a){
		System.out.println("Animal Version");
	}
    public void m1(Monkey m){
		System.out.println("Monkey Version");
	}
	public static void main(String[] args){
			
		Test t=new Test();

		Animal a=new Animal();
		t.m1(a);
		
		Monkey m=new Monkey();
		t.m1(m);
		
		/*parent ref child object*/
		Animal a1=new Monkey();
		t.m1(a1);

	}
}
In Method  Overloading method resolution(which method to execute)
is taken care by Compiler based on reference variable.
This is known as Compile time polymorphism or static polymorphism
or early binding.


*****
Q#What is the difference beetween Method Overloading and Method Overriding?
===========================================================================
Ans. will be discussd in the next class.


Abstract  Modifier:
-------------------
-> It is a non-access modifer applicable for methods and classes.


Abstract method:
================
Even though we don't know about the implementation still we can declare methods in java 
with the help of "abstract" modifier.
Abstract methods must not have body.
Hence "abstract" methods must be end with semicolon.

Abstract class:
---------------
If for a Java class object creation is not possible that class is known as abstract class.

abstract class Vehicle{
	public abstract int getNoOfWheels();
}
class Test{
	public static void main(String[] args){

		Vehicle v=new Vehicle();
	}
}

E:\testworkspace>javac Test.java
Test.java:7: error: Vehicle is abstract; cannot be instantiated
                Vehicle v=new Vehicle();
                          ^


If a class contain at least one abstract method then compulsory the class  msut have to be decalre as abstract.

Abstract class not necessarily have abstract methods.


Q#If a abstract class does not contain any abstract method then what is the use of that class?

Ans.

Ex #1: HttpServlet class
       Adpater class


Ex #1:
------
abstract class Vehicle{
	public abstract int getNoOfWheels();
}
class Auto extends Vehicle{
    public int getNoOfWheels(){
		return 3;
	}
}
class Bus extends Vehicle{
    public int getNoOfWheels(){
		return 7;
	}
}
class Test{

	public static void main(String[] args){

		//Auto a=new Auto();
		Vehicle v=new Auto();
		System.out.println(v.getNoOfWheels());

		v=new Bus();
		System.out.println(v.getNoOfWheels());
	}
}

Test Case #1:
-------------
class Test{
    public int m1();
}
E:\testworkspace>javac Test.java
Test.java:2: error: missing method body, or declare abstract
    public int m1();
               ^
1 error

Test Case #2:
--------------
class Test{
    public abstract int m1();
}
E:\testworkspace>javac Test.java
Test.java:1: error: Test is not abstract and does not override abstract method m1() in Test
class Test{
^
1 error

Test Case #3:
=============
class Test{
    public abstract int m1(){

	}
}
E:\testworkspace>javac Test.java
Test.java:1: error: Test is not abstract and does not override abstract method m1() in Test
class Test{
^
Test.java:2: error: abstract methods cannot have a body
    public abstract int m1(){
                        ^
2 errors

Test Case #4
-------------
abstract class Test{
    public abstract int m1();
}

The abaove code will compile.

Combination of abstract modifier with other modifers:
======================================================
1. abstract final combination:
------------------------------
Q#1: Can we have abstract method as final or vice versa.
Ans. No, abstract and final makes illegal combination of modifiers.

Method level
=============
Case #1:

abstract class Test{
    public abstract final int m1(){

	}
}

E:\testworkspace>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and final
    public abstract final int m1(){
                              ^
1 error

Case #2:
---------

abstract class Test{
    public abstract final int m1();
}

E:\testworkspace>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and final
    public abstract final int m1();
                              ^
1 error

Q#2. Can we have abstract class as final or vice versa.

Ans. No, abstract and final makes illegal combination of modifiers.

class level:
===========

abstract final class Test{

}
E:\testworkspace>javac Test.java
Test.java:2: error: illegal combination of modifiers: abstract and final
abstract final class Test{
               ^
1 error

Q#3. Can we have an abstract method as private or vice-versa?

Ans.No, abstract and private makes illegal combination of modifiers.

class Test{
	private abstract  void m1(){

	}
}
E:\testworkspace>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and private
        private abstract  void m1(){
                               ^
1 error

Q#4. Can we have static method as abstract or vice versa.

Ans.

abstract class Test{
	 abstract static  void m1(){

	}
}
E:\testworkspace>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and static
         abstract static  void m1(){
                               ^
1 error

Note:Abstract modifier promotes oops feature like inheritance and polymorphism.
It is recommended to use.























 





































































