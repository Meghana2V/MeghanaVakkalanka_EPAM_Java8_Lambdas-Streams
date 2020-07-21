package epamm;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class A {
    public static void main(String args[])
    {
        IntStream stream=IntStream.of(1,2,3,4,5,6);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println(obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}