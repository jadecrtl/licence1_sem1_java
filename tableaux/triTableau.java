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
	    triBulle(tab);
	}
	return tab;
    }



    public static int[] triMin (int[] tab) {
	int indiceDeRecherche;
	for (int i=0; i<tab.length; i++) {
	    indiceDeRecherche = rechercheIndiceMin(tab,i);
	    if (tab[i] != tab[indiceDeRecherche]) {
		permuteParIndice(tab, i, indiceDeRecherche);
	    }
	}	
	return tab;
    }


    public static int rechercheIndiceMin (int[] tab, int indiceDepart) {
	int retenueIndiceMin = indiceDepart;
	int retenueValeurMin = tab[indiceDepart];
	for (int i=indiceDepart; i<tab.length; i++ ) {
	    if (tab[i] < retenueValeurMin) {
		retenueIndiceMin = i;
		retenueValeurMin = tab[i];
	    }
	}
	return retenueIndiceMin;
    }

    
    public static int[] permuteParIndice (int[] tab, int indice1, int indice2) {
	int retenue = tab[indice1];
	tab[indice1] = tab[indice2];
	tab[indice2] = retenue;
	afficheTableau(tab);
	return tab;
    }



    public static void main(String[] args) {
	int[] tab1 = {9,-6,1,5,0,4,-3,2,-23};
	int[] tab2 = {9,-6,1,5,0,4,-3,2,-23};
	System.out.println("**************************************************");
	triBulle(tab1);
	System.out.println("**************************************************");
	//System.out.println(rechercheIndiceMin(tab1,0));
	afficheTableau(tab1);
	System.out.println("**************************************************");
	triMin(tab2);
	//permuteParIndice(tab1,4,5);
	System.out.println("**************************************************");
	//System.out.println(rechercheIndiceMin(tab1,5));
	afficheTableau(tab2);
       
    }






}
