package ua.epam.javacore.lesson_03_oop;

public class WorkableImpl implements Workable {
    @Override
    public void work() {
        System.out.println("WORK");
    }

    @Override
    public void showSpecialty() {
        System.out.println("SPEC");
    }


}
