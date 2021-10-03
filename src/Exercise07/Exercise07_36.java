package Exercise07;
/*) @Author HARSH PATEL (20CS050)
*A Latin square is an n-by-n array filled with n different Latin let?ters,
*each occurring exactly once in each row and once in each column.
*Write program that prompts the user to enter the number n and the array of characters,
*as shown in the sample output, and checks if the input array is a Latin square.
*The characters are the first n characters starting from A.
*/
import java.util.Scanner;
public class Exercise07_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number n: ");
        int n = input.nextInt();
        char[][] m = new char[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.next().charAt(0);
            }
        }
        System.out.println(checkLatinSquare(m));
    }
    public static boolean checkLatinSquare(char[][] m) {
        // first check if user enter a  valid letters
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (!isValidLetter(m[i][j], m.length)) {
                    System.out.println("Your input is wrong");
                    System.out.println("n = " + m.length +
                            " your letter range is " + 'A' + "-" +(char)('A' + m.length - 1));
                    return false;
                }
            }
        }
        // check if every row has unique letters
        for (int i = 0; i < m.length; i++) {
            if (!isRowValid(m, i)) return false;
        }
        // check if every column has unique letters
        for (int j = 0; j < m[0].length; j++) {
            if (!isColumnValid(m,j)) return false;
        }
        return true;
    }
    public static boolean isColumnValid(char[][] m, int column) {

        boolean[] hasBeenUsed = new boolean[m.length];

        for (int i = 0; i < m.length; i++) {

            int index = m[i][column] - 'A';

            if (hasBeenUsed[index]) {
                return false;
            } else {
                hasBeenUsed[index] = true;
            }
        }
        return true;
    }
    public static boolean isRowValid(char[][] m, int row) {

        boolean[] hasBeenUsed = new boolean[m.length];

        for (int j = 0; j < m[row].length; j++) {

            int index = m[row][j] - 'A';

            if (hasBeenUsed[index]) {
                return false;
            } else {
                hasBeenUsed[index] = true;
            }
        }

        return true;
    }
    public static void displayMatrix(char[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }
    }
    public static boolean isValidLetter(char ch, int n) {
        // character starts from A, so subtract 1 from n
        n--;
        return (ch >= 'A' && ch <= 'A' + n);
    }
}