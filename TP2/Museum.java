public class Museum {
	/* EXERCICE 1 */
    public static int reduction(int birthyear, int year) {
	    if(year-1-birthyear < 20){
		return 5;
	    }
	    if(year-1-birthyear >= 60){
		return 3;
	    }
	    return 0; 
    }

	    
	/* EXERCICE 2*/
	public static int price (int birthyear,int year,int price) {
		// Modifier le code ci-dessous
	    if (reduction(birthyear,year) == 5){
		price = price - 5;
	    }
	    if (reduction(birthyear,year) == 3){
		price = price - 3;
	    }
	    if (price < 0){
		return 0;
	    }
	    return price;
	}
	       
	/*************************************************************/
	/* PROGRAMME PRINCIPAL*/
	
	public static void main (String[] args) {
	
	
		System.out.println("====Exo 1====");
		testInt("reduction(1970,1990)", reduction(1970,1990), 5);
		testInt("reduction(1929,1990)", reduction(1929,1990), 3);
		testInt("reduction(1960,1990)", reduction(1960,1990), 0);
		testInt("reduction(1940,2000)", reduction(1940,2000), 0);
		testInt("reduction(1979,2000)", reduction(1979,2000), 0);
		
		System.out.println("====Exo 2====");
		testInt("price(1970,1990,25)",price(1970,1990,25),20);
		testInt("price(1929,1990,2)", price(1929,1990,2),0);
		testInt("price(1960,1990,10)",price(1960,1990,10),10);
		
	}
	
	/*************************************************************/
	/* NE PAS MODIFIER */
	/*************************************************************/
	public static void testInt(String cmd, int exp, int val) {
		System.out.println(cmd + " == " + exp);
		if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
	}
    /*************************************************************/ 

	
}
