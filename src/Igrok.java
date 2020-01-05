import java.util.ArrayList;
import java.util.Scanner;

public class Igrok {
    ArrayList<Card> hand = new ArrayList<>();
    private boolean isDealer = false;
    private boolean isEnd = false;
    private boolean isPobeditel = true;

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void printHand() {
        for (Card currentCard : hand) {
            System.out.printf("Карта: %s %s, %d очка", currentCard.getNominal(), currentCard.getMast(), currentCard.getValue());
            System.out.println();
        }
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public int getValueHand() {
        int summa = 0;
        for (Card currentCard : hand) {
            summa = summa + currentCard.getValue();
        }
        return summa;
    }

    public boolean isPobeditel() {
        return isPobeditel;
    }

    public void setPobeditel(boolean pobeditel) {
        isPobeditel = pobeditel;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public boolean needCards() {
        this.printHand();
        System.out.println("Раздать еще одну карту? 1/0");
        Scanner scanner = new Scanner(System.in);
        int otvet = Integer.parseInt(scanner.nextLine());
        if (otvet == 1) {
            return true;
        } else {
            return false;
        }
    }

}
