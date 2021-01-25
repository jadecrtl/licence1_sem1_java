public class Exo18 {

    public static void printOrdinal (int x) {
	if (x <= 0) {
	    System.out.print("Erreur négatif ou nul non convertible en ordinal.");
	}
	else {
	    String prefixe = intToString(x);
	    String suffixe = "th";
	    int dernier = prefixe.length()-1;
	    int avantDernier = dernier-1;
	    if (characterAtPos(prefixe, dernier).equals("1") && !characterAtPos(prefixe, avantDernier).equals("1")) {
		suffixe = "st";
	    }
	    if (characterAtPos(prefixe, dernier).equals("2") && !characterAtPos(prefixe, avantDernier).equals("1")) {
		suffixe = "nd";
	    }
	    if (characterAtPos(prefixe, dernier).equals("3") && !characterAtPos(prefixe, avantDernier).equals("1")) {
		suffixe = "rd";
	    }
	    System.out.println(prefixe + suffixe);
	}
    }

    public static void main (String[] args) {
	printOrdinal(1);
	printOrdinal(21);
	printOrdinal(11);
	printOrdinal(121);
	printOrdinal(211);
	printOrdinal(12);
	printOrdinal(23);
	printOrdinal(32);
	printOrdinal(44);
    }

    public static String intToString (int x) {
	return String.valueOf (x);
    }

    public static String characterAtPos(String s, int i) {
	String res = "";
	if (i >= 0 && i < s.length()) {
	    res = String.valueOf (s.charAt (i));
	}
	return res;
    }

}
