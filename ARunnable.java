// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<=50;i++)
//         {
//             System.out.println("hii");
//         }
//     }
// }

// class B implements Runnable{
//     public void run()
//     {
//         for(int i=0;i<=50;i++)
//         {
//             System.out.println("Shreya");
//         }
//     }
// }

public class ARunnable
{
    public static void main(String[] args){
        // A obj1=new A();
        // B obj2=new B();
        
        Runnable obj1=()->
                {
                    for(int i=0;i<=50;i++)
                        {
                            System.out.println("hii");
                        }
                };


        Runnable obj2=()->
                {
                    for(int i=0;i<=50;i++)
                        {
                            System.out.println("Shreya");
                        }
                };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        
        t2.start();
    
}
}