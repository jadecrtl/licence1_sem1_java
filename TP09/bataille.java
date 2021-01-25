import java.util.Random;
public class bataille {

    public static int[][] gridComp = new int [10][10];
    public static int[][] gridPlay = new int [10][10];

    //Ex1 Question1
    public static boolean posOk (int[][] grille, int l, int c, int d, int t) {
	if (l<0 || l>9 || c<0 || c>9 || (d != 1 && d != 2)) {
	    return false;
	}
	if (d == 1) {
	    for (int i=c; i>c-t; i--) {
		if ((i<0) || (grille[l][i] != 0)) {
		    return false;
		}
	    }
	}
	if (d == 2) {
	    for (int i=l; i<l+t; i++) {
		if ((i>=10) || (grille[i][c] != 0)) {
		    return false
		}
	    }
	}
	return true;
    }
    
    //Ex1 Question2


    
    //Ex1 Question3


    
    //Ex2


    
    //Ex3 Question1


    
    //Ex3 Question2


    
    //Ex3 Question3


    
    //Ex3 Question4


    
    //Ex4

    

    public static void main (String[] args) {
    }

    
}
