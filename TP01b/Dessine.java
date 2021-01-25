/*
  Un programme simple pour dessiner
*/
public class Dessine{

    // Donnée de configuration du dessin
    public static Turtle turtle;
    static int picture_width  = 1024;
    static int picture_height = 1024;

    /*public static void main (String[] args) {
	// Configuration de la tortue
	turtle = new Turtle (picture_width,picture_height);
	turtle.setspeed (100);
	
	//code pour faire un carre
	int cote = 100;
	for (int i=1; i<5; i++) {
	    turtle.setheading (-90*i);
	    turtle.forward (cote);
	}
	//Code d'attente pour la fermeture de la fenetre
	turtle.exitonclick ();
	}*/

    public static void main (String[] args) {
	// Configuration de la tortue
	turtle = new Turtle (picture_width,picture_height);
	turtle.setspeed (100);
	
	//code pour faire un carre avec un triangle dessus
	int cote = 100;
	for (int i=1; i<5; i++) {
	    turtle.setheading (-90*i);
	    turtle.forward (cote);
	}
	//code pour dessiner un triangle equilateral de cote 100
	for (int i=1; i<4; i++) {
	    turtle.setheading (120*i);
	    turtle.forward (100);
	}
	//Code d'attente pour la fermeture de la fenetre
	turtle.exitonclick ();
	}
     
}


