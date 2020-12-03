import java.util.Random;

class Main {

  static Random rand = new Random();

  public static void main(String[] args) {
    System.out.println("Hello world!");
    // Exercice 1.1
    int[][] test = CreateGraph(5);
    PrintList(test);

    // Exercice 1.2
    int temporary_user = randRange(0, test.length - 1);
    System.out.println("User " + temporary_user + " has " + friends_nbr(test, temporary_user) + " friends!");

    // Exercice 1.3
    int[] user_friends = friends(test, temporary_user);
    PrintSimpleList(user_friends);

  }

  public static int randRange(int a, int b) {
    return rand.nextInt(b - a) + a;
  }

  public static int[][] CreateGraph(int number_of_users) {
    // Structure du tableau
    int[][] database = new int[number_of_users][number_of_users];

    for (int u = 0; u < database.length; u++) {
      for (int f = 0; f < database[u].length; f++) {
        // Fill first case with 0.
        if (f == u) {
          database[u][f] = 0;
        } else {
          int is_friend = randRange(0, 2);
          database[u][f] = is_friend;
          database[f][u] = is_friend;
        }

      }

    }
    return database;
  }

  public static int friends_nbr(int[][] R, int a) {
    // return n° of friends of user a.
    int[] friends_list = R[a];
    int counter = 0;
    for (int f = 0; f < friends_list.length; f++) {
      if (friends_list[f] == 1) {
        counter++;
      }
    }
    return counter;
  }

  public static int[] friends(int[][] R, int a) {
    int number_of_friends = friends_nbr(R, a);
    int[] friends = R[a];

    if (number_of_friends == 0) {
      return new int[] {0};
    }

    int[] friends_only = new int[number_of_friends];
    int counter = 0;
    for (int f = 0; f < friends.length; f++) {
      if (friends[f] == 1) {
        friends_only[counter] = f;
        counter++;
      }

    }

    return friends_only;

  }

  public static int[] popular(int[][] R){
    int pop_threshold = 0;
    int[][] populars = new int[1][];

    for(int u=0; u<R.length; u++){
      int nb_friends = friends_nbr(R, u);
      if (nb_friends >= pop_threshold){
        pop_threshold = nb_friends;
        // à finir. - ex: 1.4
      }
    }
  }


  // Auxiliar Functions

  public static void PrintSimpleList(int[] list) {
    System.out.print("{");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i]);
    }
    System.out.print("}");
  }

  public static void PrintList(int[][] list) {
    for (int l = 0; l < list.length; l++) {
      System.out.print("{");
      for (int c = 0; c < list[l].length; c++) {
        System.out.print(list[l][c]);
      }
      System.out.print("}");
    }
    System.out.println();
  }

}
