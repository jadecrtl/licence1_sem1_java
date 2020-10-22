public class Exo19 {

    /*public static int f (int x, int y) {
	if (((x <= y) || (x >= y+1))) {
	    if ((x <= y) && (x < y)) {
		if (x < -x) {
		    int a = -x;
		    return a;
		}
		else {
		    return x;
		}
	    }
	    else {
		if (y*y*y < 0) {
		    return -y;
		}
	    }
	}
	return y;
	
    }*/

    public static int f (int x, int y) {
	
    }

    public static void main (String[] args) {
	//On est censé avoir 2 comme résultat
	System.out.println(f(-2,3));
	//On est censé avoir 3 comme résultat
	System.out.println(f(2,-3));
	//On est censé avoir 2 comme résultat
	System.out.println(f(2,3));
	//On est censé avoir 3 comme résultat
	System.out.println(f(-2,-3));
	//On est censé avoir 0 comme résultat
	System.out.println(f(0,0));
    }

}
