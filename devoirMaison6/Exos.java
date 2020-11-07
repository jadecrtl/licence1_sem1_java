public class Exos {

    /* EXERCICE 1 */
    // public static boolean[] codeGray(boolean[] b) {
    // }

    /* EXERCICE 2 */
    // public static boolean[] decodeGray(boolean[] b) {
    // }

    /* EXERCICE 3 */
    // public static boolean[] aux(int n, int m) {
    // }

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
        System.out.println(nearGray(6, 9));
        System.out.println(nearGray(3, 5));
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
}
