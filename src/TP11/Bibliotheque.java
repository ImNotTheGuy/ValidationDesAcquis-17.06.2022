package TP11;

import java.util.ArrayList;
import java.util.Arrays;

public class Bibliotheque {

    private String nom;
    private static ArrayList<Exemplaire> exemplairesArrayList = new ArrayList<>();

    public Bibliotheque(String nom) {
        this.nom = nom;
    }


    public void stocker(Exemplaire exemplaire1) {
        System.out.println("Ajout d'un exemplaire.");
        exemplairesArrayList.add(exemplaire1);
        System.out.println(exemplaire1.titre + exemplaire1.getNomAuteur() + exemplaire1.langue);
    }

    public void stocker(Exemplaire exemplaire1, int nbAjouts) {

        for (int i = 0; i < nbAjouts; i++) {
            // rappel de la fonction stocker par defaut autant de fois qu'il y a d'exemplaires ajouter.
            stocker(exemplaire1);
        }
    }

    public void listerExemplaires() {
        for (int i = 0; i < exemplairesArrayList.size(); i++) {

            String titre = (exemplairesArrayList.get(i).getTitre());
            String nomAuteur = (exemplairesArrayList.get(i).getNomAuteur());
            String langue = (exemplairesArrayList.get(i).getLangue());

            System.out.println("titre: " + titre + "nom auteur: " + nomAuteur + "langue: " + langue);
        }
    }

    public int getNbExemplaires(){
        return exemplairesArrayList.size();
    }

    public static int compterExemplaire(Exemplaire exemplaire1){
        int countExemplaires = 0;
        for (int i = 0; i < exemplairesArrayList.size(); i++) {
            if (exemplairesArrayList.get(i).equals(exemplaire1)){
                countExemplaires++;
            }
        }
        return countExemplaires;
    }

    public void afficherAuteur(Exemplaire exemplaire1){
        String listeAuteur = "";

        for (int i = 0; i < exemplairesArrayList.size(); i++) {
            if (exemplairesArrayList.get(i).equals(exemplaire1)){
                listeAuteur += " " + exemplairesArrayList.get(i).getNomAuteur();
            }
        }
        System.out.println(listeAuteur);

    }

    public void afficherAuteur(Exemplaire exemplaire1, boolean aPrix){

        String listeAuteur = "";
        if (aPrix){
            for (int i = 0; i < exemplairesArrayList.size(); i++) {
                var currentExemplaires = exemplairesArrayList.get(i);
                if (currentExemplaires.equals(exemplaire1) && currentExemplaires.getPrix()){
                    listeAuteur += " " + currentExemplaires.getNomAuteur();
                }
            }
            System.out.println(listeAuteur);
        } else {
            afficherAuteur(exemplaire1);
        }
    }


    public String getNom() {
        return this.nom;
    }
}
