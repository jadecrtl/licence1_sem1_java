public class Exo17 {

    public static int sommeDesCubes () {
	int bound = 100;
	int x = 0;
	for (int i=0; i <= bound; i++) {
	    x = x + (i*i*i);	    
	}
	return x;
    }

    public static void main (String[] args) {
	System.out.println(sommeDesCubes());
    }

}