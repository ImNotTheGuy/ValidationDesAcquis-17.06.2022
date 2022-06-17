package TP9;

/*Recherche de caractères identiques dans une rangée
On vous donne une chaîne de caractères d'un seul mot comme argument. Vous retournerez true
si elle contient deux caractères identiques dans une rangée,c’est-à-dire qui se suivent, sinon elle retournera false.
Exigences
Doit retourner true ou false
Doit également fonctionner avec les caractères spéciaux
Exemple n° 1
maMethode("terrific")
> true
Exemple n°2
maMethode("chats")
> false
Exemple n°3
maMethode("chats !!")
> true
*/

public class Main {
    public static void main(String[] args) {

        System.out.println(hasDoubles("terrific"));
        System.out.println(hasDoubles("chats"));
        System.out.println(hasDoubles("chats !!"));

    }

    public static boolean hasDoubles(String str) {

        char letter;
        boolean result = false;
        for (int i = 1; i < str.length(); i++) {
            letter = str.charAt(i);
            if (letter == str.charAt(i - 1)) {
                result = true;
            }
        }
        return result;
    }

}
