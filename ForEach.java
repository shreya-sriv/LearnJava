import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,5,2,7,1,8);
        // Consumer<Integer> con= new Consumer<Integer>()
        // {
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);
        //     }
        // };


        // nums.forEach(con);



        // Consumer<Integer> con= (n)->System.out.println(n);
            
        


        nums.forEach(n->System.out.println(n));
    }
    }

