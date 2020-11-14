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
        // À MODIFIER
        return Correction.chiffresLigne(S, i);
    }

    /* Q2 */
    public static boolean[] chiffresColonne(int[][] S, int j) {
        // À MODIFIER
        return Correction.chiffresColonne(S, j);
    }

    /* Q3 */
    public static boolean[] chiffresCarre(int[][] S, int i, int j) {
        // À MODIFIER
        return Correction.chiffresCarre(S, i, j);
    }

    /* EXERCICE 3 */

    /* Q1 */
    public static boolean isSolution(int[][] S) {
        // À MODIFIER
        return Correction.isSolution(S);
    }
}
