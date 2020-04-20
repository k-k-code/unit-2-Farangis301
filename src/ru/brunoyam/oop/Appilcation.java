package ru.brunoyam.oop;

import ru.brunoyam.oop.models.Passenger;
import ru.brunoyam.oop.models.transport.Plane;

/**
 * Главный класс нашего приложения.
 */
public class Appilcation {

    public Appilcation() {
    }
    /**
     * Главный класс приложения
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {

        System.out.println("Empty passenger creation");
        Passenger emptyPassenger = new Passenger();
        System.out.println("Empty passenger creation");
        Passenger passenger = new Passenger("12345678");
        Passenger fullPassenger = new Passenger(name: "Ivan",surname:"Ivanov", docNumber   )


        System.out.println("Hello farangis");

    }
    private short void Transport(){
        Plane plane = new Plane();



    }

}
