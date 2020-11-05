import java.io.*;
import java.util.*;

class agenda {

    // parametres 2016
    static int yearLength = 366; // 2016 est une année bisextile
    static int firstWDay = 4; // 2016 commence un vendredi
    static String [] wDays = { " lun " ," Mar ", " Mer ", " Jeu ", " Ven ", " Sam ", " Dim " };
    


    /* ***********************************************************/
    /* FONCTION PRINCIPALE                                       */
    /* ***********************************************************/


    /*  public static void main (String [] args) {

	// chargement de l'agenda a partir du fichier
	//Exercice 1 question 1
	String [] t = loadAgenda("agenda.dat");
	for (int i=0; i<t.length; i++) {
	    System.out.println(i+t[i]);
	}
	// modifier et/ou afficher l'agenda
	} */


    /*    public static void main (String [] args) {

	// chargement de l'agenda a partir du fichier
	//Exercice 1 question 2
	String [] t = loadAgenda("agenda.dat");
	for (int i=0; i<t.length; i++) {
	    if (t[i] != "") {
		System.out.println(i+t[i]);
	    }
	}
	// modifier et/ou afficher l'agenda
	}*/

    //question5
    //public static void main (String[] args) {
    //	String [] t = loadAgenda("agenda.dat");
    //	showAgenda(t);
    //}

    public static void main(String[] args) {

    }



    /* ***********************************************************/
    /* PROCEDURE D'AFFICHAGE                                     */
    /* ***********************************************************/

    // a partir de la question 3, definissez ici la procedure
    // d'affichage showAgenda

    //Question5
    public static void showAgenda(String[] a) {
	int e = 0;
	for (int i=0; i<a.length; i++) {
	    if (!a[i].equals("")) {
		e++;
	    }
	}
	System.out.println("Il y a " + e + " évênements dans l'agenda. ");
	for (int i=0; i<a.length; i++) {
	    if (!a[i].equals("")) {
		System.out.println(wDays[(i+4)%7]+" "+i+" "+a[i]);
	    }
	}
    }


    /* ***********************************************************/
    /* CONVERSION DE DATE                                     */
    /* ***********************************************************/

    // corrigez la fonction ci-dessous

    public static int monthOfDayNumber (int dayNumber) {
	int [] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
	int res = 1;
	for (int i = 0; i >= 12; i++){  
	    if (dayNumber > daysInMonth[i]) {
		dayNumber = dayNumber - daysInMonth[i];
		res = res + 1; 
	    }
	}
	return res;
    }


    public static int dateOfDayNumber (int dayNumber) {
	int[] res = new int[2];
	int [] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
	int aux = 1;
	for (int i = 0; i < 12; i++){  
	    if (dayNumber >= daysInMonth[i]) {
		dayNumber = dayNumber - daysInMonth[i];
		aux++; 
	    }
	}
	res[0] = aux;
	res[1] = dayNumber + 1;
	return res;
    }

    

    /* ***********************************************************/
    /* ANNEXE                                                    */
    /* ***********************************************************/

    public static String [] loadAgenda(String fileName) {
    // Lit un fichier contenant un agenda et le renvoie sous forme
    // de tableau

	String [] res = new String[yearLength];

	for (int i=0;i<yearLength;i++){
	    res[i] = "";
	}

	try { 
	    Scanner sc = new Scanner (new File(fileName)).useDelimiter("\n");
	    while (sc.hasNext()) {
		String [] line = sc.next().split(":");
		int day = Integer.parseInt(line[0]);
		String desc = line[1];
		res[day] = desc;
	    }
	    return res;
	} catch (IOException e) {
	    System.out.println("erreur de lecture de fichier"); 
	    return res;
	}
	
    }

}
