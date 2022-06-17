package TP11;

public class Oeuvre extends Auteur {

    public Oeuvre(String nomAuteur, boolean primed, String titre, String langue) {
        super(nomAuteur, primed);
        this.titre = titre;
        this.langue = langue;
    }

    String titre;
    String langue;

    public String getTitre() {
        return titre;
    }


    public String getLangue() {
        return langue;
    }

}
