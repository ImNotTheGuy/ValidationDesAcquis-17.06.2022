package TP11;

public class Auteur {


    String nomAuteur;
    boolean primed;

    public Auteur(String nomAuteur, boolean primed) {
        this.nomAuteur = nomAuteur;
        this.primed = primed;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public boolean getPrix () {
        return primed;
    }



}
