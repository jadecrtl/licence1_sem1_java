/*

   Ce programme affiche un message de politesse.

*/

/*

   Voici le nom du programme. On doit toujours définir
   une classe X dans un fichier nommé X.java

*/
public class HelloWorld {
    // Le point d'entrée du programme.
    public static void main (String[] args) {
	// Une unique commande est exécutée.
	System.out.println ("Quel est ton prénom et ton nom?");
	String prenom = System.console ().readLine();
	String nom = System.console ().readLine();
	System.out.println ("Hello" + " " + prenom + " " + nom + "!");
	}
}
