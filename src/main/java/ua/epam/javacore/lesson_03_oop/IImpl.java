package ua.epam.javacore.lesson_03_oop;

public class IImpl implements IA, IB {

    @Override
    public void test() {
        System.out.println("IIMPL");
    }
}
