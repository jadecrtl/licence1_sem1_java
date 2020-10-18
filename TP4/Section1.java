class Section1 {

    /* ********************************************************** */
    /* EXERCICE 1 : ENTIERS NON SIGNES                            */
    /* ********************************************************** */


    // QUESTION 1 
    public static boolean isBinaryEncoding (String octet) {
	if (octet.length() != 8) {
	    return false;
	}
       	for (int i=0; i<octet.length(); i++) {
	    if (octet.charAt(i) != '1' && octet.charAt(i) != '0') {
		return false;
	    }
	   }
	return true;
    }

    

    // QUESTION 2  
    public static int powerTwo (int n) {
	int res = 1;
	for (int i=0; i<n; i++) {
	    res = res * 2;
	}
	return res;
    }


    // QUESTION 3
    public static int decode (String octet) {
	if (!isBinaryEncoding(octet)) {
	    return (-1);
	}
	int res = 0;
	for (int i=0; i<8; i++) {
	    if (octet.charAt(i) == '1') {
		res = res + powerTwo(7-i);
	    }
	}
	return res;
    }


    // QUESTION 4
    // Déclarez la *procédure* encodeAndPrint ci-dessous    


    // QUESTION 5
    // Déclarez la fonction encode ci-dessous    


    // QUESTION 6
    // Ecrivez le test dans la fonction main




    /* ********************************************************** */
    /* EXERCICE 2 : INVERSE                              */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction inverse ci-dessous
    

    // QUESTION 2  
    // Déclarez les fonctions encodeInv et decodeInv ci-dessous



    /* ********************************************************** */
    /* EXERCICE 3 : ENTIERS SIGNES                                */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isNegative ci-dessous
    

    // QUESTION 2  
    // Déclarez la fonction decodeNeg ci-dessous


    // QUESTION 3
    // Déclarez la fonction encodeNeg ci-dessous    


    // QUESTION 4
    // Déclarez la procédure testFinal ci-dessous    



    /* ********************************************************** */
    /* FONCTION PRINCIPALE                                        */
    /* ********************************************************** */
    

    public static void main (String []args) {


	System.out.println("====Ex1==question1==");
	testBoolean("isBinaryEncoding(\"11111110\")", isBinaryEncoding("11111110"),true);
	testBoolean("isBinaryEncoding(\"11111110\")", isBinaryEncoding("10001000"),true);

	System.out.println("====Ex1==question2==");
	testInt("powerTwo(\"4\")", powerTwo(4),16);

	System.out.println("====Ex1==question3==");
	testInt("decode(\"11111110\")",decode("11111110"),254);
	testInt("decode(\"10001000\")",decode("10001000"),136);
	
	    

    }

    public static void testBoolean(String cmd, boolean exp, boolean val) {
	System.out.println(cmd + "==" + exp);
	if (exp != val) {
	    System.out.println("Ce n'est pas la bonne réponse!");
	}
    }

     public static void testInt(String cmd, int exp, int val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    /* ********************************************************** */
    /* FONCTIONS AUXILIAIRES                                      */
    /* ********************************************************** */
     

    // caractère à une position donnée
    public static String charAtPos(String s, int i) {
	return String.valueOf(s.charAt(i));
    }

    // test d'égalité entre chaînes de caractères
    public static boolean stringEquals(String s, String t) {
	return s.equals(t);
    }
    

}
