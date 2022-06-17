package TP6;


/*
*Écrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
La méthode devrait nous retourner la valeur correspond au nombre de fois que ce nombre se
trouve dans le tableau et ses différentes positions.
Ex :

maMethode({
  {1, 4, 2, 1},
  {6, 3, 8, 9},
  {1, 5, 1, 0}
},1)
> 1 se retrouve 4 fois dans les emplacements suivants : (0,0),(0,3),(2,0),(2,2)
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] tableauNombre = new int[3][];

        tableauNombre[0] = new int[] {1, 4, 2, 1};
        tableauNombre[1] = new int[] {6, 3, 8, 9};
        tableauNombre[2] = new int[] {1, 5, 1, 0};

        int nombreATrouver = 1;

        String s = occurrenceCounter(tableauNombre, nombreATrouver);
        System.out.println(s);
    }

    public static String occurrenceCounter(int[][] tableauNombre, int nombreATrouver){

        ArrayList<String[]> occurrenceTable = new ArrayList<>();

        String returnString = "";

        for (int i = 0; i < tableauNombre.length; i++) {
            for (int j = 0; j < tableauNombre[i].length; j++) {

                String[] currentCoordinates = new String[] {"" + i, "" + j};
                if (tableauNombre[i][j] == nombreATrouver){
                    occurrenceTable.add(currentCoordinates);
                    returnString += Arrays.toString(currentCoordinates) + " ";
                }
            }
        }

        if (returnString.length() > 0){
            returnString = "Le nombre " + nombreATrouver + " a ete trouve " + occurrenceTable.size() + " fois aux positions: " + returnString;
            return returnString;
        } else {
            return "Le nombre " + nombreATrouver + " n'est pas dans le tableau.";
        }
    }

}
