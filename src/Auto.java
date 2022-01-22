public class Auto {
    protected String marka;
    protected String model;
    protected String silnik;
    protected int cena;
    private boolean czyDostepny;

    public Auto() {
        this.marka = "";
        this.model = "";
        this.silnik = "";
        this.cena = 0;
        czyDostepny = true;

    }

    public Auto(String marka, String model, String silnik, int cena) {
        this.marka = marka;
        this.model = model;
        this.silnik = silnik;
        this.cena = cena;
        czyDostepny = true;
    }

    public String getMarka() {
        return marka;
    }
    public String getModel() {
        return model;
    };
    public String getSilnik() {
        return silnik;
    }
    public int getCena() {
        return cena;
    }
    public boolean isCzyDostepny() {
        return czyDostepny;
    }

    public void setMarka() {
        this.marka = marka;
    }
    public void setModel() {
        this.model = model;
    }
    public void setSilnik() {
        this.silnik = silnik;
    }
    public void setCena() {
        this.cena = cena;
    }
    public void setCzyDostepny() {
        this.czyDostepny = czyDostepny;
    }

    protected int wyliczCeneAuta() {
        return this.cena;
    }

    @Override
    public String toString() {
        return "Auto:\n" +
                "Marka: " + marka +
                "\nModel: " + model +
                "\nPojemnosc silnika: " + silnik + " cm3" +
                "\nCena podstawowa: " + cena +
                " zł.\nDostepnosc auta: " + (czyDostepny ? "dostepny" : "niedostepny");
    }

}
