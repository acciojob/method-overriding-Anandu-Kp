package com.driver;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.meth();
        b.meth();
    }

}
class A
{
    public static String meth()
    {
        return "Invoking method from class A";
    }
}
class B extends A
{
    public static String meth()
    {
        return "Method is overridden in Extendend class B";
    }
}
