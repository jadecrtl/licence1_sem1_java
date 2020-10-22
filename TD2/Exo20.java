public class Exo20 {

    public static void mention (int x) {
	if (x <= 0) {
	    System.out.println("La note est négative donc aucune mention.");
	}
	else {
	    if (x < 10) {
		System.out.println("La note est inférieure à 10 donc aucune mention.");
	    }
	    if (x >= 10 && x < 12) {
		System.out.println("La mention est passable.");
	    }
	    if (x >= 12 && x < 14) {
		System.out.println("La mention est assez bien.");
	    }
	    if (x >= 14 && x < 16) {
		System.out.println("La mention est bien.");
	    }
	    if (x >= 16) {
		System.out.println("La mention est très bien");
	    }
	}
    }


    public static void main (String[] args) {
	mention(-6);
	mention(4);
	mention(10);
	mention(11);
	mention(12);
	mention(13);
	mention(14);
	mention(15);
	mention(16);
	mention(22);
    }

}
