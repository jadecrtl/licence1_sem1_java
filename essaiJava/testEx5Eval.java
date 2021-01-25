public class testEx5Eval {

    //Corrigé du sujet
    public static String miroir (String s) {
	String res = "";
	for (int i=0; i<s.length(); i++) {
	    res = characterAtPos(s,i) + res;
	}
	return res;
    }

    //Ma fontion (qui est fausse)
    public static String miroirJade (String st) {
	for (int i=0; i<st.length(); i++) {
	    String s1 = characterAtPos(st, i);
	    String s2 = characterAtPos(st, st.length()-i);
	    if (!s1.equals(s2)) {
		String retenue = "";
		s2 = retenue;
		s1 = s2;
		retenue = s1;
	    }
	}
	return st;
    }

    
    public static void main (String[] args) {
	String s = "abracadabra";
	System.out.println(miroir(s)); //doit retourner arbadacarba
    }


    //Fonction utilitaire
    public static String characterAtPos (String s, int i) {
	String res = "";
	if (i >= 0 && i < s.length()) {
	    res = String.valueOf(s.charAt(i));
	}
	return res;
    }
}
