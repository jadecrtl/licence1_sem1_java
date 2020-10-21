public class Exo20 {

    //Question 1:
    /*public static int addition () {
	int bound = 100;
	int sum = 0;
	for (int i=0; i <= bound; i++) {
	    sum = sum + i;
	}
	return sum;
    }*/

    //Question 2:
    /*public static int addition () {
	int bound = 100;
	int sum = 0;
	for (int i=10; i <= bound; i++) {
	    sum = sum + i;
	}
	return sum;
    }*/


    //Question 3:
    public static int sumIntegers (int n) {
	int x = 0;
	for (int i=0; i <= n; i++) {
	    x = x + i;
	}
	return x;
    }

    public static void main (String[] args) {
	//System.out.println(addition(100));
	System.out.println(sumIntegers(10));
    }

}
