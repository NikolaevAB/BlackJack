import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Igrok> igroks = new ArrayList<>();
    private KolodaCards cards;

    public KolodaCards getCards() {
        return cards;
    }

    public void setCards(KolodaCards cards) {
        this.cards = cards;
    }

    public void addIgrok(Igrok igrok) {
        igroks.add(igrok);
    }

    public void doFirstHand() {
        for (int i = 0; i < 2; i++) {
            for (Igrok currentIgrok : igroks) {
                Card rundomCard = cards.getRandomCard();
                currentIgrok.addCardToHand(rundomCard);
            }
        }
    }

    public void printAll() {
        for (Igrok currentIgrok : igroks) {
            System.out.println("------------------------");
            currentIgrok.printHand();
            System.out.println("------------------------");
        }
    }

    public void doRound() {
        for (Igrok currentIgrok : igroks) {
            if (!currentIgrok.isDealer()) {
                if (currentIgrok.needCards()) {
                    Card card = cards.getRandomCard();
                    currentIgrok.addCardToHand(card);
                } else {
                    currentIgrok.setEnd(true);
                }
            }
        }
        if (needToNewRound()) {
            doRound();
        } else {
            addCartsToDealer();
            printPobeditel();
        }

    }

    private boolean needToNewRound() {
        for (Igrok currentIgrok : igroks) {
            if (!currentIgrok.isDealer() && !currentIgrok.isEnd()) {
                return true;
            }

        }
        return false;
    }

    private void printPobeditel() {
        for (Igrok currentIgrok : igroks) {
            if (currentIgrok.getValueHand() > 21) {
                currentIgrok.setPobeditel(false);
            }
        }
        if (getCountNotLooser() == 1) {
            printFinal();
            return;
        }
        if (getCountNotLooser() == 0) {
            printDealer();
            return;
        }
        printMaxValueHand();
    }

    private void printMaxValueHand() {
        Igrok pobeditel = null;
        for (Igrok currentIgrok : igroks) {
            if (currentIgrok.isPobeditel()) {
                if (pobeditel == null) {
                    pobeditel = currentIgrok;
                } else {
                    if (pobeditel.getValueHand() < currentIgrok.getValueHand()) {
                        pobeditel = currentIgrok;
                    }
                }
            }
        }
        System.out.println("-------- ПОБЕДИТЕЛЬ !!!!! ------------");
        pobeditel.printHand();

    }

    private void printDealer() {
        for (Igrok currentIgrok : igroks) {
            if (currentIgrok.isDealer()) {
                System.out.println("-------- ПОБЕДИТЕЛЬ КРУПЬЕ ------------");
                currentIgrok.printHand();
            }
        }
    }


    private void printFinal() {
        for (Igrok currentIgrok : igroks) {
            if (currentIgrok.isPobeditel()) {
                System.out.println("--------------- ПОБЕДИТЕЛЬ ------------");
                currentIgrok.printHand();
            }
        }
    }

    private int getCountNotLooser() {
        int summa = 0;
        for (Igrok currentIgrok : igroks) {
            if (currentIgrok.isPobeditel()) {
                summa++;
            }
        }
        return summa;
    }

    private void addCartsToDealer() {
        for (Igrok currentIgrok : igroks) {
            if (currentIgrok.isDealer()) {
                if (currentIgrok.needCards()) {
                    Card card = cards.getRandomCard();
                    currentIgrok.addCardToHand(card);
                    /*if (currentIgrok.needCards()) {
                        addCartsToDealer();
                    }*/

                }

            }
        }
    }


}
