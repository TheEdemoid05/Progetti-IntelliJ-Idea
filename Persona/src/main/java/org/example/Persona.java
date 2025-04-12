package org.example;

public class Persona {
    String nome;
    int eta;

    //Costrutture
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    public void saluta(){
        System.out.println("Ciao, sono "+nome + " e  ho"+eta);
    }
}
