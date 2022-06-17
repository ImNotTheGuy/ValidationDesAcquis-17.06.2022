package TP2;

/*
* Écrire un programme Java demande à l’utilisateur de saisir un nombre, et qui ensuite affiche le nombre inverse.
Ex :
Votre nombre : 17
Résultat : 71
Votre nombre : -89
Résultat : -98
Votre nombre : -20
Résultat : -2(Car le zéro devant un nombre n’est pas pris en compte)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double number;

        Scanner input = new Scanner(System.in);

        System.out.printf("Your number (int): ");
        number = input.nextInt();

        boolean isNegative = number<0;

        // convert to absolute value so the - won't be an issue
        String stringToReverse = String.valueOf((int) Math.abs(number));

        String reversedString = "";

        for (int i = 0; i < stringToReverse.length(); i++) {
            reversedString = stringToReverse.charAt(i) + reversedString;
        }

        if (isNegative){
            System.out.println(-Integer.valueOf(reversedString));
        } else {
            System.out.println(Integer.valueOf(reversedString));
        }

    }
}
