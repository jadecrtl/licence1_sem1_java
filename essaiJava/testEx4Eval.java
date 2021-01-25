public class testEx4Eval {

    //Corrigé du sujet
        public static boolean testCarre (int n) {
	for (int i=0; i<=n; i++) {
	    if (i*i == n) {
		return true;
	    }
	}
	return false;
	}

    //Ma fonction
    public static boolean testCarreJade (int n) {
	boolean b = false;
	for (int i=n; i>1; i--) {
	    if (n%i == 0) {
		b = true;
	    }
	}
	return b;
    }
    
    //Ma fonction de test
    public static boolean testunit_testCarre (int n, boolean resultat_attendu){
	if (testCarre(n) == resultat_attendu){
	    return true;
	}
	else {
	    System.out.println("** ERREUR testunit_testCarre ** le resultat " + resultat_attendu +  " ne correspond pas au nombre " + n);
	    return false;
	}
    }


    
    public static void main (String[] args) {
	System.out.println(testCarre(25));
	System.out.println(testCarre(23));
	testunit_testCarre(1, true);
	testunit_testCarre(2, false);
	testunit_testCarre(3, false);
	testunit_testCarre(4, true);
	testunit_testCarre(5, false);
	testunit_testCarre(10, false);
	testunit_testCarre(11, false);
	testunit_testCarre(12, false);
    }
}
