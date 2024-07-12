package ClassifyPeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


class Main {
    public static void main(String[] args) {
        List<Person> people = initializePeople(50);

        // Correctly collect the filtered results into lists
        List<Person> overAge = people.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());
        List<Person> underAge = people.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());
        List<Person> womenUnderAge = underAge.stream().filter(p -> p.isFemale() == true).collect(Collectors.toList());
        List<Person> menOverAge = overAge.stream().filter(p -> p.isFemale() == false).collect(Collectors.toList());
        List<Person> women = people.stream().filter(p -> p.isFemale() == true).collect(Collectors.toList());
        // Print the count of people over and under age 18
        System.out.println("Number of people over age 18: " + overAge.size());
        System.out.println("Number of people under age 18: " + underAge.size());
        System.out.println("Number of women under age 18: " + womenUnderAge.size());
        System.out.println("Number of men over age 18: " + menOverAge.size());

        if (underAge.size() > 0) {
            double proportion = (double) overAge.size() / 50;
            double percentage = proportion * 100;
            System.out.println("Percentage of people over age 18 compared to under age 18: "+ percentage);
        } else {
            System.out.println("No people under age 18 to compare.");
        }

        if (women.size() > 0) {
            double proportion = (double) women.size() / 50;
            double percentage = proportion * 100;
            System.out.println("Percentage of women: "+ percentage);
        } else {
            System.out.println("No people under age 18 to compare.");
        }
    }

    public static List<Person> initializePeople(int count) {
        List<Person> people = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int age = random.nextInt(106); // Generates a random age between 0 and 105 (inclusive)
            boolean isFemale = random.nextBoolean(); // Generates a random boolean value
            people.add(new Person(age, isFemale));
        }

        return people;
    }
}
