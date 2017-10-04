package cw08.mem_test;

public class A {
    B b;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.b = b;
        b.a = a;

        a = null;
        b = null;

    }
}
