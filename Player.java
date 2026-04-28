public class Player {
    private int balance;

    public Player(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void bet(int amount) {
        balance -= amount;
    }

    public void win(int amount) {
        balance += amount;
    }
}