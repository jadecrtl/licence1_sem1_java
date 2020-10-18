import java.math.*;

public class AbsoluteValue {

    public static int myAbs (int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int newAbs (int x) {
        if (x < 10) {
            return (int)(Math.sqrt(x*x));
        } else if (x >=10 && x < 100) {
            return (int)(Math.sqrt(x*x));
        } else if (x == 100) {
            return -100;
        } else {
            return (int)(Math.pow(Math.sqrt(Math.sqrt(x*x)),2));
        }
    }

    /*Exercice 1 question 1)
    public static void main(String []args){
	System.out.println(myAbs(0));
    }
    }*/


    
    /*Exercice 1 question 2)
    public static void main(String []args){
	System.out.println(myAbs(-10));
    }
   }

    public static void main(String []args){
	System.out.println(myAbs(0));
    }
   }

    public static void main(String []args){
	System.out.println(myAbs(1));
    }
   }

    public static void main(String []args){
	System.out.println("Entrée : " + Integer.toString(-10));
	System.out.println("Sortie myAbs : " + Integer.toString(myAbs(-10)));
    }
   }

    public static void main(String []args){
	System.out.println("Entrée : " + Integer.toString(0));
	System.out.println("Sortie myAbs : " + Integer.toString(myAbs(0)));
    }
   }

    public static void main(String []args){
	System.out.println("Entrée : " + Integer.toString(1));
	System.out.println("Sortie myAbs : " + Integer.toString(myAbs(1)));
    }
   }*/


    /*Exercice 1 question 3)
    public static void main(String []args){
	for (int i=-10; i<10; i++) {
	    System.out.println("Entrée : " + Integer.toString(i));
	    System.out.println("Sortie myAbs : " + Integer.toString(myAbs(i)));
	}
    }
   }*/

    
    /* Exercice 1 question 4)
    public static void main(String []args){
	for (int i=-10; i<0; i++) {
	    System.out.println("Entrée : " + Integer.toString(i));
	    if (i<0) {
		System.out.println("Sortie myAbs : " + Integer.toString(myAbs(-i)));
	    }
	    else {
		System.out.println("");
	    }
	if (myAbs(i) != -i) {
		System.out.println(" (erreur) ");
	}
	else {
		System.out.println(" (valide) ");
	}	
	}
	for (int i=1; i<=10; i++) {
	    System.out.println("Entrée : " + Integer.toString(i));
	    if (i>=0) {
	        System.out.println("Sortie myAbs : " + Integer.toString(myAbs(i)));
	    }
	    else {
		System.out.println("");
	    }
	if (myAbs(i) != i) {
		System.out.println(" (erreur) ");
	}
	else {
		System.out.println(" (valide) ");
	}
    }
 }
}*/


    /*Exercice 1 question 5)
    public static void main(String []args){
	for (int i=-100; i<=99; i++) {
	    System.out.println("Entrée : " + Integer.toString(i));
	    System.out.println("Sortie myAbs : " + Integer.toString(myAbs(i)));
	
	if ((i>=0 && myAbs(i) !=i || i<0 && myAbs(i) !=-i)) {
		System.out.println(" (erreur) ");
	}
	else {
		System.out.println(" (valide) ");
	}
    }
    }
}*/

    /*Exercice 1 question 6)
    public static void main(String []args){
	for (int i=-10; i<100; i++) {
	    System.out.println("Entrée : " + Integer.toString(i));
	    System.out.println("Sortie myAbs : " + Integer.toString(myAbs(i)));  

	    if ((i>=0 && myAbs(i) !=i || i<0 && newAbs(i) !=-i)) {
		System.out.println(" (erreur) ");
	    }
	    else {
		System.out.println("ok ");
	    }

	}
    }
}*/
