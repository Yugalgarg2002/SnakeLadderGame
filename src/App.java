import java.util.HashMap;
import java.util.Scanner;

import player.Player;
import board.Board;
import coordinates.Coordinates;
import dice.Dice;
import jumper.Jumper;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String, Jumper> map = new HashMap<>();
        map.put("6", new Jumper(new Coordinates(9, 5), new Coordinates(6, 6)));
        map.put("97", new Jumper(new Coordinates(0, 1), new Coordinates(9, 9)));
        map.put("21", new Jumper(new Coordinates(7, 0), new Coordinates(0, 9)));
        map.put("64", new Jumper(new Coordinates(3, 3), new Coordinates(7, 4)));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Player-1 Details:");
        System.out.print("Name: ");
        String p_name = scan.nextLine();

        Player p1 = new Player(p_name);
        System.out.println("-------------------------");
        System.out.println("Enter Player-2 Details:");
        System.out.print("Name: ");
        p_name = scan.nextLine();

        Player p2 = new Player(p_name);

        Board b = new Board(10, map);
        b.printBoard();

        Game game = new Game(b, new Player[] { p1, p2 }, new Dice());
        game.play();

    }
}
