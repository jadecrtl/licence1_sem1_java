public class Exo3 {

    //Question 1
    /*public static int[][] creerTableDeMultiplication (int lignes, int colonnes) {
	int[][] t = new int[lignes][colonnes];
	for (int i=0; i<lignes-1; i++) {
	    for (int j=0; j<colonnes-1; j++) {
		t[i][j] = (i+1)*(j+1);
	    }
	}
	return t;
	}*/

    
    public static int[][] creerTableDeMultiplication (int lignes, int colonnes) {
	int[][] t = new int[lignes][colonnes];
	int i=0;
	int j=0;
	while (i<lignes-1) {
	    j=0;
	    while (j<colonnes-1) {
		t[i][j] = (i+1)*(j+1);
		j++;
	    }
	    i++;
	}
	return t;
    }

    

    
    public static void main (String[] args) {
	int[][] t1 = creerTableDeMultiplication(10, 10);
	System.out.println(t1[2][3] + " Devrait afficher 3*4=12" );
    }
    
}
