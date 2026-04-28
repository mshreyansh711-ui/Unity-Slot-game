import java.util.List;

public class Reel {
    private final List<Symbol> symbols;

    public Reel(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public Symbol spin() {
        int index = java.util.concurrent.ThreadLocalRandom.current().nextInt(symbols.size());
        return symbols.get(index);
    }
}