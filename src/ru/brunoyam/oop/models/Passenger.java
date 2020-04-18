package ru.brunoyam.oop.models;

/**
 * Класс моделирующий объект реального мира - пассажира.
 * Пассажир представлен именем, фамилией, отчеством и номером документа удостоверяющего личность.
 */
public class Passenger {

    /**
     * Имя пассажира
     */
    String name;
    /**
     * Фамили пассажира
     */
    String surname;
    /**
     * Отчество пассажира
     */
    String secondName;
    /**
     * Номер документа, удостоверяющего личность
     */
    String docNumber;

    /**
     * Конструктор, заполняющий единственно поле.
     */
    public Passenger(){
        System.out.println("constructor 1");
    }

    public Passenger(String name, String surname, String secondName, String docNumber) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.docNumber = docNumber;
    }

    public Passenger(String docNumberArg) {
        docNumber = docNumberArg;
        System.out.println("constructor 2");
    }



    public Passenger() {

    }

    /**
     * Возвращает полное имя как склеенные имя, фамилию и отчество, разделенне пробелом.
     * @return полное имя
     */
    public String getFullName() {
        String fullName = name + " " + surname + " " + secondName;
        return fullName;
    }

    /**
     * Возвращает полное имя как склеенные имя, фамилию и отчество, разделеные пробелом и предваряемые префиксом.
     * @param prefix обращение к пассажирц, подставляемое перед именем.
     * @return полное имя с префиксом.
     */
    public String getFullName(String prefix) {
        String fullName = prefix + " " + getFullName();
        return fullName;
    }

}
