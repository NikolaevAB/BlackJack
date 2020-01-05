public class Main {
    public static void main(String[] args) {
        KolodaCards cards = new KolodaCards();
        cards.podgotovitCardsToGame();

        Igrok igrok = new Igrok();
        Deeler deeler = new Deeler();
        deeler.setDealer(true);

        Game game = new Game();
        game.addIgrok(igrok);
        game.addIgrok(deeler);
        game.setCards(cards);
        game.doFirstHand();


        game.doRound();


    }
}
