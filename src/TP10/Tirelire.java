package TP10;

public class Tirelire {


    private double solde;

    public Tirelire(double montant) {
        this.solde = montant;
    }

    public double getSolde() {
        return solde;
    }

    public String afficher() {
        if (this.solde >0){
            return String.format("%.2f EUR dans votre tirelire", this.solde);
        }
        return "Vous etes sans le sou.";
    }

    public void secouer() {
        if (this.solde > 0){
            System.out.println("Bling bling bliing peté de tune frere");
        }
    }

    public void remplir(double montant) {
        if (montant<0){
            montant = 0;
            System.out.println("Montant doit etre positif, tirelire non affectee");
        }
        this.solde += montant;
    }

    public void vider() {
        if (this.solde == 0){
            System.out.println("tu peux rien vider t'as deja plus rien");
        }
        this.solde = 0;
    }

    public void puiser(double montant) {

        if (montant <= this.solde && montant > 0){
            this.solde -= montant;
        } else if (montant > this.solde){
            this.solde = 0;
            System.out.println("Tu voulais demander plus que ce que t'avais, donc t'as plus rien et t'as pas eu plus.");
        } else {
            System.out.println("Mets un nombre positif a retirer (pas d'impact sur le solde).");
        }
    }

    public double calculerSolde(double montant) {
        if (montant<0){
            return this.solde;
        }
        if (montant > this.solde){
            System.out.println("pas assez d'argent, prefere la Creuse a Monaco. Tu es hors budget de : " + (this.solde-montant));
        }
        return this.solde - montant;
    }

}
