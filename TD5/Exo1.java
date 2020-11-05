public class Exo1 {

    public static String[] funcAB (int a) {
	String[] t = new String [a];
	String s = "ab";
	for (int i=0; i < a; i++) {
	    t[i] = s;
	    s = s + "ab";
	}
	return t;
    }

    public static void main (String[] args) {
	System.out.println(funcAB(5));
    }
}
