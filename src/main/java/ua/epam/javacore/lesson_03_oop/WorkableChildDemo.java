package ua.epam.javacore.lesson_03_oop;

public class WorkableChildDemo {
    public static void main(String[] args) {
        WorkableChild workableChild = new WorkableChildImpl();

        System.out.println(WorkableChild.i);
        workableChild.showSpecialty();
        workableChild.count();
    }
}
