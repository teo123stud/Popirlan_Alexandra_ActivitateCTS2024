package C_3_builder;

public class Factura {
    private int nrPungi;

    private boolean isPlataCuCard;

    private  boolean isCardFidelitate;

    private int cotaTVA;

    public Factura(int nrPungi, boolean isPlataCuCard, boolean isCardFidelitate, int cotaTVA) {
        this.nrPungi = nrPungi;
        this.isPlataCuCard = isPlataCuCard;
        this.isCardFidelitate = isCardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public int getNrPungi() {
        return nrPungi;
    }

    public boolean isPlataCuCard() {
        return isPlataCuCard;
    }

    public boolean isCardFidelitate() {
        return isCardFidelitate;
    }

    public int getCotaTVA() {
        return cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nrPungi=" + nrPungi +
                ", isPlataCuCard=" + isPlataCuCard +
                ", isCardFidelitate=" + isCardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }

    public static class FacturaBuilder implements Builder{
        private int nrPungi;

        private boolean isPlataCuCard;

        private  boolean isCardFidelitate;

        private int cotaTVA;

        public FacturaBuilder() {
            this.nrPungi = 0;
            this.isPlataCuCard = false;
            this.isCardFidelitate = false;
            this.cotaTVA = 0;
        }

        public FacturaBuilder setNrPungi(int nrPungi) {
            this.nrPungi = nrPungi;
            return this;
        }

        public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
            isPlataCuCard = plataCuCard;
            return this;
        }

        public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
            isCardFidelitate = cardFidelitate;
            return this;
        }

        public FacturaBuilder setCotaTVA(int cotaTVA) {
            this.cotaTVA = cotaTVA;
            return this;
        }

        @Override
        public Factura build() {
            return new Factura(nrPungi, isPlataCuCard, isCardFidelitate, cotaTVA);
        }
    }
}
