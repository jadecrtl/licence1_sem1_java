import java.util.Random;

public class Exos {

    static Random rand = new Random();

    public static int randRange (int a, int b) {
	return (rand.nextInt(b-a) +a);
    }

    //Ex1 Question1
    public static int[][] CreateGraph (int n) {
	int[][] R = new int[n][n];
	for (int i=0; i<R.length; i++) {
	    for (int j=0; j<R[i].length; j++) {
		if (i==j) {
		    R[i][j] = 0;
		}
		else {
		    int ami = randRange(0,2);
		     R[i][j] = ami;
		     R[j][i] = ami;
		}
	    }
	}
	return R;
    }

    public static void main (String[] args) {
	int[][] tab = CreateGraph(3);
	printIntDoubleArray(tab);
	int amiTempo = randRange(0,tab.length-1);
	System.out.println(friends_nbr(tab, amiTempo));
	printIntArray(friends(tab, amiTempo));
	
    }

    //Ex1 Question2
    public static int friends_nbr (int[][]R, int a) {
	int[] amiTab = R[a];
	int n=0;
	for (int i=0; i<R.length; i++) {
		if (amiTab[i]==1) {
		    n++;
		}
	}
	return n;
    }


    //Ex1 Question3
    public static int[] friends (int[][] R, int a) {
	int[] ami = R[a];
	int nbrAmis = friends_nbr(R, a);
	if (nbrAmis==0) {
	    return new int[] {0};
	}
	int[] mesAmis = new int[nbrAmis];
	int compteur = 0;
	for (int i=0; i<R.length; i++) {
	    if (ami[i]==1) {
		mesAmis[compteur] = i;
		compteur++;
	    }
	}
	return mesAmis;
    }

    //Ex1 Question4
    public static int[] popular (int[][] R, int a, int b) {
	
    }
    
    
    //Fonctions utiles
    public static void printIntDoubleArray (int[][] t) {
	for (int i=0; i<t.length; i++) {
	    System.out.print("{");
	    for (int j=0; j<t[i].length; j++) {
		System.out.print(t[i][j]);
	    }
	    System.out.print("}");
	}
	System.out.print("\n");
    }

    public static void printIntArray (int[] t) {
	System.out.print("{");
	for (int i=0; i<t.length; i++) {
	    System.out.print(t[i]);
	}
	System.out.print("}");
	System.out.print("\n");
    }
    
}
