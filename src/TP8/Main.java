package TP8;

/*
On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite). Imaginez une
personne debout sur une grille au point 0, 0. Pour chaque direction dans le tableau de chaînes,
déplacez votre personne dans cette direction sur la grille. Retournez le point final X,Y où se trouve la personne sous
la forme d'un tableau de deux entiers.
Exigences
Doit retourner un tableau de deux entiers
Exemple:
maMethode(["haut", "haut", "bas", "gauche", "gauche", "droite", "haut"])

> [-1, 2]

*/

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

            String[] directions = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
            System.out.println(Arrays.toString(finalPosition(directions)));

        }

        public static int[] finalPosition (String[] directions){

            HashMap<String, int[]> hashMapDirection = new HashMap<>();

            hashMapDirection.put("haut", new int[] {0, 1});
            hashMapDirection.put("bas", new int[] {0, -1});
            hashMapDirection.put("droite", new int[] {1,0});
            hashMapDirection.put("gauche", new int[] {-1,0});

            int positionX = 0;
            int positionY = 0;

            for (int i = 0; i < directions.length; i++) {
                positionX += hashMapDirection.get(directions[i])[0];
                positionY += hashMapDirection.get(directions[i])[1];
            }

            int[] positionFinale = {positionX, positionY};

            return positionFinale;
    }


}
