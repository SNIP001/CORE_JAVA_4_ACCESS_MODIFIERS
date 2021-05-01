package $04_AccessModifiers.p2;

import $04_AccessModifiers.p1.A;
public class C extends A {

    public static void main(String[] args) {
        A aObject = new A();
        System.out.println(aObject.d); //public

        C cObject = new C();
        System.out.println(cObject.c); //protecctd
        System.out.println(cObject.d);//public

    }
}
