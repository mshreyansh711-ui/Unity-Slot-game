import java.util.ArrayList;
import java.util.List;

public class SlotMachine {

    private final List<Reel> reels = new ArrayList<>();

    public SlotMachine(List<Symbol> symbols) {
        // Create 3 reels
        for (int i = 0; i < 3; i++) {
            reels.add(new Reel(symbols));
        }
    }

    public Symbol[] spin() {
        Symbol[] result = new Symbol[3];

        System.out.println("Spinning...");

        // Simulate animation delay
        for (int i = 0; i < reels.size(); i++) {
            try {
                Thread.sleep(500); // animation effect
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Spin interrupted");
            }

            result[i] = reels.get(i).spin();
            System.out.println("Reel " + (i + 1) + ": " + result[i]);
        }

        return result;
    }

    public int checkWin(Symbol[] result, int bet) {
        // Win condition: all symbols same
        if (result[0].getName().equals(result[1].getName()) &&
            result[1].getName().equals(result[2].getName())) {

            int payout = result[0].getPayout() * bet;
            System.out.println("🎉 JACKPOT! You won: " + payout);
            return payout;
        }

        System.out.println("❌ No win");
        return 0;
    }
}