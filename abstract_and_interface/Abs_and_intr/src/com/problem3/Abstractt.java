package com.problem3;

//abstract an abstract class may or may not have an astract method.
// A concreate class can not have an abstract method because class containing an abstract
// method must also be abstract 
// lets understand this by an example
// then what is the sence of creating object for such class there for this class is made as abstract;


public  abstract class Abstractt {
    abstract void display();

}





class ConcreteClass extends Abstractt {
    void display()
    {
        System.out.println("Hi.");
    }
}




