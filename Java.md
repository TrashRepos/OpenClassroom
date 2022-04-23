# Java

# SoloLearn
* Multi-Line comment = Block comment
* Javadoc is a tool which comes with JDK and it is used for generating Java code documentation in HTML format from Java source code which has required documentation in a predefined format.
* **You can use a comma-separated list to declare more than one variable of the specified type. Example: int a = 42, b = 11;**

--> [robust](https://translate.google.com/?sl=en&tl=ar&text=robust&op=translate) -- [virtually](https://translate.google.com/?sl=en&tl=ar&text=virtually&op=translate) -- [operand](https://translate.google.com/?sl=en&tl=ar&text=operand&op=translate)



# OpenClassrooms

* camel case ==  *camel caps* 
* create a variable means declaring a variable !
* Comments are the opposite of Statements**
* Type NameOfVariable Assignment Operator Expression *int number = 5* All of this called Statement
* A variable is composed of three elements: name, value, and type.
* Values of variables can be modified.
* Variables with constant values are called constants.
* Naming variables should follow common naming conventions.
* When running a program, your CPU (central processing unit) will need to know how much space to reserve for your variable. Declaring it with a type allows your CPU to save that space in memory for your variable depending on what type it is.
* Using constants final int something = 0;
```
float length = 1876.79;
double width = 1876.79797657;
```


* make a variable of one type act like another type. This is called *type casting*. To solve the problem we had in the last example, make variable b pretend that it's an integer by assigning it to 'c' like below:

```
int a = 10;
int b = 4;
double c = a/(double) b; //-> c contains 2.5, as the value in b is casted to a double 
```


--> [get the most out of](https://translate.google.com/?sl=en&tl=ar&text=get%20the%20most%20out%20of&op=translate) -- [utilize](https://openclassrooms.com/en/courses/5667431-learn-programming-with-java/5923766-get-the-most-out-of-this-course) -- [unravel](https://translate.google.com/?sl=en&tl=ar&text=unravel&op=translate) -- [expenditures](https://translate.google.com/?sl=en&tl=ar&text=expenditures&op=translate) -- [assign](https://translate.google.com/?sl=en&tl=ar&text=assign&op=translate) -- descriptive *(from the word describ)* -- [throughout](https://translate.google.com/?sl=en&tl=ar&text=throughout&op=translate) -- [reiterate](https://translate.google.com/?sl=en&tl=ar&text=reiterate&op=translate)



# Oracle
**Variables**
* an object stores its state in fields.
```
int cadence = 0;
int speed = 0;
int gear = 1;
```

* Instance Variables == Fields == Non Static Fields
* Instance Variables , their values are unique to each *Instance* == *Object* of a class .
* Instance Variables and Local Variables are both *Non-Static* .
* Instance Variables are **declared** in a class outsite any *method , constructor or block* .
* Instance Variables are **created** when an Object of the class is created and destroyed when the object is destroyed .
* Instance Variables , we can use access specifiers (*private, default, protected, public*) on Instance Variables , if we don't specify then the default access specifier will be used .
* Instance Variables , **Initialisation** of Instance Variables is not Mandatory , it's default value is 0 .
* Instance Variables , They *can not* be **Reinitialized** directly whitin class .
* Instance Variables , They can be **Reinitialized** inside a method or a constructor .
* Instance Variables can be **accessed** only by creating an object of the class .
* Local Variables are **declared** or defined within *mehtod , constructor or block* .
* Local Variables are **created** when the block in entered or the function is called and destryed after exiting the blcok or when the call returns from the function .
* Local Variables scope **exists** only within the block in which the variable is declared.we can access these variable only within block or method .
* Local Variables , **Initialisation** is Mandatory .
* Local Variables , They don't get a default value .
* Local Variables , Direct access within the method or block .
* ***Static Variables == Class Variables == Static Fields*** .
* Static Variables , We need to use the keyword *static* .
* Static Variables , when declared then a single copy of the variable is created and shared among all objects at a class level . Meaning if we created two objects of the class test , both objects will have data variable in them but only one data_2 variable created which will be shared by all objects of this class 

``` 
class Test {
int data ;
static float data_2;
}
```

* Static Variables are essentially global variables .
* Static Variables , static *LOCAL* variables are not allowd in java , therefor a static variable is a class variable(*for the whole class*). So Static Variables can be ***only*** created at class-level.
* Static Variables , All instances of the class share the same Static Variable.
* Static Variable and Static Block are executed in order the are present in a program .
* Stattic Variable can be accessed using class name meaning ``` ClassName.StaticVariable ``` , we don't need an object to access static Variables. 
* Static Variables , they are directly accessed without creating an object of the class .

[local, Instance and Static Variables](https://www.youtube.com/watch?v=jYNUsgHV_EU) -- [Difference between static and non-static variables in java](https://www.geeksforgeeks.org/difference-between-static-and-non-static-variables-in-java/)

Example
``` 
package practice

public class Practice {
  static int staticVariable = 30;
  
  int instanceVariable = 20;
  
  void someMethod() {
    int localVariable = 10; ----------------------------------> Scope or Territory of local variables 
  }
  public static void main(String[] args) {
    Practice obj1 = new Practice();
    System.out.println(obj1.instanceVariable);
    System.out.println(Practice.staticVariable);
  }
}
```

* If your variable stores a constant value, such as static final int NUM_GEARS = 6, the convention changes slightly, capitalizing every letter and separating subsequent words with the underscore character. By convention, the underscore character is never used elsewhere.
* Primitive Data Types of Java : *int,char,byte,double,float,short,long,boolean* .
* 

--> [distinction](https://translate.google.com/?sl=en&tl=ar&text=distinction&op=translate) -- [essentially](https://translate.google.com/?sl=en&tl=ar&text=essentially&op=translate) -- (primitive)[https://translate.google.com/?sl=en&tl=ar&text=Primitive&op=translate]