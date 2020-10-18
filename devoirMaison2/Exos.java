public class Exos {
    /* EXERCICE 1 */
    public static void simpleFlag(int rows, int columns ) {
	for (int i=0; i<rows; i++) {
	    for (int j=0; j<columns; j++) {
		if (i==0||i==rows-1||j==0||j==columns-1) {
		    System.out.print("*");
		}
		else {
		    System.out.print(" ");
		}
	    }
	    System.out.print("\n");
	}

    }
    /* EXERCICE 2 */
    public static void crossFlag (int dim ) {
	for (int i=0; i<dim; i++) {
	    for (int j=0; j<dim; j++) {
		if (i==0 || i==dim-1 || j==0 || j==dim-1 || i==j || i+j==dim-1) {
		    System.out.print("*");
		}
		else {
		    System.out.print(" ");
		}
	    }
	    System.out.print("\n");
	}
    }
    /* EXERCICE 2 */
    public static void magritteFlag (int rows, int columns) {
	String chaine = ("Ce n'est pas l'exo 3 du DM2. ");
	    for (int i=0; i<rows; i++) {
		for (int j=0; j<columns; j++) {
		    if (j+i<chaine.length()) {
			System.out.print(characterAtPos(chaine, j+i));
		    }
		    else {
			System.out.print(characterAtPos(chaine, j+i-chaine.length()));
		    }
		}
		System.out.print("\n");
	    }
    } 
		
   

    public static void main(String[] args) {
	System.out.println("====Ex1====");
	simpleFlag(10,30);
	System.out.println("====Ex2====");
	crossFlag(13);
	System.out.println("====Ex3====");
	magritteFlag(7,30);
    }

    // *** Fonctions utilitaires vues en cours ***
  /*
     * Renvoie une chaîne constituée du caractère se trouvant à la position [i] de
     * la chaîne [s]. Si [i] est négatif ou en dehors de la chaîne, renvoie la
     * chaîne vide.
     */
    public static String characterAtPos(String s, int i) {
        String res = "";
        if (i >= 0 && i < s.length()) {
            res = String.valueOf(s.charAt(i));
        }
        return res;
    }


    
}
