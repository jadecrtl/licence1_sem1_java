public class Exos {
    /* EXERCICE 1 */

    public static boolean isStartingGrid(int[][] grid) {
	//Si le tableau n'est pas de longueur 2: false
	if (grid.length != 3) {
	    return false;
	}
	//Si les éléments du tableau ne sont pas de longueur 2: false
	for (int i=0; i<=2; i++) {
		if (grid[i].length != 3) {
		    return false;
		}
	}
	//Si on trouve une valeur différente de 0: false
	for (int i=0; i<=2; i++) {
	    for (int j=0; j<=2; j++) {
		if (grid[i][j] != 0) {
		    return false;
		}
		       
	    }
	}
	//C'est une grille de 3.3 remplie de zéros
	return true;
    }

    /* EXERCICE 2 */
    
    public static boolean move (int[][] grid, int line, int column, int player) {
	if (line<grid.length && column<grid.length && line>=0 && column>=0) {
	    if (grid[line][column] == 0) {
		grid[line][column] = player;
		return true;
	    }
	    else {
		System.out.println("Illegal move (occupied)");
		return false;
	    }
	}
	else {
	    System.out.println("Illegal move (Out of bound)");
	    return false;
	}
    }
	

    /* EXERCICE 3 */
    // À compléter
    public static int winner (int[][] grid) {
	//On va tester la diagonale descendante
	//System.out.println("test diag descendante");
	if (grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2]) {
	    if (grid[0][0]+grid[1][1]+grid[2][2] == 3) {
		return 1;
		//Joueur X a gagné
	    }
	    else {
		if (grid[0][0]+grid[1][1]+grid[2][2] == 6) {
		     return 2;
		    //Joueur O a gagné
		}
		else {
		    return 0;
		    //Pas de gagnant possible
		}
	    }
	}
	
	//On va tester la diagonale ascendante
	//System.out.println("test diag ascendante");
	if (grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0]) {
	    if (grid[0][2]+grid[1][1]+grid[2][0] == 3) {
		return 1;
		//Joueur X a gagné
	    }
	    else {
		if (grid[0][2]+grid[1][1]+grid[2][0] == 6) {
		    return 2;
		    //Joueur O a gagné
		}
		else {
		    return 0;
		    //Pas de gagnant possible
		}
	    }
	}


       	//On va tester les lignes
	//System.out.println("test lignes");
	for (int x=0; x<grid.length; x++) {
	    if (grid[x][0]==grid[x][1] && grid[x][1]==grid[x][2]) {
		if (grid[x][0]+grid[x][1]+grid[x][2] == 3) {
		    return 1;
		}
		else {
		    if (grid[x][0]+grid[x][1]+grid[x][2] == 6) {
			return 2;
		    }
		}
	     }
         }
	//On va tester les colonnes
	//System.out.println("test colonnes");
	for (int y=0; y<grid.length; y++) {
	    if (grid[0][y]==grid[1][y] && grid[1][y]==grid[2][y]) {
		if (grid[0][y]+grid[1][y]+grid[2][y] == 3) {
		    return 1;
		}
		else {
		    if (grid[0][y]+grid[1][y]+grid[2][y] == 6) {
			return 2;
		    }
		}
	    }
	}
	return 0;
    }

    /* EXERCICE 4 */
    public static void play(int[][] t){
	//On decide qui joue
	int joueurX = 1;
	int joueurO = 2;
	for (int i=1; i<=9; i++) {
	    if (i%2 == 1) {
		joueUnCoup(joueurX, t);
	    }
	    else {
		joueUnCoup(joueurO, t);
	    }
	    if (winner(t) == 1) {
		System.out.println("Le joueur X à gagné.");
		break;
	    }
	    if (winner(t) == 2) {
		System.out.println("Le joueur O à gagné.");
		break;
	    }
	    if (i==9 && winner(t)==0) {
		System.out.println("Match nul.");
	    }
	}
    }



    public static void joueUnCoup (int joueur, int[][] t) {
	//Quelle case?
	if (joueur == 1) {
	    System.out.print("Joueur X ");
	}
	else {
	    System.out.print("Joueur O ");
	}
	System.out.println ("indiquez la ligne et la colonne à laquelle vous voulez jouer.");
	int i = Integer.parseInt(System.console().readLine());
	int j = Integer.parseInt(System.console().readLine());
	//J'ai transformé move de void à boolean pour tester si le move est correct (true)
	//Tant que le move est incorrect (false) on repose la question
	//Si on ne fait pas ça le joueur qui joue mal perd son tour
	while (!move(t,i,j,joueur)) {
	    if (joueur == 1) {
		System.out.print("Joueur X ");
	    }
	    else {
		System.out.print("Joueur O ");
	    }
	    System.out.println ("indiquez la ligne et la colonne à laquelle vous voulez jouer.");
	    i = Integer.parseInt(System.console().readLine());
	    j = Integer.parseInt(System.console().readLine());
	}
	//afficher la grille mise à jour
	afficheMorpion(t);
    }
    

    
    /* affichage d'un tableau de tableaux d'entiers */
    
    public static void  printIntArrayArray (int[][] t) {
        for(int i=0; i<t.length; i++){
	    for (int j=0; j<t[i].length; j++){
		System.out.print(t[i][j]+" ");
	    }
	    System.out.print("\n");
	}
    }


    //Affichage de la grille en cours (Exo bonus)

    public static void  afficheMorpion (int[][] t) {
	for(int i=0; i<t.length; i++){
	    System.out.println("-------------");
	    for (int j=0; j<t[i].length; j++){
		System.out.print("|");
		if (t[i][j] == 0) {
		    System.out.print(" " + " " + " ");
		}
		if (t[i][j] == 1) {
		    System.out.print(" " + "X" + " ");
		}
		if (t[i][j] == 2) {
		    System.out.print(" " + "O" + " ");
		}
	    }
	    System.out.print("|");
	    System.out.print("\n");
	}
	System.out.println("-------------");
    }

    
    
    
   public static void  main (String[]  args) {
      int[][] startGrid={{0,0,0},{0,0,0},{0,0,0}};
      int[][] bad1 ={{0,0,0},{0,0},{0,0,0}};
      int[][] bad2 ={{0,0,0},{0,0,3},{0,0,0}};
      int[][] finale={{1,2,0},{1,0,2},{1,0,0}};
      System.out.println("Testing isStartingGrid");
      System.out.println("1. "+isStartingGrid(startGrid)+" réponse correcte: true");
      System.out.println("2. "+isStartingGrid(bad1)+" réponse correcte: false");
      System.out.println("3. "+isStartingGrid(bad2)+" réponse correcte: false");
      System.out.print("\n");
      System.out.println("Testing move");	  
      move(startGrid,1,1,1);
      printIntArrayArray(startGrid);
      System.out.println("Ok si la grille affichée est {{0,0,0},{0,1,0},{0,0,0}}");
      System.out.print("\n");
      move(startGrid,0,0,2);
      printIntArrayArray(startGrid);
      System.out.println("Ok si la grille affichée est {{2,0,0},{0,1,0},{0,0,0}}");
      System.out.print("\n");
      move(startGrid,1,1,2);
      System.out.println("Ok si \"Illegal move\" est affiché");
      System.out.print("\n");
      System.out.println("Testing winner");
      System.out.println(winner(startGrid));
      System.out.println("Ok si \"0\" est affiché");
      System.out.print("\n");
      System.out.println(winner(finale));
      System.out.println("Ok si \"1\" est affiché");
      System.out.print("\n");
      System.out.println("Testing play");
      
      int[][] depart={{0,0,0},{0,0,0},{0,0,0}};
      play(depart);


      
  }
    
    
}
