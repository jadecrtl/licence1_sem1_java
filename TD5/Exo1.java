public class Exo1 {

    public static String[] funcAB (int a) {
	String[] t = new String [a];
	String s = "ab";
	for (int i=0; i < a; i++) {
	    t[i] = s + "\n";
	    s = s + "ab";
	}
	return t;
    }    
    
    public static void printIntArray (String[] t) {
	for (int i=0; i<t.length; i++) {
	    System.out.print(t[i] + " ");
	}
	System.out.print("\n");
    }
    
    public static void main (String[] args) {
	printIntArray(funcAB(5));
    }
}
