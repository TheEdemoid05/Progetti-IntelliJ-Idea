package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Overloading dei costruttori
        Studente s1 = new Studente();
        Studente s2 = new Studente("Mario");
        Studente s3 = new Studente("Dion", 343);

        s1.stampa();
        s2.stampa();
        s3.stampa();

    }
}