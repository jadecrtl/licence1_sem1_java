public class triTableau {




    public static void afficheTableau (int[] tab) {
	if (tab.length > 0) {
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
	    System.out.print("Le tableau est vide\n");
	}
    }


    public static int[] triBulle (int[] tab) {
	int permutation = 0;
	for (int i=0; i<tab.length-1; i++) {
	    if (tab[i] > tab[i+1]) {
		permuteParIndice(tab, i, i+1);
		permutation++;
	    }	    
	}	
	if (permutation == 0) {
	   return tab;
	}
	else {
	    afficheTableau(tab);
	    triBulle(tab);
	}
	return tab;
    }


    public static int[] permuteParIndice (int[] tab, int indice1, int indice2) {
	int retenue = tab[indice1];
	tab[indice1] = tab[indice2];
	tab[indice2] = retenue;
	return tab;
    }



    public static void main(String[] args) {
	int[] tab1 = {9,-6,1,5,0,4,-3,2,-23};
	afficheTableau(tab1);
	//permuteParIndice(tab1,4,5);
	triBulle(tab1);
	afficheTableau(tab1);
       
    }






}
