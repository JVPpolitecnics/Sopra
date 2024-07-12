package OddAndEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {
        ArrayList<Integer> randomNumbers = initializeNumbers();
        filterEvenAndOddNumbersAndPrintInOrder(randomNumbers);


    }

    public static void filterEvenAndOddNumbersAndPrintInOrder(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            Integer divisionResidue = numbers.get(i) % 2;
            if (divisionResidue == 0) {
                evenNumbers.add(numbers.get(i));
            } else {
                oddNumbers.add(numbers.get(i));
            }
        }
        Collections.sort(evenNumbers, Collections.reverseOrder());
        Collections.sort(oddNumbers, Collections.reverseOrder());
        System.out.println("Even numbers sorted in descending order: " + evenNumbers);
        System.out.println("Odd numbers sorted in descending order: " + oddNumbers);
    }


    public static ArrayList<Integer> initializeNumbers() {
        Random rd = new Random(); // creating Random object
        int amountOfNumbersDesired = 5;
        ArrayList<Integer> randomNumbersArray = new ArrayList<>();
        for (int i = 0; i < amountOfNumbersDesired; i++) {
            randomNumbersArray.add(rd.nextInt(20));

        }
        return randomNumbersArray;
    }
}
