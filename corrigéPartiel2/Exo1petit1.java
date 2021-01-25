public class Exo1petit1 {
    public static int g(int x) {
	int res = 2;
	int y = 1;
	while (y<=x && y%4!=0) {
	    res = res*2;
	    y = y+1;
	}
	return res;
    }

    public static String[] f(String s) {
	String[] stab = new String[s.length()];
	for (int i=stab.length-1; i>=0; i=i-1) {
	    stab[i]="";
	    for (int j=0; j<i; j=j+1) {
		stab[i] = stab[i]+s;
	    }
	}
	return stab;
    }

    public static void main (String[] args) {
	String st = "BOUM";
	String[] t= f(st);
	printStringArray(t);
	System.out.println(t[2].length());
	int m = g(t[2].length());
	System.out.println(m);
    }

    //Fonctions auxiliaires

    public static void printStringArray (String[] t) {
	for (int i=0; i<t.length; i++) {
	    System.out.println(t[i]+" ");
	}
	System.out.println();
    }

    public static void printIntArrayArray (int[][] t) {
	for (int i=0; i<t.length; i++) {
	    for (int j=0; j<t[i].length; j++) {
		
	    }
	}
    }
}
