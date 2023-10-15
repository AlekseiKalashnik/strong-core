package ua.epam.javacore.lesson_05_collections;

import java.util.Comparator;

public class DeveloperByCountryComparator implements Comparator<Developer> {

    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.country.compareTo(o2.country);
    }
}
