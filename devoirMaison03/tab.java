public class tab{

    public static void main (String[] args) {
	int[] tab1 = {1,2,3,4,-1,18,9,5,0};
	afficheTableau(tab1);
	permuteParIndice(tab1,4,5);
	afficheTableau(tab1);
    }

    static void afficheTableau (int[] tab) {
	if(tab.length > 0) {
	System.out.print("{");
	for (int i=0; i<tab.length; i++) {
	    System.out.print(tab[i]);
	    if (i != tab.length-1) {
		System.out.print(", ");
	    }
	}
	System.out.print("}");
	System.out.println();
	}
	else {
	    System.out.print("Le tableau est vide!\n");
	}
	
    }

    static int[] permuteParIndice (int[] tab, int indice1, int indice2) {
	int retenue = tab[indice1];
	tab[indice1] = tab[indice2];
	tab[indice2] = retenue;
	return tab;
    }
    

    
}
