package com.driver;

public class Main {
   class A {
        public String meth() {
            return "Involing method from class A";
        }
    }

      class B extends A {
        @Override
        public String meth() {
            return "Method is Overridden in Extended Class B";
        }

    }

    public void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
}
