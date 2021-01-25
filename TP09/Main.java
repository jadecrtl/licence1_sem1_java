import java.util.Random;

class bataille {
  public static int[][] gridComp = new int[10][10];
  public static int[][] gridPlay = new int[10][10];

  public static int[] shipSize = { 0, 5, 4, 3, 3, 2 };
  public static String[] shipName = { "", "porte-avions", "croiseur", "contre-torpilleur", "sous-marin", "torpilleur" };
  public static String[] colName = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

  public static boolean posOk(int[][] grille, int l, int c, int d, int t) {
    if (l < 0 || l > 9 || c < 0 || c > 9 || (d != 1 && d != 2))
      return false;

    if (d == 1) {
      for (int i = c; i > c - t; i--) {
        if (i < 0 || grille[l][i] != 0)
          return false;
      }
    }
    if (d == 2) {
      for (int i = l; i < l + t; i++) {
        if ((i >= 10) || (grille[i][c] != 0))
          return false;
      }
    }

    return true;
  }

  public static void placeShip(int[][] grille, int l, int c, int d, int s) {
    int t = shipSize[s];

    if (l < 0 || l > 9 || c < 0 || c > 9 || (d != 1 && d != 2))
      return;

    if (d == 1) {
      for (int i = c; i > c - t; i--) {
        grille[l][i] = s;
      }
    }
    if (d == 2) {
      for (int i = l; i < l + t; i++) {
        grille[i][c] = s;
      }
    }
  }

  public static void initGridComp() {
    int l = -1;
    int c = -1;
    int d = 0;

    for (int bateau = 1; bateau <= 5; bateau++) {
      while (posOk(gridComp, l, c, d, shipSize[bateau]) == false) {
        l = randRange(0, 10);
        c = randRange(0, 10);
        d = randRange(1, 3);
      }
      placeShip(gridComp, l, c, d, bateau);
    }
  }

  public static void printGrid(int[][] grid) {
    System.out.print("  ");
    for (int i = 0; i < 10; i++)
      System.out.print(" " + colName[i]);
    for (int i = 0; i < 10; i++) {
      // Affichage numéro de ligne
      System.out.print("\n" + (i + 1));
      if (i != 9)
        System.out.print(" ");
      else
        System.out.print("");
      // Affichage de la ligne
      for (int j = 0; j < 10; j++) {
        System.out.print(" " + grid[i][j]);
      }
    }
    System.out.println();
  }

  public static Random rand = new Random();

  public static int randRange(int a, int b) {
    return rand.nextInt(b - a) + a;
  }

  public static String readString() {
    return System.console().readLine();
  }

  public static boolean isInt(String s) {
    return s.matches("\\d+");
  }

  public static int readInt() {
    while (true) {
      String s = readString();
      if (isInt(s))
        return Integer.parseInt(readString());
    }
  }

  public static int readColumn(String msg) {
		while (true) {
			System.out.println("Donnez la colonne " + msg);
			String str = readString();
			for (int i = 0; i < 10; i++) {
				if (colName[i].equals(str))
					return i;
			}
		}
	}

	public static int readLine(String msg) {
    String str = "";
    int i = 0;
		while (!(isInt(str) && i >= 1 && i <= 10)) {
			System.out.println("Donnez la ligne " + msg);
			str = readString();
      if (isInt(str))
			  i = Integer.parseInt(str);
		}
    return i - 1;
	}

	public static int readDir() {
    String str = "";
    int i = 0;
		while (!(isInt(str) && (i == 1 || i == 2))) {
			System.out.println("Voulez-vous qu'il soit horizontal (1) ou vertical (2)?");
			str = readString();
      if (isInt(str))
	      i = Integer.parseInt(str);
		}
    return i;
	}

	public static void initGridPlay() {
		for (int s = 1; s <= 5; s++) {
			int c = -1;
			int l = -1;
			int d = -1;
			while (!posOk(gridPlay, l, c, d, shipSize[s])) {
				c = readColumn("pour le " + shipName[s]);
				l = readLine("pour le " + shipName[s]);
				d = readDir();
			}
			placeShip(gridPlay, l, c, d, s);
		}
	}

  public static void main(String[] args) {
    initGridComp();
    printGrid(gridComp);
    initGridPlay();
    printGrid(gridPlay);
  }
}

class Main {
  public static void main(String[] args) {
    bataille.main(args);
  }
}