import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.function.Function;

import tests.*;

public class Tests {
    public static void main(String[] args) throws FileNotFoundException {

        int[][] S = Parser.sudoku("tests/data/grilles/1");
        int[][] S_transposed = Parser.sudoku("tests/data/grilles/1.transposed");
        int[][] S_solved = Parser.sudoku("tests/data/grilles/1.solved");

        System.out.print("Dans les tests, on appelle S la grille de sudoku suivante :");
        System.out.print(printSudoku(S));

        Function<int[][], String> sudoku_pp = G -> G == S ? "S" : printSudoku(G);

        System.out.println("\n====Ex1====\n");

        var q11 = new BiTest<Integer, Boolean, boolean[]>();
        q11.output_pp = Tests::bitsOfArray;
        q11.eq = Arrays::equals;
        q11.add(10, false, arrayOfBits("0000000000"));
        q11.run(Exos::initBoolArray, "initBoolArray");

        var q12 = new BiTest<boolean[], boolean[], Boolean>();
        q12.input1_pp = Tests::bitsOfArray;
        q12.input2_pp = Tests::bitsOfArray;
        q12.add(arrayOfBits("010"), arrayOfBits("0"), false);
        q12.add(arrayOfBits("010"), arrayOfBits("110"), false);
        q12.add(arrayOfBits("01011"), arrayOfBits("01011"), true);
        q12.run(Exos::equalsBoolArray, "equalsBoolArray");

        var q13 = new Test<int[][], int[][]>();
        q13.input_pp = sudoku_pp;
        q13.output_pp = sudoku_pp;
        q13.eq = Tests::sudokuEquals;
        q13.add(S, S_transposed);
        q13.run(Exos::transpose, "transpose");

        System.out.println("\n====Ex2====\n");

        var q21 = new BiTest<int[][], Integer, boolean[]>();
        q21.input1_pp = sudoku_pp;
        q21.output_pp = Tests::bitsOfArray;
        q21.eq = Arrays::equals;
        q21.add(S, 0, arrayOfBits("0100010111"));
        q21.run(Exos::chiffresLigne, "chiffresLigne");

        var q22 = new BiTest<int[][], Integer, boolean[]>();
        q22.input1_pp = sudoku_pp;
        q22.output_pp = Tests::bitsOfArray;
        q22.eq = Arrays::equals;
        q22.add(S, 0, arrayOfBits("0010000101"));
        q22.run(Exos::chiffresColonne, "chiffresColonne");

        var q23 = new BiTest<int[][], Pair<Integer, Integer>, boolean[]>();
        q23.input1_pp = sudoku_pp;
        q23.output_pp = Tests::bitsOfArray;
        q23.eq = Arrays::equals;
        q23.add(S, new Pair<Integer, Integer>(0, 0), arrayOfBits("0001010111"));
        q23.add(S, new Pair<Integer, Integer>(4, 5), arrayOfBits("0100101100"));
        q23.add(S, new Pair<Integer, Integer>(8, 8), arrayOfBits("0100110011"));
        q23.run((s, p) -> Exos.chiffresCarre(s, p.fst, p.snd), "chiffresCarre");

        System.out.println("\n====Ex3====\n");

        var q31 = new Test<int[][], Boolean>();
        q31.input_pp = sudoku_pp;
        q31.add(S, false);
        q31.add(S_solved, true);
        q31.run(Exos::isSolution, "isSolution");
    }

    /*************************************************************/
    /* NE PAS MODIFIER */
    /*************************************************************/

    public static boolean sudokuEquals(int[][] S1, int[][] S2) {
        return IntStream.range(0, S1.length).allMatch(i -> Arrays.equals(S1[i], S2[i]));
    }

    public static boolean[] arrayOfBits(String bs) {
        boolean[] res = new boolean[bs.length()];
        for (int i = 0; i < bs.length(); i++) {
            res[i] = bs.charAt(i) == '1';
        }
        return res;
    }

    public static String bitsOfArray(boolean[] bs) {
        String res = "";
        for (int i = 0; i < bs.length; i++) {
            res += bs[i] ? "1" : "0";
        }
        return res;
    }

    public static String lineOf(int n, String s) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += s;
        }
        return res + "\n";
    }

    public static String strOfCase(int valeur) {
        if (valeur == 0) {
            return ".";
        }
        return String.valueOf(valeur);
    }

    public static String printSudoku(int[][] S) {
        String res = "\n";
        String line = lineOf(25, "-");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                res += line;
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) {
                    if (j > 0) {
                        res += " ";
                    }
                    res += "|";
                }
                res += " " + strOfCase(S[i][j]);
            }
            res += " |\n";
        }
        res += line;
        return res;
    }

    public static void dumpSudoku(int[][] S) {
        String res = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                res += S[i][j] + " ";
                if (j % 3 == 2) {
                    res += "  ";
                }
            }
            res += "\n";
            if (i % 3 == 2) {
                res += "\n";
            }
        }
        System.out.print(res);
    }
}
