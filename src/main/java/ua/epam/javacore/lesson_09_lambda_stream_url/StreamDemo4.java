package ua.epam.javacore.lesson_09_lambda_stream_url;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
// A list of double values.
        ArrayList<Double> myList = new ArrayList<>( );
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
// Map the square root of the elements in myList to a new stream.
        double productOfSqrRoots;
        Stream<Double> sqrtRootStrm = myList.stream().map(Math::sqrt);
            // Find the product of the square roots.
            productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Product of square roots is " + productOfSqrRoots);
    }
}