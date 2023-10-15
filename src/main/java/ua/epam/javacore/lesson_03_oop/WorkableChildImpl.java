package ua.epam.javacore.lesson_03_oop;

public class WorkableChildImpl implements WorkableChild {
    @Override
    public void work() {
        System.out.println("WorkableChildImpl working");
    }

    @Override
    public void showSpecialty() {
        System.out.println(" WorkableChildImpl specialty");
    }
}
