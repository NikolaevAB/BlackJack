import java.util.concurrent.ThreadLocalRandom;

public class KolodaCards {
    private Card[] kolodaCards = new Card[52];


    public void podgotovitCardsToGame() {
        Card card1 = new Card("двойка", "трефа", 2);
        Card card2 = new Card("двойка", "бубна", 2);
        Card card3 = new Card("двойка", "черви", 2);
        Card card4 = new Card("двойка", "пика", 2);

        Card card5 = new Card("тройка", "трефа", 3);
        Card card6 = new Card("тройка", "бубна", 3);
        Card card7 = new Card("тройка", "черви", 3);
        Card card8 = new Card("тройка", "пика", 3);

        Card card9 = new Card("четверка", "трефа", 4);
        Card card10 = new Card("четверка", "бубна", 4);
        Card card11 = new Card("четверка", "черви", 4);
        Card card12 = new Card("четверка", "пика", 4);

        Card card13 = new Card("пятерка", "трефа", 5);
        Card card14 = new Card("пятерка", "бубна", 5);
        Card card15 = new Card("пятерка", "черви", 5);
        Card card16 = new Card("пятерка", "пика", 5);

        Card card17 = new Card("шестерка", "трефа", 6);
        Card card18 = new Card("шестерка", "бубна", 6);
        Card card19 = new Card("шестерка", "черви", 6);
        Card card20 = new Card("шестерка", "пика", 6);

        Card card21 = new Card("семерка", "трефа", 7);
        Card card22 = new Card("семерка", "бубна", 7);
        Card card23 = new Card("семерка", "черви", 7);
        Card card24 = new Card("семерка", "пика", 7);

        Card card25 = new Card("восьмерка", "трефа", 8);
        Card card26 = new Card("восьмерка", "бубна", 8);
        Card card27 = new Card("восьмерка", "черви", 8);
        Card card28 = new Card("восьмерка", "пика", 8);

        Card card29 = new Card("девятка", "трефа", 9);
        Card card30 = new Card("девятка", "бубна", 9);
        Card card31 = new Card("девятка", "черви", 9);
        Card card32 = new Card("девятка", "пика", 9);

        Card card33 = new Card("десятка", "трефа", 10);
        Card card34 = new Card("десятка", "бубна", 10);
        Card card35 = new Card("десятка", "черви", 10);
        Card card36 = new Card("десятка", "пика", 10);

        Card card37 = new Card("валет", "трефа", 10);
        Card card38 = new Card("валет", "бубна", 10);
        Card card39 = new Card("валет", "черви", 10);
        Card card40 = new Card("валет", "пика", 10);

        Card card41 = new Card("дама", "трефа", 10);
        Card card42 = new Card("дама", "бубна", 10);
        Card card43 = new Card("дама", "черви", 10);
        Card card44 = new Card("дама", "пика", 10);

        Card card45 = new Card("король", "трефа", 10);
        Card card46 = new Card("король", "бубна", 10);
        Card card47 = new Card("король", "черви", 10);
        Card card48 = new Card("король", "пика", 10);

        Card card49 = new Card("туз", "трефа", 11);
        Card card50 = new Card("туз", "бубна", 11);
        Card card51 = new Card("туз", "черви", 11);
        Card card52 = new Card("туз", "пика", 11);

        kolodaCards[0] = card1;
        kolodaCards[1] = card2;
        kolodaCards[2] = card3;
        kolodaCards[3] = card4;
        kolodaCards[4] = card5;

        kolodaCards[5] = card6;
        kolodaCards[6] = card7;
        kolodaCards[7] = card8;
        kolodaCards[8] = card9;
        kolodaCards[9] = card10;

        kolodaCards[10] = card11;
        kolodaCards[11] = card12;
        kolodaCards[12] = card13;
        kolodaCards[13] = card14;
        kolodaCards[14] = card15;

        kolodaCards[15] = card16;
        kolodaCards[16] = card17;
        kolodaCards[17] = card18;
        kolodaCards[18] = card19;
        kolodaCards[19] = card20;

        kolodaCards[20] = card21;
        kolodaCards[21] = card22;
        kolodaCards[22] = card23;
        kolodaCards[23] = card24;
        kolodaCards[24] = card25;

        kolodaCards[25] = card26;
        kolodaCards[26] = card27;
        kolodaCards[27] = card28;
        kolodaCards[28] = card29;
        kolodaCards[29] = card30;

        kolodaCards[30] = card31;
        kolodaCards[31] = card32;
        kolodaCards[32] = card33;
        kolodaCards[33] = card34;
        kolodaCards[34] = card35;

        kolodaCards[35] = card36;
        kolodaCards[36] = card37;
        kolodaCards[37] = card38;
        kolodaCards[38] = card39;
        kolodaCards[39] = card40;

        kolodaCards[40] = card41;
        kolodaCards[41] = card42;
        kolodaCards[42] = card43;
        kolodaCards[43] = card44;
        kolodaCards[44] = card45;

        kolodaCards[45] = card46;
        kolodaCards[46] = card47;
        kolodaCards[47] = card48;
        kolodaCards[48] = card49;
        kolodaCards[49] = card50;

        kolodaCards[50] = card51;
        kolodaCards[51] = card52;

    }


    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return kolodaCards[randomNum];
    }
}
