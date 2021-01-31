public class ExosAvecSubString {
    /* EXERCICE 1 */
    public static Boolean mobileFrancaisMetropolitain(String numero) {
	String chiffre;
	if (numero.length() == 14) {
	    //numero au format national
	    chiffre = characterAtPos(numero,1);
	    if (stringEquals(chiffre,"6") || stringEquals(chiffre,"7")) {
	    	return true;
	    }
	    else {
		return false;
	    }
	}
	else {
	    //numero au format international
	    chiffre = characterAtPos(numero,4);
	    if (stringEquals(chiffre,"6") || stringEquals(chiffre,"7")) {
		return true;
	    }
	    else {
		return false;
	    }
	}
    }
          /*
	    if (stringEquals(numero.substring(0,5),"+33 6") || stringEquals(numero.substring(0,5),"+33 7")) {
		return true;
	    }
	    else {
		return false;
	    }
	  */
	
     public static int prefixeInternational(String numInter) {
	 // si la chaîne est vide alors on sort tout de suite
	 if (numInter.length() == 0) {
	 	return 0;
	 }
	 String prefixe = "";
	 for (int i = 1; i < numInter.length(); i++) {
	    if (!stringEquals(characterAtPos(numInter, i)," ")) {
		prefixe = prefixe + characterAtPos(numInter, i);
	     }
	    else {
		return stringToInt(prefixe);
	    }
	 }
	 return 0;
     }
      // *** Tests ***

    public static void main(String[] args) {

        // ENLEVEZ LES COMMENTAIRES AU FUR ET A MESURE POUR TESTER VOS FONCTIONS

        System.out.println("====Ex1====");
         testBoolean("mobileFrancaisMetropolitain(\"06 44 56 99 02\")", mobileFrancaisMetropolitain("06 44 56 99 02"),
	       true);
	 testBoolean("mobileFrancaisMetropolitain(\"07 44 56 99 02\")", mobileFrancaisMetropolitain("07 44 56 99 02"),
                 true);
         testBoolean("mobileFrancaisMetropolitain(\"01 44 56 99 02\")", mobileFrancaisMetropolitain("01 44 56 99 02"),
                 false);
         testBoolean("mobileFrancaisMetropolitain(\"+33 6 44 56 99 02\")",
                 mobileFrancaisMetropolitain("+33 6 44 56 99 02"), true);
         testBoolean("mobileFrancaisMetropolitain(\"+33 7 44 56 99 02\")",
                 mobileFrancaisMetropolitain("+33 7 44 56 99 02"), true);
         testBoolean("mobileFrancaisMetropolitain(\"+33 1 44 56 99 02\")",
                 mobileFrancaisMetropolitain("+33 1 44 56 99 02"), false);
	
        System.out.println("====Ex2====");
         testInt("prefixeInternational(\"+33 6 44 56 99 02\")", prefixeInternational("+33 6 44 56 99 02"), 33);
         testInt("prefixeInternational(\"+389 1 234 4567\")", prefixeInternational("+389 1 234 4567"), 389);
	 
    }

    /*************************************************************/
    /* NE PAS MODIFIER */
    /*************************************************************/
    public static void testInt(String cmd, int exp, int val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    public static void testBoolean(String cmd, boolean exp, boolean val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    // *** Fonctions utilitaires vues en cours ***

    /*
     * Transforme un entier [x] en une chaîne de caractères. Renvoie la chaîne de
     * caractères représentant la valeur de [x].
     */
    public static String intToString(int x) {
        return String.valueOf(x);
    }

    /*
     * Transforme une chaîne de caractères [st] en un entier [x]. Renvoie l'entier
     * [x] représenté par le chaîne [st] (en notation décimale).
     */
    public static int stringToInt(String st) {
        return Integer.parseInt(st);
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
