package org.example;

public class Persona {
    private String codFiscale;
    private String nome;
    private String cognome;
    private String userID;
    private String password;

    public Persona(String codFiscale, String nome, String cognome, String userID, String password) throws IllegalArgumentException {
        this.codFiscale = codFiscale;
        this.nome = nome;
        this.cognome = cognome;

        if (userID.toLowerCase().equals(userID)) {
                throw new IllegalArgumentException("Formato dell'userID non valido");
        }
        this.userID = userID;
        if (password.toLowerCase().equals(password)) {
                throw new IllegalArgumentException("Formato della password non valido");
        }
        this.password = password;
    }


    public String getCodFiscale() {
        return codFiscale;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }

    public void setCodFiscale(String codFiscale){
        this.codFiscale = codFiscale;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    @Override
    public String toString(){
        return "CodFiscale: " + codFiscale
                + "\nNome: " + nome
                + "\nCognome: " + cognome
                + "\nUserID: " + userID
                + "\nPassword: " + password;
    }

}
