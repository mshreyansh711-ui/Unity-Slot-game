public class Symbol {
    private String name;
    private int payout;

    public Symbol(String name, int payout) {
        this.name = name;
        this.payout = payout;
    }

    public String getName() {
        return name;
    }

    public int getPayout() {
        return payout;
    }

    @Override
    public String toString() {
        return name;
    }
}