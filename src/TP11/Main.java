package TP11;



public class Main {

    public static void main(String[] args) {

        Bibliotheque bibliothequeMunicipale = new Bibliotheque("Bibliotheque municipale");

        Exemplaire valentinExemplaire = new Exemplaire("Valentin", false, "EXEMPLAIRE", "BORDELAIS");

        bibliothequeMunicipale.stocker(valentinExemplaire);

        bibliothequeMunicipale.afficherAuteur(valentinExemplaire);
        bibliothequeMunicipale.afficherAuteur(valentinExemplaire, true);

        System.out.println((bibliothequeMunicipale.getNbExemplaires()));


        Exemplaire marionExemplaire = new Exemplaire("Marion", true, "Perez life ", "TOULSAING");
        bibliothequeMunicipale.stocker(marionExemplaire, 2);

        bibliothequeMunicipale.listerExemplaires();

        bibliothequeMunicipale.afficherAuteur(marionExemplaire, true);


    }
}
