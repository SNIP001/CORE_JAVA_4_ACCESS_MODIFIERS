
package $04_AccessModifiers.p1;

public class A {
    private int a =20;
                int b = 30;
    protected int c = 40;
    public int d = 50;
    public static void main(String[] args) {
        A aObject = new A();
        System.out.println(aObject.a); // private
        System.out.println(aObject.b); //default
        System.out.println(aObject.c); //protected
        System.out.println(aObject.d); //public
        
    }
            
}
