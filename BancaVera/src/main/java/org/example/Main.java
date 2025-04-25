package org.example;
import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bank bank = new Bank();
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Qual e' il saldo attuale");
            double saldo = sc.nextDouble();

            System.out.println("Qual e' il tasso attuale");
            double tassoInteresse = sc.nextDouble();

            System.out.println("Qual e' il conto corrente");
            int contoCorrente = sc.nextInt();
            BankAccount bankAccount = new BankAccount(contoCorrente, saldo, tassoInteresse);
            bank.addAccount(contoCorrente, saldo, tassoInteresse);
        }

    }
}