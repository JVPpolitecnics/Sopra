package Tarif;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int workerTarif = loadTarif();
        int workedHours = loadWorkedHours();
        Double payment;
        int regularHours = 40;
        if (workedHours > regularHours) {
            double extraPrice = (workerTarif * 1.50);
            double overTime = workedHours - regularHours;
            payment = (regularHours * workerTarif) + (overTime * extraPrice);
        } else  {
            payment = (double) (workedHours *  workerTarif);
        }
        System.out.println("The worker is due: " + payment + " as he/she carried out "+ workedHours+" hours of work");
    }

    public static Integer loadTarif() {
        Random rand = new Random();
        int tarif = rand.nextInt(20);
        return tarif;
    }

    public static Integer loadWorkedHours() {
        Random rand = new Random();
        int workedHours = rand.nextInt(60);
        return workedHours;
    }

}
