public class test {

    public static void carre (int n) {
	for (int i=0; i<n; i++) {
	    for (int j=0; j<n; j++) {
		//System.out.print("*");
		if (i==0||i==n-1||j==0||j==n-1) {
		    System.out.print("*");
		}
		else {
		    System.out.print(" ");
		}
	    }
	    System.out.print("\n");
	}
    } 

    /***************************************************
/* PROGRAMME PRINCIPAL */
    public static void main (String[] args) {
	carre(10);
    }
}