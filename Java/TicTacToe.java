import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static final String[] board = new String[9];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the board
        Arrays.fill(board, "-");

        // Start the game
        while (true) {
            // Get the player's move
            int row = scanner.nextInt() - 1;
            int column = scanner.nextInt() - 1;

            // Check if the move is valid
            if (row < 0 || row >= 3 || column < 0 || column >= 3) {
                System.out.println("Invalid move.");
                continue;
            }
            if (!board[row * 3 + column].equals("-")) {
                System.out.println("That space is already taken.");
                continue;
            }

            // Place the player's mark on the board
            board[row * 3 + column] = scanner.next();

            // Check if the game is over
            if (isWinner(board[0], board[1], board[2])) {
                System.out.println(board[0] + " wins!");
                break;
            } else if (isWinner(board[3], board[4], board[5])) {
                System.out.println(board[3] + " wins!");
                break;
            } else if (isWinner(board[6], board[7], board[8])) {
                System.out.println(board[6] + " wins!");
                break;
            } else if (isWinner(board[0], board[3], board[6])) {
                System.out.println(board[0] + " wins!");
                break;
            } else if (isWinner(board[1], board[4], board[7])) {
                System.out.println(board[1] + " wins!");
                break;
            } else if (isWinner(board[2], board[5], board[8])) {
                System.out.println(board[2] + " wins!");
                break;
            } else if (isWinner(board[0], board[4], board[8])) {
                System.out.println(board[0] + " wins!");
                break;
            } else if (isWinner(board[2], board[4], board[6])) {
                System.out.println(board[2] + " wins!");
                break;
            } else if (isTie(board)) {
                System.out.println("The game is a tie!");
                break;
            }
        }

        scanner.close();
    }

    private static boolean isWinner(String a, String b, String c) {
        return a.equals(b) && b.equals(c) && !a.equals("-");
    }

    private static boolean isTie(String[] board) {
        for (String space : board) {
            if (space.equals("-")) {
                return false;
            }
        }
        return true;
    }
}