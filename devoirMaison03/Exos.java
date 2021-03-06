import java.util.Arrays;

public class Exos {

    /* EXERCICE 1 */
    public static int[] distancesAZero(int[] temperatures) {
        int[] arr = new int[temperatures.length];
	for (int i=0; i<arr.length; i++) {
	    if (temperatures[i] >= 0) {
		arr[i] =temperatures[i];
	    }
	    else {
		arr[i] =-temperatures[i];
	    }
	}
        return arr;
    }

    /* EXERCICE 2 */    
    public static int indiceMin(int[] tab) {
        int[] arr = new int[tab.length];
	int n = 0;
	for (int i=0; i<tab.length; i++) {
	    if (tab[i] <= tab[n]) {
		n = i;
	    }
	}
        return n;
    }

    /* EXERCICE 3 */
    public static int plusProcheDeZero(int[] temperatures) {
       	return temperatures[indiceMin(distancesAZero(temperatures))];
    }

    /* EXERCICE 4 */
    public static int bonus(int[] temperatures) {
	int max = 1000000;
	int vide = 0;
	int valAbs = 0;
	for (int i=0; i<temperatures.length; i++) {
	    if(temperatures[i] < 0) {
		valAbs = -temperatures[i];
	    }
	    else {
		valAbs = temperatures[i];
	    }

	    if(valAbs <= max) {
		max = valAbs;
		if(temperatures[i] == -vide) {
		    vide = valAbs;
		}
		else {
		    vide = temperatures[i];
		}
	    }
	}
	return vide;
    }

    // *** Tests ***

    public static void main(String[] args) {

        // ENLEVEZ LES COMMENTAIRES AU FUR ET A MESURE POUR TESTER VOS FONCTIONS

        // Entrées

        int[] t1 = { 1, -2, -8, 4, 5 };

        int[] t2 = { 14, 12, 4, 30, 7 };
        int[] t3 = { -12, -7, -42, 24, 0, -42 };
        int[] t4 = { 3, 62 };

        int[] t5 = { -12, -5, -137 };
        int[] t6 = { 42, -5, 12, 21, 5, 24 };
        int[] t7 = { -5, -4, -2, 12, -40, 4, 2, 18, 11, 5 };

        int[] t8 = { 42, 5, 12, 21, -5, 24 };
        int[] t9 = {};

        // Tests

         System.out.println("====Ex1====");
         testIntArray(String.format("distancesAZero(%s)", Arrays.toString(t1)), distancesAZero(t1), new int[] { 1, 2, 8, 4, 5 });

	 System.out.println("====Ex2====");
         testInt(String.format("indiceMin(%s)", Arrays.toString(t2)), indiceMin(t2), 2);
         testInt(String.format("indiceMin(%s)", Arrays.toString(t3)), indiceMin(t3), 5);
         testInt(String.format("indiceMin(%s)", Arrays.toString(t4)), indiceMin(t4), 0);

         System.out.println("====Ex3====");
         testInt(String.format("plusProcheDeZero(%s)", Arrays.toString(t1)), plusProcheDeZero(t1), 1);
         testInt(String.format("plusProcheDeZero(%s)", Arrays.toString(t5)), plusProcheDeZero(t5), -5);
         testInt(String.format("plusProcheDeZero(%s)", Arrays.toString(t6)), plusProcheDeZero(t6), 5);
         testInt(String.format("plusProcheDeZero(%s)", Arrays.toString(t7)), plusProcheDeZero(t7), 2);

         System.out.println("====Ex4====");
         testInt(String.format("bonus(%s)", Arrays.toString(t1)), bonus(t1), 1);
         testInt(String.format("bonus(%s)", Arrays.toString(t5)), bonus(t5), -5);
         testInt(String.format("bonus(%s)", Arrays.toString(t6)), bonus(t6), 5);
         testInt(String.format("bonus(%s)", Arrays.toString(t7)), bonus(t7), 2);
         testInt(String.format("bonus(%s)", Arrays.toString(t8)), bonus(t8), 5);
         testInt(String.format("bonus(%s)", Arrays.toString(t9)), bonus(t9), 0);
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

    public static void testIntArray(String cmd, int[] exp, int[] val) {
        System.out.printf("%s == %s\n", cmd, Arrays.toString(exp));
        if (!Arrays.equals(exp, val)) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }
}
