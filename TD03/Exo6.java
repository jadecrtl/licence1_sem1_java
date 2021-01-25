public class Exo6 {

    public static int power (int x, int n) {
	int res = 1;
	for (int i=0; i < n; i++) {
	    res = res * x;
	}
	return res;
    }

    public static void main (String[] args) {
	System.out.println(power(3,3));
	System.out.println(power(2,4));
	System.out.println(power(5,2));
	System.out.println(power(2,6));
    }




}
