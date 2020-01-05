public class Deeler extends Igrok {


    public boolean needCards() {
        int values = this.getValueHand();
        if (values < 18) {
            return true;
        } else {
            return false;
        }
    }

}
