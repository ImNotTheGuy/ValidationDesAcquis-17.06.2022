package TP7;

/*Écrire une méthode Java qui prend en paramètre un tableau de caractères.
Et qui va ensuite retourner un nouveau tableau avec une alternance entre les lettres en Maj et Min.
Ex :
maMethode(['a', 'b', 'c', 'd', 'e'])
> ['a', 'B', 'c', 'D', 'e']
*/

public class Main {
    public static void main(String[] args) {

        String ourString = "This is a string";
        char[] charArray = ourString.toCharArray();

        char[] s = minMaj(charArray);
        System.out.println(s);

    }

    public static char[] minMaj(char[] table){


        for (int i = 0; i < table.length; i++) {
            if (i%2==0){
                table[i] = String.valueOf(table[i]).toUpperCase().charAt(0);
            } else {
                table[i] = String.valueOf(table[i]).toLowerCase().charAt(0);
            }
        }
        return table;
    }
}
