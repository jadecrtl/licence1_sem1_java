public class Exos {
    /*** EXERCICE 1 ***/

    /* Q1 */
    public static boolean[] initBoolArray(int n, boolean b) {
        boolean[] tab = new boolean[n];
	for (int i=0; i<n; i++) {
	    tab[i] = b;
	}
	return tab;
    }

    /* Q2 */
    public static boolean equalsBoolArray(boolean[] t1, boolean[] t2) {
	if (t1.length != t2.length) {
	    return false;
	}
	for (int i=0; i<t1.length; i++) {
	    if (t1[i] != t2[i]) {
		return false;
	    }
	}
	return true;
    }

    /* Q3 */
    public static int[][] transpose(int[][] S) {
	int[][] tab = new int[9][9];
	for (int i=0; i<9; i++) {
	    for (int j=0; j<9; j++) {
		tab[i][j] = S[j][i];
	    }
	}
	return tab;
    }

    /*** EXERCICE 2 ***/

    /* Q1 */
    public static boolean[] chiffresLigne(int[][] S, int i) {
        boolean[] tabInitBool = initBoolArray(10, false);
	for (int k=0; k<9; k++) {
	    tabInitBool[S[i][k]] = (S[i][k] != 0);
	}
	return tabInitBool;
    }

    /* Q2 */
    public static boolean[] chiffresColonne(int[][] S, int j) {
	return chiffresLigne(transpose(S),j);
    }

    /* Q3 */
    public static boolean[] chiffresCarre(int[][] S, int i, int j) {
	boolean[] tabInitBool = initBoolArray(10, false);
	int n = i/3*3;
	int k = j/3*3;
	for(i=n; i<n+3; i++) {
	    for(j=k; j<k+3; j++) {
		tabInitBool[S[i][j]] = (S[i][j] != 0);
	    }
	}
	return tabInitBool;
    }

    /* EXERCICE 3 */

    /* Q1 */
    public static boolean isSolution(int[][] S) {
	
    }
}
