class Demo
{
    private int age;
    private String name;

public void setAge(int a)
{
    age=a;
} 
public void setName(String n)
{
    name=n;
}
public int getAge()
{
    return age;
}
public String getName()
{
    return name;
}
}


public class Encaps {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.setAge(21);
        obj.setName("Shreya");
        System.out.println(obj.getName()+" "+":"+" "+ obj.getAge());

    }
}
