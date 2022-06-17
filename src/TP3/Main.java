package TP3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/*
*
* Ecrire un programme Java demande à l’utilisateur de saisir 2 chaines de caractères et qui
* ensuite renseigne si ce sont des anagrammes.
Qu'est-ce qu'une anagramme ?
Une anagramme est un mot ou un groupe de mots obtenu en changeant
* de place les lettres d'un autre mot ou groupe de mots.
Par exemple, "GARE" est une anagramme de "RAGE", ou "GARE MAMAN"
* est une anagramme de "ANAGRAMME".
*/


public class Main {
    public static void main(String[] args) {

        String str1;
        String str2;
        Scanner input = new Scanner(System.in);

        System.out.print("First word: ");
        str1 = input.nextLine().toUpperCase().replaceAll(" ", "");

        System.out.print("Second word: ");
        str2 = input.nextLine().toUpperCase().replaceAll(" ", "");

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {
                char lettre = str1.charAt(i);
                if (hashMap1.containsKey(lettre)) {
                    hashMap1.put(lettre, hashMap1.get(lettre) + 1);
                } else {
                    hashMap1.put(lettre, 1);
                }
            }

            for (int i = 0; i < str2.length(); i++) {
                char lettre = str2.charAt(i);
                if (hashMap2.containsKey(lettre)) {
                    hashMap2.put(lettre, hashMap2.get(lettre) + 1);
                } else {
                    hashMap2.put(lettre, 1);
                }
            }
            if (hashMap1.toString().equals(hashMap2.toString())){
                System.out.println("Yes, an angramm !");
            } else {
                System.out.println("Not an anagramm.");
            }
        } else {
            System.out.println("Not an anagram.");
        }






    }
}
