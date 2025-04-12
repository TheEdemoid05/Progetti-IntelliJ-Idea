package model;

public class Utente {
    protected String login;
    protected String password;

    //costruttore
    public Utente(String l, String p) {
        this.login = l;
        this.password = p;
    }
    protected Boolean String signIn(String l, String p) {
        if (l.equals(this.login) && p.equals(this.password)) {
            System.out.println("Accesso verificato" + l + " " +p );
            return true;
        }
        else {
            System.out.println("Accesso non verificato");
            return false;

        }
    }
    public void stampa(){
        System.out.println("Sono l'utente " +this.login +" " +this.password);
    }
}
