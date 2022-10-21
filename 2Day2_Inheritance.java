//How to use inheritance in java?
//The keyword used for inheritance is "extends"
//Syntax: 
class derived-class extends base-class{
    //methods and fields
}

//----------------------------------------------------------------------------------

//Java Program to illustrate the concept of inheritance
//In the below example, class Bicycle is a base class and class MountainBike is 
//a derived class that extends Bicycle and class Test is a driver class to run program.
//Base class
class Bicycle{
    //Two fields
    public int gear;
    public int speed;
    //One constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    //Three methods
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    
    //toString() method to print info of Bicycle
    public String toString(){
        return("No of gears are "+ gear + "\n" + "speed of Bicycle is " + speed);
    }
}
//Derived class
class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void seatHeight(int newValue){
        seatHeight = newValue;
    }
    //overriding toString() to of Bicycle to print more info 
    @Override public String toString(){
        return (super.toString() + "\nseatHeight is " + seatHeight);
    }
}
//driver class 
class Main{
    public static void main(String args[]){
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
//Output:
// No of gears are 3
// speed of Bicycle is 100
// seatHeight is 25


//------------------------------------------------------------------------------

//Java program to illustrate the concept of single inheritance
//Single Inheritance: In single Inheritance subclasses inherit the features of 
//one super class. Class A serves as base class for the derived class B 
import java.io.*;
import java.lang.*;
import java.util.*;
class one{
    public void print_chocolate(){
        System.out.println("Chocolates");
    }
}
class two extends one{
    public void print_for(){
        System.out.println("for")
    }
}
//Driver class
public class Main{
    public static void main(String args[]){
        two c = new two();
        g.print_chocolate();
        g.print_for();
        g.print_chocolate();
    }
}

//-----------------------------------------------------------------------------
//MultiLevel Inheritance 
//In Multilevel Inheritance a derived class will be inheriting a base class and 
//as well as the derived class also act as the base class. Class A serves as a base 
//class for the derived class B, which in turn serves as base class for the derived 
//class C.
//illustrate the concept of Multilevel inheritance.
import java.io.*;
import java.lang.*;
import java.util.*;
class One{
    public void print_blackpink(){
        System.out.println("Blackpink songs");
    }
}
class Two extends One{
    public void print_for(){
        System.out.println("for");
    }
}
class Three extends Two{
    public void print_but1fulalgo(){
        System.out.println("but1fulalgo");
    }
}
//Derived class 
public class Main{
    public static void main(String args[]){
        Three b = new Three();
        b.print_blackpink();
        b.print_for();
        b.print_but1fulalgo();
    }
}

//output :
// blackpink songs
// for 
// but1fulalgo

//Hierarchical Inheritance: 
//In Hierarchical inheritance one class serves as a super class(base class)
//for more than one sub class. For ex: class A serves as a base class for 
//class B, C, and D 
//Java program to illustrate the concept of Hierarchical inheritance
class A{
    public void print_A(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void print_B(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void print_C(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void print_D(){
        System.out.println("Class D");
    }
}
//Driver Class
public class Main{
    public static void main(String args[]){
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();
        
        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();
        
        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();
    }
}
//output:
// Class A
// Class B
// Class A
// Class C
// Class A
// Class D

//----------------------------------------------------------------------------------------
//Multiple Inheritance:(Through interfaces)
//In Multiple inheritances, one class can have more than one superclass and inherit features
//from all parent classes. Java does not support Multiple inheritances with classes.
//We can achieve multiple inhertances only through interfaces. Ex: class C is Derived from class A and Class B 
//Java program to illustrate the multiple inheritance 
import java.io.*;
import java.lang.*;
import java.util.*;
interface one{
    public void print_instagram();
}
interface two{
    public void print_snapchat();
}
interface three extends one, two{
    public void print_youtube();
}
class child implements three{
    @Override public void print_instagram(){
        System.out.println("Instagram reels");
    }
    public void print_snapchat(){
        System.out.println("Snapchat snaps");
    }
    public void print_youtube(){
        System.out.println("Youtube videos");
    }
}
//Driver class
public class Main{
    public static void main(String args[]){
        child c = new child();
        c.print_instagram();
        c.print_snapchat();
        c.print_youtube();
    }
}
//output 
// Instagram reels
// Snapchat snaps
// Youtube videos

//----------------------------------------------------------------------------------------
//Hybrid Inheritance(Through interfaces)
//It is the mix of two or more above types of inheritance. Java does not 
//support multiple inheritances with classes, hybrid inheritance is also not 
//possible with classes. We can achieve hybrid inheritance through interfaces.


//-----------------------------------------------------------------------------------------
//How extends keyword is used to achieve inheritance
public class SolarSystem{
}
public class Earth extends SolarSystem{
}
public class Mars extends SolarSystem{
}
public class Moon extends Earth{
}

//Write a program to check wheather the above things are true or not 

class SolarSystem{
}
class Earth extends SolarSystem{
}
class Mars extends SolarSystem{
}
public class Main extends Earth{
    public static void main(String args[]){
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}
//output: 
// true
// true
// true

//-----------------------------------------------------------------------------------------

//Java program to demonstrate multiple inheritance through default methods
interface Pizza1{
    default void show(){
        System.out.println("Default Pizza 1");
    }
}
interface Pizza2{
    default void show(){
        System.out.println("Default Pizza 2");
    }
}
class Main implements Pizza1, Pizza2{
    public void show(){
        Pizza1.super.show();
        Pizza2.super.show();
    }
    public static void main(String args[]){
        Main d = new Main();
        d.show();
    }
}

//output:
// Default Pizza 1
// Default Pizza 2




//-------------------------------------------------------------------------------------------


//Java Program to demonstrate how dimond problem is handled in case of Default Methods 
interface Zomato{
    default void show(){
        System.out.println("Default Zomato");
    }
}
interface Pizza1 extends Zomato{
}
interface Pizza2 extends Zomato{
}
class Main implements Pizza1, Pizza2{
    public static void main(String args[]){
        Main d = new Main();
        d.show();
    }
}

//output:
// Default Zomato
