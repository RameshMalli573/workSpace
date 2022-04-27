import java.util.stream.Stream;

interface FuncInterface 

{ 

    void abstractFun(int x); 
 
    default void normalFun() 

    { 

       System.out.println("Hello"); 

    } 

} 

public class HashMapDemo {


	 
    public static void main(String args[]) 

    { 

        Stream.of(0,1,2,3,4,5,6,7,8)

        .skip(6)

        .forEach(num->System.out.print("\n"+num));

    }

}

