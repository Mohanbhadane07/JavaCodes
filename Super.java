class A {
    public A() {
        System.out.println("in A");
    }

    public A(int A) {
        System.out.println("in A int");
    }

}
class B extends A
{
    public B() 
    {
        super();
        System.out.println("in B");

    }

    public B (int B)
    {
        super();
        System.out.println("in B int");
    }
}

public class Super
{
    public static void main(String[] args) 
    {
        B obj = new B();
        A obj1 = new A(2);

        
    
    }
}
