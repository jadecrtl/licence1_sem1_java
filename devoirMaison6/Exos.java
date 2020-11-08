public class Exos {

    /* EXERCICE 1 */
    public static boolean[] codeGray(boolean[] b) {
	boolean[] g = new boolean[b.length];
	g[0]=b[0];
	for (int i=1; i<b.length; i++) {
	    g[i]=ouExclusif(b[i], b[i-1]);
	}
	return g;
    }

    /* EXERCICE 2 */
    public static boolean[] decodeGray(boolean[] g) {
	boolean[] b = new boolean[g.length];
	b[0] = g[0];
	for (int i=1; i<g.length; i++) {
	    b[i]=ouExclusif(g[i], b[i-1]);
	}
	return b;
    }

    /* EXERCICE 3 */
    public static boolean[] aux(int n, int m) {
	boolean[] b = new boolean[m];
	int[] puissances2 = new int[m];
	//On doit remplir un tableau de puissances de 2 dans l'ordre inverse de ses indices
	int i=m-1, j=0;
	while (i>=0) {
	    puissances2[i]=power(2,j);
	    i--;
	    j++;
	}
	int reste = n;
	for (int k=0; k<m; k++) {
	    System.out.println(reste + " " + puissances2[k]);
	    if (reste < puissances2[k]) {
		b[k]=false;
	    }
	    else {
		b[k]=true;
		reste = reste-puissances2[k];
	    }
	}
	return b;
    }

    /* EXERCICE 4 */
    // public static boolean nearGray(int n, int m) {
    // }

    public static void main(String[] args) {

        // ENLEVEZ LES COMMENTAIRES AU FUR ET A MESURE POUR TESTER VOS FONCTIONS

        boolean[] b = { false, true, true, false };
        printBooleanArray(b);
        printBooleanArray(codeGray(b));
        printBooleanArray(decodeGray(codeGray(b)));
        printBooleanArray(aux(3, 4));
        //System.out.println(nearGray(6, 9));
        //System.out.println(nearGray(3, 5));
    }

    /*************************************************************/
    /* NE PAS MODIFIER */
    /*************************************************************/

    public static void printBooleanArray(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i])
                System.out.print(1 + " ");
            else
                System.out.print(0 + " ");
        }
        System.out.println();
    }

    // *** Fonctions utilitaires ***

    /* Retourne base élevée à la puissance exponent. */
    public static int power(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            result = result * base;
            exponent = exponent - 1;
        }
        return result;
    }

    //Je cree ma fonction representant la methode du "ou exclusif"
    //methode du ou exclusif :
    //00 : 0  10 : 1  01 : 1  11 : 0
    public static boolean ouExclusif(boolean a, boolean b) {
	    if (a == false && b == false) {
		return false;
	    }
	    if (a == true && b == false) {
		return true;
	    }
	    if (a == false && b == true) {
		return true;
	    }
	    else {
		return false;
	    }
    }
}
