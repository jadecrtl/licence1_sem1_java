import java.util.Arrays;
import tests.*;

public class Exos {

    /* EXERCICE 1 */
    public static int nbOccs(String lettre, String mot) {
	if (lettre.length() == 1) {
	    int res = 0;
	    for (int i=0; i<mot.length(); i++) {
		if (stringEquals(characterAtPos(mot,i),lettre)) {
		    res++;
		}
	    }
	    return res;
	}
	return -1;
    }

    /* EXERCICE 2 */
    public static boolean jouable(String mot, String lettres) {
        for (int i=0; i<mot.length(); i++) {
	    String position = characterAtPos(mot,i);
	    if (nbOccs(position,mot) > nbOccs(position,lettres)) {
		return false;
	    }
	}
        return true;
    }

    /* EXERCICE 3 */
    public static int score(String mot) {
	int[] array = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
	int res = 0;
	for (int i=0; i<mot.length(); i++) {
	    res += array[placeLettre(characterAtPos(mot,i))];
	}
        return res;
    }

    /* EXERCICE 4 */
    public static String meilleurMot(String[] dictionnaire, String lettres) {
	String meilleurMot = "";
	int n = 0;
	for (int i=0; i<dictionnaire.length; i++) {
	    String mot = dictionnaire[i];
	    int score = score(mot);
	    if (jouable(mot,lettres) && score > n) {
		n = score;
		meilleurMot = dictionnaire[i];
	    }
	}
        return meilleurMot;
    }

    /* EXERCICE 5 */
    public static boolean jouableEfficace(String mot, String lettres) {
        /* À MODIFIER */
        return true;
    }

    // *** Tests ***

    public static void main(String[] args) {

        // ENLEVEZ LES COMMENTAIRES AU FUR ET A MESURE POUR TESTER VOS FONCTIONS

        System.out.println("====Ex1====");

        var test1 = new BiTest<String, String, Integer>();
        test1.add("s", "sxssq", 3);
        test1.add("b", "scrabble", 2);
        test1.add("scrabble", "scrabble", -1);
        test1.run(Exos::nbOccs, "nbOccs");

        System.out.println("====Ex2====");

        var test2 = new BiTest<String, String, Boolean>();
        test2.add("pomme", "memspxo", true);
        test2.add("pomme", "kemspxo", false);
        test2.run(Exos::jouable, "jouable");

        System.out.println("====Ex3====");

        var test3 = new Test<String, Integer>();
        test3.add("scrabble", 14);
        test3.add("dindon", 8);
        test3.add("xylophones", 25);
        test3.run(Exos::score, "score");

        System.out.println("====Ex4====");

        var test4 = new BiTest<String[], String, String>();
        Parser.exo4(test4);
        test4.run(Exos::meilleurMot, "meilleurMot");

        System.out.println("====Ex5====");

        test2.run(Exos::jouableEfficace, "jouableEfficace");
    }

    // *** Fonctions utilitaires ***

    /* Retourne le nombre correspondant à la place de la lettre minuscule [l] dans
       l'alphabet en partant de 0, ou -1 si [l] ne représente pas une lettre minuscule.
    */
    public static int placeLettre(String l) {
        if (l.length() == 1) {
            int cc = l.charAt(0) - 97;
            if (0 <= cc && cc < 26)
                return cc;
        }
        return -1;
    }

    /*
     * Renvoie une chaîne constituée du caractère se trouvant à la position [i] de
     * la chaîne [s]. Si [i] est négatif ou en dehors de la chaîne, renvoie la
     * chaîne vide.
     */
    public static String characterAtPos(String s, int i) {
        String res = "";
        if (i >= 0 && i < s.length()) {
            res = String.valueOf(s.charAt(i));
        }
        return res;
    }

    /*
     * Teste si deux chaînes de caractères [st1] et [st2] ont le même contenu.
     * Renvoie vrai si [st1] et [st2] sont égales.
     */
    public static boolean stringEquals(String st1, String st2) {
        return st1.equals(st2);
    }
}
