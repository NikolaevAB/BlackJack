public class Card {
    private String nominal;
    private String mast;
    private int value;

    public Card() {
    }

    public Card(String nominal, String mast, int value) {
        this.nominal = nominal;
        this.mast = mast;
        this.value = value;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getValue() != card.getValue()) return false;
        if (getNominal() != null ? !getNominal().equals(card.getNominal()) : card.getNominal() != null) return false;
        return getMast() != null ? getMast().equals(card.getMast()) : card.getMast() == null;
    }

    @Override
    public int hashCode() {
        int result = getNominal() != null ? getNominal().hashCode() : 0;
        result = 31 * result + (getMast() != null ? getMast().hashCode() : 0);
        result = 31 * result + getValue();
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "nominal='" + nominal + '\'' +
                ", mast='" + mast + '\'' +
                ", value=" + value +
                '}';
    }
}
