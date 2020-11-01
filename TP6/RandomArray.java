import java.util.Random;
public class RandomArray {
 static Random rand = new Random();

/* ************************************************************************** */
  

    //  QUESTION 1 
    public static int[] createRandomArray(int n) {
	int[] a = new int[n];
	for (int i=0; i<n; i++) {
	    a[i] = rand.nextInt(n);
	}
	return a;
    }
	

    // QUESTION 2
    public static int[] minMaxAverage(int[] a) {
	int[] res = new int[3]; //res[0] = minimum res[1] = maximum res[2] = moyenne
	res[0] = a[0];
	res[1] = a[0];
	res[2] = a[0];
	for (int i=1; i<a.length; i++) {
	    if (a[i] < res[0]) {
		res[0] = a[i];
	    }
	    if (a[i] > res[1]) {
		res[1] = a[i];
	    }
	    res[2] = res[2] + a[i];
	}
	res[2] = res[2]/a.length;
	return res;
    }
    
 
    // QUESTION 3
    public static int[] occurrences(int[] a) {
	int[] res = new int [1+(minMaxAverage(a))[1]];
	for (int i=0; i<a.length; i++) {
	    res[a[i]]++;
	}
	return res;
    }
  
    // QUESTION 4a
    public static int[] countingSort(int[] a) {
	int[] res = new int[a.length];
	int[] occ = occurrences(a);
	int k = 0;
	for (int i=0; i<occ.length; i++) {
	    for (int j=0; j<occ[i]; j++) {
		res[k]=i;
		k++;
	    }
	}
	return res;
    }
  
    // QUESTION 4b
    //public static void countingSort2(int[] a)


      /******************************************/
      /*     Fonctions auxiliaires              */
      /******************************************/
	
    public static boolean  intArrayEquals (int[] a, int[] b){
    	if (a.length!=b.length) {
	        return false;
		}
	    for (int i=0; i<a.length; i++){
	        if (a[i]!=b[i]){
	        	return false;
	        }
	    }
	    return true;
    }
  
    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    /* ********************************************************** */
    /*      Fonction Principale                                   */
    /* ********************************************************** */


    public static void main(String[] args){
	/*System.out.println("Entrez un entier positif (la taille du tableau):");
    	int n = Integer.parseInt(System.console().readLine());
    	int[] a = createRandomArray(n);	
    	printIntArray(a);
	*/
	printIntArray(minMaxAverage(createRandomArray(100)));
	printIntArray(minMaxAverage({5,6,2,0,-1,18,4}));
	int[] a = {1,3,0,0,0,1};
	printIntArray(occurrences(a));

	int[] a = {0,1,1,1,2,2,2,3,4,4};
	printIntArray()
		
    }


}
