class A{
    public void show()
    {
        System.out.println("in A");
    }
}
// class B extends A{
//     public void show()
//     {
//         System.out.println("in B");
//     }
// }
public class AnnonymousInner
{
    public static void main(String[] args) {
        // A obj=new B();

        A obj=new A(){
            // annonymous inner function example
            public void show()
            {
                System.out.println("in B");
                }
            };
        obj.show();
    }
}