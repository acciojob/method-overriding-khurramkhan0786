package com.driver;

 package com.driver;


// Task 1: Create a class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    // Task 4: Override the method meth
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to execute the tasks
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B objB = new B();
        // Call the method from class A (before override)
        System.out.println(objB.meth()); // Task 5 will display overridden output

        // Demonstrating the overridden method in class B
        System.out.println("Calling overridden method:");
        System.out.println(objB.meth());
    }
}

