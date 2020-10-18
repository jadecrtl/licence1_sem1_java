import java.util.Random;

public class jeuPFC{

    static Random rand = new Random();

    public static int randRange (int a, int b) {
	return (rand.nextInt(b-a) + a); 
    }
    
    public static String tirage() {
	int n = randRange(0,3);
	String ordinateur = "";
	if (n == 0) {
	    ordinateur = "Pierre";
	}
	if (n == 1) {
	    ordinateur = "Ciseaux";
	}
	if (n == 2) {
	    ordinateur = "Feuille";
	}
	return ordinateur;

    }


    public static String coupJoueur() {
	System.out.println("Jouer Pierre, Feuille ou Ciseaux");
	return (System.console ().readLine ());
    }


    public static void uneManche() {
	String s = tirage();
	String t = coupJoueur();
	
        if (s.equals(t)) {
	    System.out.println("Joueur a joué "+ t + " ordinateur a joué "+  s + " Match nul");
	}
	else {
	    if ((s.equals("Pierre") && t.equals("Ciseaux")) || (s.equals("Feuille") && t.equals("Pierre")) || (s.equals("Ciseaux") && t.equals("Feuille"))) {
		    System.out.println("L'ordinateur gagne.");
	      }
	      else {
		  System.out.println("Le Joueur gagne.");
	      }
        }
    }
	    
        
    
    
    public static void main (String[] args){		   
	//System.out.println(coupJoueur());
	//System.out.println(tirage());
	uneManche();
    }
 


}
