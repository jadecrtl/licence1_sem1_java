public class Exos {
    /* EXERCICE 1 */
    // À compléter
    public static boolean isStartingGrid(int[][] grid) {
	return true;
    }
    /* EXERCICE 2 */
    // À compléter
    public static void move (int[][] grid, int line, int column, int player) {
    }
    /* EXERCICE 3 */
    // À compléter
    public static int winner (int[][] grid) {
	return 0;
    }
/* EXERCICE 4 */
    // À compléter
    public static void play(){

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
      play();

      
  }
    
    
}
