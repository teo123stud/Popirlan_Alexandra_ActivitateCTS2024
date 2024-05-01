package subject;

public class Stadion extends Subject{
    @Override
    public void notificaFotbal() {
        super.trimiteNotificare(" Azi are loc un meci de fotbal pe stadion !");
    }

    @Override
    public void notificaVolei() {
        super.trimiteNotificare(" Va avea loc un meci de volei pe stadion !");
    }

    @Override
    public void notificaHandbal() {
        super.trimiteNotificare(" Pe stadion are loc un meci de handbal feminin!!");
    }


    public void notificaConcert() {
        super.trimiteNotificare(" Azi va avea loc concertul lui Justin Bieber pe stadion!");
    }
}
