import java.io.*;
public class Compression{
  /* ************************************************************************** */
  
  //  Construction du lexique

    //  QUESTION 1 
    //public static boolean isIn (String s, String[] lex){
    

    // QUESTION 2
    // public static String[] extendLexicon (String s, String[] lex){
	
    // QUESTION 3
    //public static String[] buildLexicon(String[] t){

 //  Codage et decodage
  
  //  QUESTION 1 
    //public static int getCode(String s, String[] lex)

  // QUESTION 2
  // public static int[] code (String[] tab, String[] lex){

  // QUESTION 3
    //public static String[] decode (int[] code, String[] lex){
	 


      /******************************************/
      /*     Fonctions auxiliaires              */
      /******************************************/

    // test d'égalité entre chaînes de caractères
    public static boolean stringEquals(String s, String t) {
    	return s.equals(t);
    }
	

    public static void printStringArray (String[] a){
    	for (int i = 0; i<a.length ; i++){
    	    System.out.print(a[i]+" " );
    	}
    	System.out.println();
    }

    public static boolean  stringArrayEquals (String[] a, String[] b){
    	if (a.length!=b.length) {
    	    return false;
		}
    	for (int i=0; i<a.length; i++){
    	    if (!a[i].equals(b[i])){
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


static String textName = "text.txt";
static int textSize = 1002;
static String[] text = new String[textSize];
    //static boolean textLoaded = false;

public static void loadError () {
    System.out.println("Erreur de chargement du texte");
    System.exit(1);
}
  
public static void loadText () {
    try {
        BufferedReader br = new BufferedReader(new FileReader(textName));
      	for(int j=0;j<textSize; j++){
	String t ="";
	for (int i = br.read(); (char)(i)!=' '&& (char)(i)!='\n'; i=br.read()) {
	    t+=(char)(i);
	}
        text[j]=t;
       
	if (text[j] == null) { return; }
    }
    }
    //textLoaded = true
    catch (Exception e) { loadError (); }
}

    /* ********************************************************** */
    /*      Fonction Principale                                   */
    /* ********************************************************** */

 
    public static void main(String[] args){
	//loadText (); 
	//printStringArray (text);
    }
}
