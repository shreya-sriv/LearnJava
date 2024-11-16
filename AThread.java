class A extends Thread{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("hii");
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("hello");
        }
    }
}


public class AThread {
    public static void main(String[] args)  {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        
        obj2.start();
    }
    
}
