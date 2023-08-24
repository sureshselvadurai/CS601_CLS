package dataStructures;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("China");
        countries.add("Italy");

        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + " ");
        }

        for (String country: countries) {
            System.out.println(country);
        }
    }
}
