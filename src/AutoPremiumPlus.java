public class AutoPremiumPlus extends AutoPremium {
    protected int cenaCzujnikiParkowania;

    public AutoPremiumPlus() {
        super();
        this.cenaCzujnikiParkowania = 0;
    }

    public AutoPremiumPlus(int cenaCzujnikiParkowania) {
        this.cenaCzujnikiParkowania = cenaCzujnikiParkowania;
    }

    public AutoPremiumPlus(String marka, String model, String silnik, int cena, int cenaKolor, int cenaCzujnikiParkowania) {
        super(marka, model, silnik, cena, cenaKolor);
        this.cenaCzujnikiParkowania = cenaCzujnikiParkowania;
    }

    @Override
    protected int wyliczCeneAuta() {
        return super.wyliczCeneAuta() + cenaCzujnikiParkowania;
    }

    @Override
    public String toString() {
        return "Plus "+
                super.toString() +
                "\nDodatkowa cena za czujniki parkowania: " + cenaCzujnikiParkowania;
    }

}
