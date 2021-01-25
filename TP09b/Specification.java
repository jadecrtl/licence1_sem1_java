public class Specification {

  public static String charAtPosition(String s, int i) {
    if (i < 0 || i > s.length()) {
      return "";
    } else
      return String.valueOf(s.charAt(i));
  }

  public static int minArray(int[] arr) {
    int min = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static int[] initArray(int i) {
    int[] arr = new int[i-1];
    for (int j = 0; j < arr.length; j++) {
      arr[i] = j+1;
    }
    return arr;
  }

  public static int dichotomicSearch(int[] arr, int i) {
    int min = 0;
    int max = arr.length;
    int pos = (min + max) / 2;

    while (min != max) {
      if (arr[pos] < i) {
        min = pos;
      } else if (arr[pos] > i) {
        max = pos;
      } else {
        return pos;
      }
    }
    return -1;
  }

  public static boolean forallNotEmpty(String[] arr) {
    boolean b = false;
    for (int i = 0; i < arr.length; i++) {
      if (!"".equals(arr[i])) {
        b = true;
      }
    }
    return b;
  }

  public static boolean existsPositiveLine(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean b = false;
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] >= 0) {
          b = true;
        }
      }
      if (!b) {
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args) {
  }

}

