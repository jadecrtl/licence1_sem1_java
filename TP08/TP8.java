import java.util.Random;
import java.util.Arrays;

public class TP8 {

// Fonctions utilisées :
static Random rand = new Random();
public static int randRange(int a, int b) {
    return (rand.nextInt(b-a)+a);
}

// Exo 1 :
// Q1 :
public static int[][] CreateGraph(int n) {
    int[][] r = new int[n][n];
    for (int i=0; i<n; i++) {
        for (int j=1; j<n; j++) {
            if (i==j) {
                r[i][j] = 0;
            } else {
                r[i][j] = randRange(0, 2);
            }
        }
    }
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (r[i][j]==1) {
                r[j][i] = 1;
            }
        }
    }
    return r;
}

// Q2 :
public static int friends_nbr(int[][] R, int a) {
    int nbr = 0;
    for (int j=0; j<R[a].length; j++) {
        if (R[a][j]==1) {
            nbr = nbr+1;
        }
    }
    return nbr;
}

// Q3 :
public static int[] friends(int[][] R, int a) {
    int f = friends_nbr(R, a);
    int i = 0;
    if (f==0) {
        int[] fr = new int[1];
        return fr;
    } else {
        int[] fr = new int[f];
        for (int j=0; j<R[a].length; j++) {
            if (R[a][j]==1) {
                fr[i] = j;
                i = i+1;
            }
        }
        return fr;
    }
}

// Q4 :
public static int[] popular(int[][] R) {
    int max = friends_nbr(R, 0);
    int c = 1;
    for (int i=1; i<R.length; i++) {
        int n = friends_nbr(R, i);
        if (n==max) {
            c = c+1;
        } else if (n>max) {
            max = n;
            c = 1;
        }
    }
    int[] pop = new int[c];
    int p = 0;
    for (int i=0; i<R.length; i++) {
        if (friends_nbr(R, i)==max) {
            pop[p] = i;
            p = p+1;
        }
    }
    return pop;
}

// Q5 :
public static int[] common_friends(int[][] R, int a, int b) {
    int[] fra = friends(R, a);
    int[] frb = friends(R, b);
    int k = 0;
    for (int i=0; i<fra.length; i++) {
        for (int j=0; j<frb.length; j++) {
            if (fra[i]==frb[j]) {
                k = k+1;
            }
        }
    }
    int[] com = new int[k];
    k = 0;
    for (int i=0; i<fra.length; i++) {
        for (int j=0; j<frb.length; j++) {
            if (fra[i]==frb[j]) {
                com[k] = frb[j];
                k = k+1;
            }
        }
    }
    return com;
}

// Q6 :
public static int[][] add_user(int[][] R, int[] t) {
    int[][] tab = new int[R.length+1][R.length+1];
    for (int i=0; i<R.length; i++) {
        for (int j=0; j<R[i].length; j++) {
            tab[i][j] = R[i][j];
        }
    }
    for (int j=0; j<tab[tab.length-1].length; j++) {
        tab[tab.length-1][j] = t[j];
        if (tab[tab.length-1][j]==1) {
            tab[j][tab.length-1] = 1;
        }
    }
    return tab;
}

// Q7 :
// Ce tableau a pour longeur 3.
public static String[] popular2(int[][] R) {
    int[] pop = popular(R);
    String[] n = new String[pop.length];
    for (int i=0; i<pop.length; i++) {
        if (pop[i]==0) {
            n[i] = "Evan Spiegel";
        } else if (pop[i]==1) {
            n[i] = "Mark Zuckerberg";
        } else if (pop[i]==2) {
            n[i] = "Jack Dorsey";
        }
    }
    return n;
}

// Exo 2 :
// Q1 :
public static int[] invite(int[][] R, int a) {
    int[] fr1 = friends(R, a);
    int[] res = new int[R.length*2];
    int acc = 0;
    for (int i=0; i<fr1.length; i++) {
        res[acc] = fr1[i];
        acc = i+1;
    }
    int[] fr2 = new int[0];
    for (int i=0; i<fr1.length; i++) {
        fr2 = friends(R, fr1[i]);
        for (int j=0; j<fr2.length; j++) {
            res[acc] = fr2[j];
            acc = acc+1;
        }
    }
    return res;
}

// Q2 :
public static int[] strict_invite(int[][]R, int a) {
    int[][] P = new int[R.length][R.length];
    int s = 0;
    for (int i=0; i<P.length; i++) {
        for (int j=0; j<P[i].length; j++) {
            for (int k=0; k<R.length; k++) {
                s = s + (R[i][k]*R[k][j]);
            }
            P[i][j] = s;
        }
    }
    int[] t = invite(R, a);
    int[] r = new int[t.length];
    int acc = 0;
    for (int i=0; i<t.length; i++) {
        if (P[t[i]][a] >= 2) {
            r[acc] = t[i];
            acc = acc+1;
        }
    }
    return r;
}   

public static void main(String[] args) {
    // Exo 1 :
    int[][] R = CreateGraph(3);
    System.out.println(Arrays.deepToString(R));
    // System.out.println(friends_nbr(R, 1));
    // System.out.println(Arrays.toString(friends(R, 1)));
    // System.out.println(Arrays.toString(popular(R)));
    // System.out.println(Arrays.toString(common_friends(R, 0, 2)));
    // int[] t = {1,1,1,0};
    // System.out.println(Arrays.deepToString(add_user(R, t)));
    // System.out.println(Arrays.toString(popular2(R)));
    // Exo 2 :
    System.out.println(Arrays.toString(invite(R, 1)));
    System.out.println(Arrays.toString(strict_invite(R, 1)));
    // Q3 : FLEMME !
}
}