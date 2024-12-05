package com.driver;

  public static  class A {
        public String meth() {
            return "Involing method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended Class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
}
