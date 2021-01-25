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


    /* public static void main (String [] args) {

	// chargement de l'agenda a partir du fichier
	//Ex1 Question 1
	  String [] t = loadAgenda("agenda.dat");
	  for (int i=0; i<t.length; i++) {
	      System.out.println(i+t[i]);
	  }
	// modifier et/ou afficher l'agenda
	}*/


    /*public static void main (String [] args) {

	// chargement de l'agenda a partir du fichier
	//Ex1 Question 2
	String [] t = loadAgenda("agenda.dat");
	for (int i=0; i<t.length; i++) {
	    if (t[i] != "") {
		System.out.println(i+t[i]);
	    }
	}
	// modifier et/ou afficher l'agenda
	}*/


    /* ***********************************************************/
    /* PROCEDURE D'AFFICHAGE                                     */
    /* ***********************************************************/

    // a partir de la question 3, definissez ici la procedure
    // d'affichage showAgenda


    //Ex1 Question3
    /*    public static void showAgenda(String[] tab) {
	for (int i=0; i<tab.length; i++) {
	    System.out.println(i+tab[i]);
	}
    }

    public static void main (String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
	}*/
    
    /* //Ex1 Question4
    public static void showAgenda(String[] tab) {
	int n=4;
	for (int i=0; i<tab.length; i++) {
	    if(n==7){
		n=0;
	    }
	    System.out.println(wDays[n]+i+tab[i]);
	    n++;
	}
    }

    public static void main(String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
	}*/

	
    //Ex1 Question5
    /*public static void showAgenda(String[] tab) {
	int n=0;
	for (int i=0; i<tab.length; i++) {
	    if (!tab[i].equals("")) {
		n++;
	    }
	}
	System.out.println("Il y a " + n + " évênements dans l'agenda. ");
	for (int i=0; i<tab.length; i++) {
	    if (!tab[i].equals("")) {
		System.out.println(wDays[(i+4)%7]+" "+i+" "+tab[i]);
	    }
	}
    }

    public static void main(String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
	}*/


    //Ex1 Question6
    /*public static void showAgenda(String[] tab, int startDay, boolean reverse) {
	if (reverse == true) {
	    for (int i=startDay; i>-1; i--) {
		if (!tab[i].equals("")) {
		    System.out.println(wDays[(i+4)%7]+" "+i+tab[i]);
		}
	    }
	}
	else {
	    for (int i=startDay; i<tab.length; i++) {
		if (!tab[i].equals("")) {
		    System.out.println(wDays[(i+4)%7]+ " "+i+tab[i]);
		}
	    }
	}
    }

    public static void main(String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t,0,false);//affiche l'agenda comme à la question précédente
	System.out.println();
	showAgenda(t,87,true);//affiche le lundi de Pâques, puis Pâques, puis le jour de l'An
	}*/
    /* ***********************************************************/
    /* CONVERSION DE DATE                                     */
    /* ***********************************************************/

    //Ex2 Question1
    /*public static void showAgenda(String[] tab) {
	for (int i=0; i<tab.length; i++) {
	    if (!tab[i].equals("")) {
		System.out.println(wDays[(i+4)%7]+" "+i+" "+monthOfDayNumber(i)+" "+tab[i]);
	    }
	}
    }

    public static void main (String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
	}*/

    //Ex2 Question2
    // corrigez la fonction ci-dessous
    
    public static int monthOfDayNumber (int dayNumber) {
	int [] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
	int res = 1;
	for (int i = 0; i < 12; i++){  
	    if (dayNumber >= daysInMonth[i]) {
		dayNumber = dayNumber - daysInMonth[i];
		res = res + 1; 
	    }
	}
	return res;
    }

    //Ex2 Question3

    public static int[] dateOfDayNumber (int dayNumber) {
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

    //Ex2 Question4
    
    /*public static void showAgenda(String[] tab) {
	for (int i=0; i<tab.length; i++) {
	    if (!tab[i].equals("")) {
		int[] d = dateOfDayNumber(i);
		System.out.println(wDays[(i+4)%7]+" "+i+" "+d[1]+"/"+d[0]+" "+tab[i]);
	    }
	}
    }
    
    public static void main (String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
	}*/

    //Ex3 Question1

    /*public static void showAgenda(String[] tab) {
	for (int i=0; i<tab.length; i++) {
	    int[] d = dateOfDayNumber(i);
	    if (d[1]==7 && d[0]==3) {
		tab[i]="C'est mon anniversaire!";
	    }
	    if (!tab[i].equals("")) {
		System.out.println(wDays[(i+4)%7]+" "+i+" "+d[1]+"/"+d[0]+" "+tab[i]);
	    }
	}
    }
    
    public static void main (String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
    }*/

    //Ex3 Question2

    /*public static void showAgenda(String[] tab) {
	for (int i=0; i<tab.length; i++) {
	    int[] d = dateOfDayNumber(i);
	    if (d[1]>=15 && d[1]<=22 && d[0]==6) {
		tab[i]="Bac";
	    }
	    if (!tab[i].equals("")) {
		System.out.println(wDays[(i+4)%7]+" "+i+" "+d[1]+"/"+d[0]+" "+tab[i]);
	    }
	}
    }
    
    public static void main (String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
    }*/

    //Ex3 Question3

    public static void showAgenda(String[] tab) {
	int n=1;
	for (int i=0; i<tab.length; i++) {
	    if (wDays[(i+4)%7].equals("lun")) {
		tab[i]="TP"+" "+n+" "+"IP1";
		System.out.println(tab[i]);
	    }  
	    if (!tab[i].equals("")) {
		int[] d = dateOfDayNumber(i);
		System.out.println(wDays[(i+4)%7]+" "+i+" "+d[1]+"/"+d[0]+" "+tab[i]);
	    }
	}
    }
    
    public static void main (String[] args) {
	String[] t = loadAgenda("agenda.dat");
	showAgenda(t);
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
