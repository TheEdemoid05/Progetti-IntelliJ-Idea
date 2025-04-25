package org.example;

public class EsameSostenuto {

    private String nomeEsame;
    private int voto;
    public EsameSostenuto(String nomeEsame, int voto) {
        this.nomeEsame = nomeEsame;
        this.voto = voto;
    }

    public int getVoto() {
        return voto;
    }
    public String getNomeEsame() {
        return nomeEsame;
    }

    public void setNomeEsame(String nomeEsame) {
        this.nomeEsame = nomeEsame;
    }
    public void setVoto(int voto) {
        this.voto = voto;
    }



}
