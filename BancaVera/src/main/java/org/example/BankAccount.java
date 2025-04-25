package org.example;

public class BankAccount {
    private double saldo;
    private double tassoInteresse;
    private final int contoCorrente;


    //Costruttori della classe
    public BankAccount(int contoCorrente){
        this.contoCorrente = contoCorrente;
        this.saldo = 0;
        this.tassoInteresse = 0.5;
    }

    public BankAccount(int contoCorrente, double saldo){
        this.contoCorrente = contoCorrente;
        this.saldo = saldo;
        this.tassoInteresse = 0.5;
    }

    public BankAccount(int contoCorrente, double saldo, double tassoInteresse) {
        this.contoCorrente = contoCorrente;
        this.saldo = saldo;
        this.tassoInteresse = tassoInteresse;

    }

    //setter per le tasse
    public void setTassoInteresse(double tassoInteresseNuovo) {
        if(tassoInteresseNuovo != tassoInteresse){
            this.tassoInteresse = tassoInteresseNuovo;
            System.out.println("Tasso interesse:  \n" + this.tassoInteresse);
        }
        else {
            System.out.println("Tasso non cambiato");
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo Aggiornato");
    }

    //metodo per depositare una certa quantita
    public void deposita(double quantita){
        if(quantita < 0){
            System.out.println("La quantita che vuoi depositare e' negativa");
        }
        else{
            this.saldo += quantita;
            System.out.println("Attualmente il conto ha " + this.saldo + "disponbili");
        }
    }

    //metodo per prelevare una certa quantita
    public void preleva(double quantita){
        if(quantita < 0){
            System.out.println("Non stai prelevando niente");
        }
        else{
            this.saldo -= quantita;
            System.out.println("Attualmente il conto ha " + this.saldo + "disponbili");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getContoCorrente() {
        return contoCorrente;
    }

    @Override
    public String toString() {
        return "Conto #" + contoCorrente + " | Saldo: " + saldo + " | Tasso: " + tassoInteresse + "%";
    }


}
