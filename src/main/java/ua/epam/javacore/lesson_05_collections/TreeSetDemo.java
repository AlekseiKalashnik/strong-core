package ua.epam.javacore.lesson_05_collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
// Create a tree set.
        TreeSet<String> ts = new TreeSet<String>();
// Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        System.out.println(ts.add("A"));
        System.out.println(ts);
    }
}