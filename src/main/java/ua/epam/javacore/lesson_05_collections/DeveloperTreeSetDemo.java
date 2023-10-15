package ua.epam.javacore.lesson_05_collections;

import java.util.TreeSet;

public class DeveloperTreeSetDemo {
    public static void main(String[] args) {
        Developer developer1 = new Developer(1L, "Vasya", "Ukraine");
        Developer developer2 = new Developer(2L, "Kesha", "Ukraine");
        Developer developer3 = new Developer(3L, "Vasya", "Belarus");

        TreeSet<Developer> developers = new TreeSet<Developer>(new DeveloperByCountryComparator());
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer1);

        System.out.println(developers);
    }
}
