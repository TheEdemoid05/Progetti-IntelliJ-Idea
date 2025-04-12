package model;

public class Studente extends model.Utente{
    public int matricola;

    //costruttore
    public Studente(String l, String p, int m){
        super(l, p);
        matricola = m;
    }

    //metodo per iscriversi al corso
    public void iscriviCorso(String c){
        //perche e' vuoto???
    }
    public void stampa(String titolo){
        System.out.println(titolo + " " + login);
        System.out.println("Matricola " + matricola);

    }
    public String toString(){
        return "Model.Model.Model.Studente" +login +" "+password +" "+matricola;

    }

}
