public class Exo7 {


    public static int fact (int n) {
	int res = 1;
	for (int i=1; i <= n; i++) {
	    res = res*i;
	}
	return res;
    }


    public static void main (String[] args) {
	System.out.println(fact(1));
	System.out.println(fact(2));
	System.out.println(fact(3));
	System.out.println(fact(4));
	System.out.println(fact(5));
    }




}
