import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Symbols
            List<Symbol> symbols = new ArrayList<>();
            symbols.add(new Symbol("Cherry", 2));
            symbols.add(new Symbol("Lemon", 3));
            symbols.add(new Symbol("Bell", 5));
            symbols.add(new Symbol("Seven", 10));

            Player player = new Player(100);
            SlotMachine slotMachine = new SlotMachine(symbols);

            System.out.println("🎰 Welcome to Slot Machine!");

            while (true) {
                System.out.println("\nBalance: " + player.getBalance());
                System.out.print("Enter bet (0 to exit): ");

                int bet = sc.nextInt();

                if (bet == 0) {
                    System.out.println("Game Over!");
                    break;
                }

                if (bet > player.getBalance()) {
                    System.out.println("Not enough balance!");
                    continue;
                }

                player.bet(bet);

                Symbol[] result = slotMachine.spin();

                System.out.println("Result: " + Arrays.toString(result));

                int winnings = slotMachine.checkWin(result, bet);
                player.win(winnings);
            }
        }
    }
}