Day #1 : Date : 04.01.2023
==========================

Interface:
---------
=> Interface is Service Requirement Specification(SRS).
=> From the Client provider point of view it defines the set of services that we are expecting and from Service provider point of view it defines the services which they are offering.
Hece it is a cotract between client and  Service provider.
=> Interface is 100 % pure abstract class.

Technical Definition:
=====================
Interface is Service requirement specification or it is Contract between client and Service Provider or it is 100 % pure abstract class(Upto Java 7 version).

Aot    : Attendance Management System

Requriements :
--------------
1. getMarks
2. getPaymentDeatils
3. getAttendance
.....
.....
Vendor : TCS(Got the project), CTS, Wipro, IBM ..... 

Interface methods:
-------------------
Inside interafce all methods are by default public and abstract upto java 1.7 version.

interface Aot{
    void getAttendance();
    void m1();
    void m2();
}

class TCS implements AOT{
    /* we need to implement the interface methods*/
    public void getAttendance(){

    }
    public void m1(){}
    public void m2(){}
}

Note : Method definition or  Method Implementation or  Method Overriding all are same but we have to use the terminlogy based on the position where we use.

Collection Framework
====================
int x=10;
int y=20;
int z=30;


Array:
------
Array is an indexed collection of fixed number of homogeneous elements.
Ex: int [] a =new int[1000];

Advantage:
----------
The main advantage of array is we can represnt multile values 
by using a single variable so readability of the code will be improved.

Disadvantage:
-------------
1. Arrays are fixed in size. Once we create an array we can't increment or decrement the size based on our requirement.Due to this to use array concept we need to know the size of the array from the beginning which may not be possible always.


2. Array can hold only homogeneous elements.

class Employee{}
class Customer{}
class Student{}
class Test{

   public static void main(String[] args){
        Student []s=new Student[60];
		  s[0]=new Student();
        s[1]=new Student();
        s[2]=new Customer();   // CE
    }
}
We can solve this problem by using Object array,
class Demo{

   public static void main(String[] args){
        Object []obj=new Student[60];
		  obj[0]=new Student();
        obj[1]=new Employee();
        obj[2]=new Customer(); 
    }
}

3. Arrays concept are not implemented based on some data structure.That is why for every requirement we have to write the code explicitly no ready-made method support is available.
 
To get  rid of the above drawbacks we ned to learn the concept of Colelction Framework

1. Collections are growable in nature i.e based on our requirement we can increment or decrement the size.

2. Collections can hold both homogeneous and heterogeneous elements.

3. Every Collection class(Collection interface implemented class)is implemented based on some standard data structure.Hence ready made metthod support is available.
Being a programmer we are responsible to use those methods we are not responsible to implement
those methods.

Q#1.What is Collection?
-----------------------
Ans.
-> Collection is a predefined interface present in java.util package.

Q#2. When should we go for Collection concept?
----------------------------------------------
Ans. If we want to represnt a group of individual objects as a single entity then we should go for Collection concept.

Q#3. What is Collection Framework ?
-----------------------------------
Ans. It contains several classes and interfaces which can be used to
represent a group of individual objects as a single entity.

*****
Q#4.What are the differences between Array and Collection?
-----------------------------------------------------------



9 key interfaces of Collection Framework
========================================
1. Collection
2. List
3. Set
4. SortedSet
5. NavigableSet
6. Queue
7. Map
8. SortedMap
9. NavigableMap

Collection(I):
--------------
-> If we want to represnt a group of individual objects as a single entity then we should go for Collection concept.

-> In genearl  Collection Interface is considered as the root interface of collection framework.

-> Collection interface defines the  most common methods which are applicable for any collection interface implemented class object.

-> There is no concrete class which implements Collection interface directly.

Day #2: Date : 06.01.2023
=========================
List(I):
-------
-> It is the child interface of Collection.
-> If we want to represent a group of individual objects as a single entity where 
duplicates are allowed and insertion order is preserved.

package com.wipro.test;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		System.out.println(al);
		al.add("AAA");
		System.out.println(al);	
	}
}
O.P:
[AAA, BBB]
[AAA, BBB, AAA]

Set(I):
-------
-> It is the child interafce of Collection.
->  If we want to represent a group of individual objects as a single entity where 
duplicates are not allowed and insertion order is not preserved.

package com.wipro.test;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {

			HashSet<String> hs=new HashSet<>();
			hs.add("AAA");
			hs.add("BBB");
			hs.add("CCC");
			System.out.println(hs);
			hs.add("AAA");		
			System.out.println(hs);		
	}
}

SortedSet(I):
-------------
-> It is the child interafce of Set interface.
->  If we want to represent a group of individual objects as a single entity where 
duplicates are not allowed and and all objects should be inserted according to some sorting order then we should go for SortedSet interface.

NavigableSet(I):
----------------
-> It  is the child interface of SortedSet interface.
-> It contains methods for navigation purpose.

Queue(I):
---------
-> It is child interface of Collection.
-> If we want to represent a group of individual objects prior to processing  as a single entity then we should go for Queue.
-> Usually queue follows First-In-First-Out.But based on our requirement we can implement our own priority order also.

Example:Before sending a mail all maid id's we have to store in some data structure.In which order we added mail id's in the same order mail will be delivered.
For this requirement Queue is the best choice.


Map(I):
-------
-> It is  an interface present in java.util package.
-> If we want to represent a group of individual objects as a key-value pair then we should go for Map interface.

Student Roll No#(Key)      Student Name(Value)
--------------------      ---------------------
111                        AAA
222                        BBB
333                        CCC
-> Key can' be duplicate but values can be duplicated.
-> Key and value both must be object.

SortedMap(I):
--------------
-> It is the child interface of Map.
-> If we want to represent a group of key-value pair according to some sorting order of keys then we should go for SortedMap.
-> In SortedMap sorting should be based key but not based on value.

NaviagableMap(I):
-----------------
-> It is the child interafce of SortedMap(I)
-> It contains some methods for navigation purpose.

The important methods of Collection interface:
==============================================
1. boolean add(Object o) : return true if the Collection changes due to the method call.

Ex:
package com.wipro.test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
         ArrayList< String> al =new ArrayList<>();
         System.out.println(al);
        System.out.println( al.add("AAA"));
         System.out.println(al);
         
		HashSet<Integer>hs=new HashSet<>();
		System.out.println(hs.add(111));
		System.out.println(hs.add(111));
	}
}


2. boolean addAll(Collection c) : Add all the elements of the specified collection to this collection.

package com.wipro.test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
         ArrayList< Object> al =new ArrayList<>();
         al.add("AAA");
         al.add("BBB");
         al.add("CCC");
         System.out.println("ArrayList:"+al);
         
		   HashSet<Integer>hs=new HashSet<>();
		   hs.add(111);
		   hs.add(222);
		   System.out.println("HashSet:"+hs);
		   al.addAll(hs);
		 
		 System.out.println("ArrayList:"+al);  
	}
}

In the above example hs(HashSet) is the specified collection and al(ArrayList) is the this collection.

Day #3 : Date : 11.01.2023
==========================
Object type Casting:
====================

Loose Coupling:
1. Super class reference variable can be  used to hold sub class object.
2. Abstract class  reference variable can be  used to hold sub class object.
3. Interfcae reference variable can be used to hold implemented class object.

Syntax: A b =(C) d;

A : Class Name or Interface Name
b : Refrence variable name
C:  Class Name or Interface Name
d : object name

Rule #1(Compiler) : C and d must be either of same type or they must maintain Parent to Child or 
Child to Parent relationship.

Ex #1: 

Object o =new String("Java");
StringBuffer sb=(StringBuffer)o;
A            b = (C)          d;  

No Compile time error.

Ex #2:

class Test{
	public static void main(String[] args) {
    
		String s =new String("Java");
		StringBuffer sb=(StringBuffer)s;
     //A            b = (C)          d;  

	}
}
E:\cs1cs2cs3>javac Test.java
Test.java:5: error: incompatible types: String cannot be converted to StringBuffer
                StringBuffer sb=(StringBuffer)s;
                                              ^
1 error

The above code fails Rule #1.

Rule #2(Compiler): A and C must  maintain  either same or Parent to Child.

Ex #1:

Object o =new String("Java");
StringBuffer sb=(StringBuffer)o;
A             b=(C)           d;

No Compile time error.

Ex #2:

class Test{
	public static void main(String[] args) {
		Object o =new String("Java");
		String sb=(StringBuffer)o;
      //A             b=(C)           d;
	}
}

E:\cs1cs2cs3>javac Test.java
Test.java:9: error: incompatible types: StringBuffer cannot be converted to String
                String sb=(StringBuffer)o;
                          ^
1 error

The above code fails Rule #2.

Rule #3(JVM) : d and C must maintain either  same or Child to Parent relationship.

Ex #1: 

class Test{
	public static void main(String[] args) {
		Object o =new String("Java");
		StringBuffer sb=(StringBuffer)o;
		//A             b =(C)          d;  // must be same  -> No 
		                                  // d is cjhild of C -> No   ClassCastException

	}
}
E:\cs1cs2cs3>java Test
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuffer (java.lang.String and java.lang.StringBuffer are in module java.base of loader 'bootstrap')
        at Test.main(Test.java:4)

The above code fails  Rule No #3.

Ex #2:

class Test{
	public static void main(String[] args) {
		Object o =new String("Java");
		String s=(String)o;
		//A             b =(C)          d;   
		                                    
	}
}

The above code pass all the rules.

Generics :
---------
Every collection interface implmented class are having two versions.

1. Normal Version

import java.util.ArrayList;
class Test{
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("AAA");
	}
}

E:\cs1cs2cs3>javac Test.java
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

2. Generic Version
The main objective of Generics is to provide type safety and to resolve type casting problem.

Arrays: 
-------
Arrays are always type safe that is we can give guarantee for the  type of elements present inside an array.

For example if our programming requirement is to work with String object then it is recommnended to use String arrays.

In the case of String array we can add only String type of objects and by mistake if we are trying to add any other type we will get compile time error.

class Test{
	public static void main(String[] args) {
		
         String [] str=new String[4];
		  str[0]=new String("CSE1");
		  str[1]=new String("ECE1");
		  str[2]=new String("CSBS");
		  str[3]=new Integer("10");
        String str1=str[1];
        System.out.println(str1);

	}
}
Test.java:9: error: incompatible types: Integer cannot be converted to String
                  str[3]=new Integer("10");
                         ^
1 error

Based on above  error we can always provide guarantee for the  type of elements present inside array and hence with respect to the types  arrays are recomended to use because it is type safe.
Also at the time of retrival type-casting is not required.


Collections are not type safe.That is we can not provide any guarantee for the type of elements present inside Collection.

For example if our programming requirement is to hold  String type object and if we are choosing Arraylist,then by mistake if we are trying to add any other type of data then compiler is unable to generate compilation error,hence program may fail at runtime.

import java.util.ArrayList;
class Test{
	public static void main(String[] args) {
	
      
		  ArrayList al=new ArrayList();
		  al.add("AAA");   
		  al.add("BBB");   
        al.add("CCC");   
		  al.add(new Integer(10));  
		   
		  String str1 =(String)al.get(0);
         String str2 =(String)al.get(1);
		  String str3 =(String)al.get(2);
		  String str4 =(String)al.get(3);
   

	}
}
After Compilation:
-------------------
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.


After Running:
--------------
E:\cs1cs2cs3>java Test
Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Str

Thats why it is recommended to use Generics Version.


import java.util.ArrayList;
class Test{
	public static void main(String[] args) {
	
      
		  ArrayList<String> al=new ArrayList<>();
		  al.add("AAA");   
		  al.add("BBB");   
        al.add("CCC");   
		  al.add(new Integer(10));  
		   
		  String str1 =(String)al.get(0);
         String str2 =(String)al.get(1);
		  String str3 =(String)al.get(2);
		  String str4 =(String)al.get(3);
   
	}
}

If we use Generic Version the above code will fail at compilation time hence there is no chance of failing the program at run time.
That means now the code is type safe as we cant add any other object other than String as well as type casting problem is not there because everytime whatever will be retrieved is String only.

Day #4 : Date : 13.01.2023
==========================
3. remove(Object o):
--------------------
-> This method removes the first occurance of the specified element from the Specified Collection.
-> This method returns true if the elment go removed.
-> This method returns false if the element is not removed.


package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");
		System.out.println("Before Removal :"+al);
		
		System.out.println(al.remove("BBB"));
		System.out.println("After Removal :"+al);
		System.out.println(al.remove("BBB"));
		
	}
}

4. boolean removeAll(Collection c):
-----------------------------------
-> This method removes all the elements of specified collection  from this collection.
-->If remove operation is success then removeAll() method will return true value.
-->If remove operaton is failure then removeAll() method will return false value.


package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");
		
		ArrayList<String> all=new ArrayList<>();
		all.add("BBB");all.add("CCC");all.add("DDD");
	
		System.out.println("Before Removal :"+al);
		System.out.println(al.removeAll(all));
		System.out.println("After Removal :"+al);
		System.out.println(al.removeAll(all));
		
	}
}
In the above example al is this collection and all is specified collection.

5. boolean contains(Object obj)
-->This method is used for checking if the specified element exists in the given Collection or not.
-->If the specified element is existed then this method will return "true" value.
-->If the specified element is not existed then this method will return "false" value.


package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");
		
		System.out.println(al.contains("CCC"));
		System.out.println(al.contains("XXX"));
		
	}
}

6. boolean containsAll(Collection c)
--> This method will check whether all the elements of the specified Colllection are avaialable or not.
-->If all the specified element is existed then this method will return "true" value.
-->If atleast one element is not existed then this method will return "false" value.


package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");
		
		ArrayList<String> all=new ArrayList<>();
		all.add("BBB");all.add("CCC");all.add("DDD");
		
		System.out.println(al.containsAll(all));
		all.add("XXX");
		all.add("YYY");
		
		System.out.println(al.containsAll(all));
		
	}
}

7. boolean reatainAll(Collection c)
--> This method retain all elements of specified collection and remove remaining elements.
--> If at least one element is removed then retainAll() method will return true value.
--> If no element are removed then it will return false value.

package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");al.add("BBB");
		
		ArrayList<String> all=new ArrayList<>();
		all.add("BBB");all.add("CCC");all.add("DDD");
		
		System.out.println(al);
		System.out.println(al.retainAll(all)); 
		System.out.println(al);
		System.out.println(al.retainAll(all)); 
			
	}
}


8. int size()
-> This method can be used return an integer value representing th eno of element existed in any Collection interface implemented class object.

package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
		
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");al.add("BBB");
		System.out.println(al.size());
		
		
	}
}

9. boolean isEmpty()
--> This method can be used to check whether Collection interface implemented class object is empty or not.
    If the Collection interface implemented class object is empty then isEmpty() method will return "true" value.
	If the Collection interface implemented class object is not empty then isEmpty() method will return "false" value.

package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.isEmpty());
		
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");al.add("BBB");
		System.out.println(al.isEmpty());
		
		
	}
}

10. void clear()
->This method can be used to remove all the elements from Collection interface implemented class object.

package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");al.add("BBB");
		
		System.out.println(al.size());
		al.clear();
		System.out.println(al.size());
		
	}
}

11. Object[] toArray()
package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");al.add("BBB");al.add("CCC");al.add("DDD");al.add("EEE");al.add("FFF");al.add("BBB");
		Object[] obj=al.toArray();
		for(Object o:obj)
			System.out.println(o);
		
	}
}

12. Iterator iteartor():

List(Interface):
----------------- 

-> It is the child interface of Collection.
-> If we want to represent a group of individual objects as a single entity where 
duplicates are allowed and insertion order is preserved.
-> In case of List interafce inde plays a very important role.

Important methods of List Interface:
====================================
1.void add(int index, Object o)
2.boolean addAll(int index,Collection c)
3.Object remove(int index, Object obj)
4.Object get(int index)
5.Object set(int index, Object obj)
6.int indexOf(Object obj)
7.int lastIndex(Object obj)
8.ListIetrator listiterator()


1.public void add(int index,Object o):
-----------------------------------------
->This method inserts the specified element at the specified position.
->It shifts the element currently at that position(if any) and any subsequent elements to the right.(will add one to their indices).	

package com.wipro.test;
import java.util.*;
class Test{
	public static void main(String[] args){
		List<String> list =new ArrayList<>();
		list.add("AAA"); list.add("BBB");list.add("CCC");list.add("DDD");
		System.out.println(list);  // [AAA,BBB,CCC,DDD]
		
		list.add(2,"XXX");
		System.out.println(list);
		
		//list.add(6,"XXX"); //java.lang.IndexOutOfBoundsException:
		
	}
}

2.boolean addAll(int index,Collection c)

-->This method inserts all the elements of the specified collection to the present Collection interface implemented class object at the specified starting index.It shifts the element currently at that position and any subsequent element to the right.


package com.wipro.test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
         ArrayList< Object> al =new ArrayList<>();
         al.add("AAA");
         al.add("BBB");
         al.add("CCC");
         System.out.println("ArrayList:"+al);
         
		   HashSet<Integer>hs=new HashSet<>();
		   hs.add(111);
		   hs.add(222);
		   System.out.println("HashSet:"+hs);
		   al.addAll(1,hs);
		 
		 System.out.println("ArrayList:"+al); 
	}
}
















