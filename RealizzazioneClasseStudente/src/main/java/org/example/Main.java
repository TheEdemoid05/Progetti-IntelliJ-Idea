package org.example;
import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> persone = new ArrayList<>();

        Studente studente = null;
        Docente docente = null;


        try{
            studente = new Studente("1234", "Gennaro", "Bullo", "Fuwallos", "SignorNibiru", "n86005193", "Pessima");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Tutto nella norma");
        }

        try{
            docente = new Docente("4567", "io", "oi", "Palle", "Aluber", "Sostanziosa", "36,78");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Tutto nella norma");
        }
       persone.add(studente);
        persone.add(docente);

        for(Persona persona : persone){
            System.out.println(persona);
        }

        studente.addExam("PalleMassime", 29);
        studente.addExam("Elden Ring", 24);
        studente.addExam("Fortnite", 26);

        double media = studente.getAverageGrade();
        System.out.println(media);

    }
}