package ua.epam.javacore.lesson_09_lambda_stream_url;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original list: " + myList);
        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("Minimum value: " +
                integer));

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        maxVal.ifPresent(integer -> System.out.println("Maximum value: " +
                integer));

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals =
                myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
