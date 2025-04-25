package org.example;
import java.util.ArrayList;

public class Studente extends Persona{

    //Definizione degli attributi
    private String matricola;
    private String universita;
    private ArrayList<EsameSostenuto> esameSostenuti = new ArrayList<>();

    // creazione del costruttore per Studente e richiamo del costruttore della super classe
    public Studente(String codFiscale, String nome, String cognome, String userID, String password, String matricola, String universita) throws IllegalArgumentException {

        super(codFiscale, nome, cognome, userID, password);
        this.universita = universita;

        //Lancio di un eccezione nel caso in cui la matricola non e' corretta
        if (matricola == null){
            throw new IllegalArgumentException("matricola non valida");
        }
        this.matricola = matricola;
    }

    //metodo per l'aggiunta di un esame all'arraylist con lancio di un eccezione
    public void addExam(String nomeEsame, int voto) throws IllegalArgumentException {
        if (voto < 18 || voto > 31){
            throw new IllegalArgumentException("voto non valido");
        }
        EsameSostenuto nuovoEsame = new EsameSostenuto(nomeEsame, voto);
        esameSostenuti.add(nuovoEsame);
    }

    public int getNumberOfExam(){
        return esameSostenuti.size();
    }

    public double getAverageGrade(){
        double total = 0;
        for(EsameSostenuto so : esameSostenuti){
            total += so.getVoto();
        }
        total /= esameSostenuti.size();
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "\nmatricola: " + matricola + "\nuniversita: " + universita;
    }

}
