class myExercice78{

	public static void main(String[] args) {
		int param = 30;
		int resultat = triple(param);
		System.out.println(resultat);
		System.out.println("est le triple de " + param);

		int resultat2 = magic(param);
		System.out.println(resultat2);
		System.out.println("est le magic de " + param); 


		//System.out.println(triple(25));
	}

	public static int magic(int x) {
		return(triple(x) + twice(x));
	}



	public static int triple(int x) {
		return(x * 3); 
	}


	public static int twice(int x) {
		return(2 * x);
	} 


} 
