public class Exo19 {

    public static int f (int x, int y) {
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
	
    }
    //version simplifiée de f
    public static int f2 (int x, int y) {
	int a;
	if (x < y) {
	    a = x;
	}
	else {
	    a = y;
	}
	if (a < 0) {
	    return -a;
	}
	else {
	    return a;
	}
    }

    public static void test (int a, int b) {
	if (f(a,b) == f2(a,b)) {
	    System.out.println("Succés pour (" + a + "," + b + ")" + f(a,b));
	}
	else {
	    System.out.println("Echec pour (" + a + "," + b + ")" + f(a,b));
	}
    }
    
    public static void main (String[] args) {
	test(2,-3);
	test(2,3);
	test(-2,-3);
	test(-2,3);
	test(4,-3);
	test(4,3);
	test(-4,-3);
	test(-4,3);
	test(3,-3);
	test(3,3);
	test(-3,-3);
	test(-3,3);
    }

}
