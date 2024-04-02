package E_3_builder;

public class Rezervare {

    private boolean isMancareInclusa;

    private boolean isScaunErgonomic;

    private boolean hasBauturaInclusa;

    private boolean hasMuzicaAmbientala;

    private boolean hasGenMuzica;

    public Rezervare(boolean isMancareInclusa, boolean isScaunErgonomic, boolean hasBauturaInclusa, boolean hasMuzicaAmbientala, boolean hasGenMuzica) {
        this.isMancareInclusa = isMancareInclusa;
        this.isScaunErgonomic = isScaunErgonomic;
        this.hasBauturaInclusa = hasBauturaInclusa;
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
        this.hasGenMuzica = hasGenMuzica;
    }

    public boolean isMancareInclusa() {
        return isMancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return isScaunErgonomic;
    }

    public boolean isHasBauturaInclusa() {
        return hasBauturaInclusa;
    }

    public boolean isHasMuzicaAmbientala() {
        return hasMuzicaAmbientala;
    }

    public boolean isHasGenMuzica() {
        return hasGenMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "isMancareInclusa=" + isMancareInclusa +
                ", isScaunErgonomic=" + isScaunErgonomic +
                ", hasBauturaInclusa=" + hasBauturaInclusa +
                ", hasMuzicaAmbientala=" + hasMuzicaAmbientala +
                ", hasGenMuzica=" + hasGenMuzica +
                '}';
    }

    public  static  class RezervareBuilder implements Builder{
        private boolean isMancareInclusa;

        private boolean isScaunErgonomic;

        private boolean hasBauturaInclusa;

        private boolean hasMuzicaAmbientala;

        private boolean hasGenMuzica;

        public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
            isMancareInclusa = mancareInclusa;
            return this;
        }

        public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
            isScaunErgonomic = scaunErgonomic;
            return this;
        }

        public RezervareBuilder setHasBauturaInclusa(boolean hasBauturaInclusa) {
            this.hasBauturaInclusa = hasBauturaInclusa;
            return this;
        }

        public RezervareBuilder setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
            this.hasMuzicaAmbientala = hasMuzicaAmbientala;
            return this;
        }

        public RezervareBuilder setHasGenMuzica(boolean hasGenMuzica) {
            this.hasGenMuzica = hasGenMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(isMancareInclusa, isScaunErgonomic, hasBauturaInclusa, hasGenMuzica, hasMuzicaAmbientala);
        }
    }
}
