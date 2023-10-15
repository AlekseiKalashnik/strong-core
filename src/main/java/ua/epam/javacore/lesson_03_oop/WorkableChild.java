package ua.epam.javacore.lesson_03_oop;

public interface WorkableChild extends Workable {

    default void childMethod(){
        System.out.println("CHILD METHOD");
    }

    @Override
    default void count() {
        System.out.println("count child ...");
    }
}
