package ua.epam.javacore.lesson_03_oop;

public interface IB {
    default void test(){
        System.out.println("IB");
    }
}
