package builder_v3_2_B;

public class Rezervare {

    private boolean locGeam;

    private boolean scauneErgonomice;

    private boolean decorareaMesei;

    private boolean muzicaAmbientala;

    private String genMuzica;

    public Rezervare(boolean locGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientala, String genMuzica) {
        this.locGeam = locGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public boolean isLocGeam() {
        return locGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public boolean isDecorareaMesei() {
        return decorareaMesei;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare are urmatoarele caracteristici" +
                "locGeam=" + locGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'';
    }

    public static class RezervareBuilder implements Builder {
        private boolean locGeam;

        private boolean scauneErgonomice;

        private boolean decorareaMesei;

        private boolean muzicaAmbientala;

        private String genMuzica;


        public RezervareBuilder setLocGeam(boolean locGeam) {
            this.locGeam = locGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
            this.decorareaMesei = decorareaMesei;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
            this.muzicaAmbientala = muzicaAmbientala;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }


        @Override
        public Rezervare build() {
            if (muzicaAmbientala == true) {
                return new Rezervare(locGeam, scauneErgonomice, decorareaMesei, muzicaAmbientala, genMuzica);
            } else {
                return new Rezervare(locGeam, scauneErgonomice, decorareaMesei, muzicaAmbientala, null);
            }
        }
    }
}
