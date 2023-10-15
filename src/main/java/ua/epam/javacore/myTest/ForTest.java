package ua.epam.javacore.myTest;

import java.util.stream.DoubleStream;

public class ForTest {
    public static void main(String[] args) {
        DoubleStream.of(3.0, 5444444.7, 4.44, 1000000.5555, 5436.4543, 000555.5)
                .filter(x->x>10)
                .map(x->x/2)
                .limit(4)
                .forEach(System.out::println);
        }
}