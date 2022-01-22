public class AutoPremium extends Auto {
    protected int cenaKolor;

    public AutoPremium() {
        super();
        this.cenaKolor = 0;
    }

    public AutoPremium(int cenaKolor) {
        this.cenaKolor = cenaKolor;
    }

    public AutoPremium(String marka, String model, String silnik, int cena, int cenaKolor) {
        super(marka, model, silnik, cena);
        this.cenaKolor = cenaKolor;
    }

    @Override
    protected int wyliczCeneAuta() {
        return super.wyliczCeneAuta() + cenaKolor;
    }

    @Override
    public String toString() {
        return "Premium " +
                super.toString() +
                "\nDodatkowa cena za kolor: " + cenaKolor + " zł.";
    }

}
