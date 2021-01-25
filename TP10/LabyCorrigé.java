import java.util.*;
import java.io.*;

public class Labyrinthe{

  public static Random rand = new Random();

  public static int randRange(int a, int b) {
    return (rand.nextInt(b - a) + a);
  }

  //Cette fonction prend en argument le nom d'un fichier
  //contenant la description d'un labyrinthe
  //et renvoie la liste de liste d'entiers correspondante
  public static int[][]chargeLabyrinthe(String nomFichier){
    int[][]labyrinthe={};
    try{
      Scanner sc=new Scanner(new File(nomFichier)).useDelimiter("\n");
      int c=0;
      //On compte le nombre de lignes
      while(sc.hasNext()){
        c=c+1;
        String tmp=sc.next();
      }
      labyrinthe=new int[c][];
      sc=new Scanner(new File(nomFichier)).useDelimiter("\n");
      int i=0;
      while(sc.hasNext()){
        String ligne=sc.next();
        String[] splitLigne=ligne.split(",");
        labyrinthe[i]=new int[splitLigne.length];
        for(int j=0;j<splitLigne.length;j=j+1){
          labyrinthe[i][j]=Integer.parseInt(splitLigne[j]);
        }
        i=i+1;
      }
    }
    catch(Exception e){
      System.out.println("Probleme dans la lecture du fichier "+nomFichier);
      e.printStackTrace();
    }
    return labyrinthe;
  }

  public static void afficheLab(int[][] lab) {
    for(int i = 0; i < lab.length; i++) {
      for(int j = 0; j < lab[i].length; j++) {
        if(lab[i][j] == 0)
          System.out.print("X");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static int[][] copieLab(int[][] lab) {
    int[][] copie = new int[lab.length][lab[0].length];
    for(int i = 0; i < lab.length; i++) {
      for(int j = 0; j < lab[i].length; j++) {
        copie[i][j] = lab[i][j];
      }
    }
    return copie;
  }

  public static int caseHaut(int[][] lab, int l, int c) {
    if(l == 0)
      return -1;
    else
      return lab[l-1][c];
  }


  public static int caseBas(int[][] lab, int l, int c) {
    if(l == lab.length - 1)
      return -1;
    else
      return lab[l+1][c];
  }


  public static int caseGauche(int[][] lab, int l, int c) {
    if(c == 0)
      return -1;
    else
      return lab[l][c-1];
  }

  public static int caseDroite(int[][] lab, int l, int c) {
    if(c == lab[0].length - 1)
      return -1;
    else
      return lab[l][c+1];
  }

  public static int[][] voisinsLibres(int[][] lab, int l, int c) {
    // On crée un tableau trop grand
    // Il y aura toujours 4 voisins au plus
    int[][] voisins = new int[4][2];
    // On remplit ce tableau en partant de la gauche
    // Il nous faut donc un accumulateur
    int next = 0;
    if(caseHaut(lab, l, c) == 1) {
      voisins[next][0] = l-1;
      voisins[next][1] = c;
      next++;
    }
    if(caseBas(lab, l, c) == 1) {
      voisins[next][0] = l+1;
      voisins[next][1] = c;
      next++;
    }
    if(caseGauche(lab, l, c) == 1) {
      voisins[next][0] = l;
      voisins[next][1] = c-1;
      next++;
    }
    if(caseDroite(lab, l, c) == 1) {
      voisins[next][0] = l;
      voisins[next][1] = c+1;
      next++;
    }
    // Maintenant que voisins est rempli, on récupère les premières
    // cases pour enlever celles qu'on n'a pas rempli
    int[][] res = new int[next][2];
    for(int i = 0; i < next; i++) {
      res[i] = voisins[i];
    }
    return res;
  }

  public static void changeVoisins(int[][] lab, int l, int c, int k) {
    // On récupère les voisins qu'il faut changer
    int[][] voisins = voisinsLibres(lab, l, c);
    for(int i = 0; i < voisins.length; i++) {
      // On récupère les coordonnées du ieme voisin
      int[] coords = voisins[i];
      lab[coords[0]][coords[1]] = k + 1;
    }
  }

  public static void etapeParcours(int[][] lab, int k) {
    for(int i = 0; i < lab.length; i++) {
      for(int j = 0; j < lab[i].length; j++) {
        if(lab[i][j] == k) {
          changeVoisins(lab, i, j, k);
        }
      }
    }
  }

  public static boolean finParcours(int[][] lab) {
    if(lab[lab.length - 1][lab[0].length - 1] != 1) {
      return true;
    }
    else {
      boolean res = true;
      for(int i = 0; i < lab.length; i++) {
        for(int j = 0; j < lab[i].length; j++) {
          // Si on a une case parcourue (i.e. de valeur > 1)
          // Mais que celle-ci a des voisins non parcourus (i.e. des voisins libres)
          // Alors le parcours n'est pas fini
          if(lab[i][j] > 1 && voisinsLibres(lab, i, j).length != 0)
            res = false;
        }
      }
      return res;
    }
  }

  public static int parcours(int[][] lab) {
    // On travaille sur une copie
    int[][] copie = copieLab(lab);
    // L'étape commence à 2
    int etape = 2;
    copie[0][0] = 2;
    // Tant que le parcours n'est pas fini, on fait une étape
    while(!finParcours(copie)) {
      etapeParcours(copie, etape);
      etape++;
    }
    return copie[copie.length - 1][copie[0].length - 1] - 1;
  }

  public static int[][] generer(int lignes, int colonnes, int a) {
    // Ceci pour avoir un nombre réaliste de cases.
    // Si l'utilisateurice demande un labyrinthe de 10x10 avec a=5 cases vides,
    // bon courage pour en trouver un.
    // On a besoin d'au moins lignes + colonnes - 2 cases pour aller du coin haut-gauche
    // au coin bas-droit, mais cet algo est tellement pourri que j'estime qu'on
    // ne peut pas avoir de réponse en temps raisonnable pour
    // a < (lignes * colonnes)/2
    int cases = Math.max(a, (lignes*colonnes)/2);
    // On crée le labyrinthe
    int[][] lab = new int[lignes][colonnes];
    lab[0][0] = 1;
    // On continue tant qu'on n'a pas trouvé un labyrinthe parcourable
    // On peut ici s'amuser à augmenter la condition pour avoir des labyrinthes
    // plus long. Par exemple, vous pouvez essayer `parcours(lab) <= 70`
    // pour obliger le labyrinthe a nécessiter au moins 70 pas.
    while(parcours(lab) <= 0) {
      lab = new int[lignes][colonnes];
      lab[0][0] = 1;
      // On génère `cases` cases vides
      int casesAGenerer = cases;
      while(casesAGenerer > 0) {
        int l = randRange(0, lignes);
        int c = randRange(0, colonnes);
        if(lab[l][c] != 1) {
          lab[l][c] = 1;
          casesAGenerer--;
        }
      }
      // On prie qu'il soit parcourable, sinon on recommence
    }
    return lab;
  }

  public static void main(String[] args){
    int[][]lab=chargeLabyrinthe("labyrinthe1.csv");
    afficheLab(lab);
    System.out.println(parcours(lab));
    afficheLab(generer(20, 20, 250));
  }

}
