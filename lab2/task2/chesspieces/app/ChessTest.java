package lab2.task2.chesspieces.app;
import lab2.task2.chesspieces.model.*;
import java.util.Scanner;

public class ChessTest {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.drawBoard();
            System.out.println("Enter move (startX startY endX endY) or exit :");
            String input = scanner.nextLine();
            
            if (input.equals("exit")) break;

            String[] parts = input.split(" ");
            int x1 = Integer.parseInt(parts[0]);
            int y1 = Integer.parseInt(parts[1]);
            int x2 = Integer.parseInt(parts[2]);
            int y2 = Integer.parseInt(parts[3]);

            if (board.movePiece(new Position(x1, y1), new Position(x2, y2))) {
                System.out.println("Move successful!");
            } else {
                System.out.println("Illegal move! Try again.");
            }
        }
        scanner.close();
    }
}
