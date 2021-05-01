
package $04_AccessModifiers.p1;


public class B {
    public static void main(String[] args) {
        A aobject = new A();
//        System.out.println(aobject.a); not possible beacuse 'a' is private
            System.out.println(aobject.b);//default
            System.out.println(aobject.c);//protected
            System.out.println(aobject.d);//public
            
    }
}
