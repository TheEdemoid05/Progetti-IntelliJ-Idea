package org.example;

public class Studente {
    String nome;
    int matricola;

    // primo costruttore
    public Studente(){
        this.nome = "sconosciuto";
        this.matricola = -1;
        System.out.println("il primo costruttore è vuoto");
    }
     // secondo costruttore
    public Studente(String nome){
        this.nome = nome;
        this.matricola = -1;
        System.out.println("In questo costruttore c'e solo il nome ");

    }

    //terzo costruttore
    public Studente(String nome, int matricola){
        this.nome = nome;
        this.matricola = matricola;
        System.out.println("In questo costruttore c'e tutto");
    }

    public void stampa(){
        System.out.printf("Il nome e %s ", nome,"e la matricola e %d", matricola);
    }
}
