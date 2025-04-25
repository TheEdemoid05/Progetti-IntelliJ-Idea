package org.example;
import java.util.ArrayList;


public class Bank {
    private final ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public Bank(){

    }
    //Visto che nella classe BankAccounts ci sono tre costruttori, l'account puoi essere aggiunto
    //seguendo le tre diverse richieste.
    //Per questo torna utile l'overload per addAccount

    public void addAccount(int contoCorrente){
        accounts.add(new BankAccount(contoCorrente));
    }

    public void addAccount(int contoCorrente, double saldo){
        accounts.add(new BankAccount(contoCorrente, saldo));
    }

    public void addAccount(int contoCorrente, double saldo, double tassoInteresse){
        accounts.add(new BankAccount(contoCorrente, saldo, tassoInteresse));
    }

    //metodo per trovare l'account

    public BankAccount trovaAccount(int contoCorrente){
        for(BankAccount account : accounts){
            if(account.getContoCorrente() == contoCorrente){
                return account;
            }
        }
        return null;
    }

    public void deposita(int contoCorrente, double quantita){
        BankAccount accounts = trovaAccount(contoCorrente);
        if(accounts != null){
            accounts.deposita(quantita);
        }
        else{
            System.out.println("Nessun account non trovato");
        }
    }
    public void preleva(int contoCorrente, double quantita){
        BankAccount accounts = trovaAccount(contoCorrente);
        if(accounts != null){
            accounts.preleva(quantita);
        }
        else{
            System.out.println("Nessun accounts non trovato");
        }
    }

    public double getSaldo(int contoCorrente){
        BankAccount accounts = trovaAccount(contoCorrente);
        if(accounts != null){
            return accounts.getSaldo();
        }
        else{
            System.out.println("Nessun account non trovato");
            return 0;
        }
    }


    public void trasferisci(int contoCorrente1, int contoCorrente2, double quantita){
        BankAccount account1 = trovaAccount(contoCorrente1);
        BankAccount account2 = trovaAccount(contoCorrente2);

        if(account1 != null && account2 != null){
            account1.preleva(quantita);
            account2.deposita(quantita);
            System.out.println("Trasferimento completato.");
        } else {
            System.out.println("Uno o entrambi gli account non esistono.");
        }
    }


}



