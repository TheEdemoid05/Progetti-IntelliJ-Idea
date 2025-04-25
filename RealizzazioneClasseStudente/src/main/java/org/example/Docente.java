package org.example;

public class Docente extends Persona {
    private String materia;
    private String salario;

    public Docente(String codFiscale, String nome, String cognome, String userID, String password, String materia, String salario) {
        super(codFiscale, nome, cognome, userID, password);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }


    @Override
    public String toString(){
        return super.toString() + "\nmateria: " + materia + "\nsalario: " + salario;


    }
}
