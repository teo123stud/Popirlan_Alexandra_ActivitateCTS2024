package subject;

import observer.Observer;

import java.util.List;

public class Sala extends Subject{


    @Override
    public void notificaFotbal() {
        String mesaj=" Va avea loc un meci de fotbal in data de 23.04.2023, ora 12:00";
        super.trimiteNotificare(mesaj);
    }

    @Override
    public void notificaVolei() {
        String mesaj=" Va avea loc un meci de volei in data de 24.04.2023, ora 14:00";
        super.trimiteNotificare(mesaj);
    }

    @Override
    public void notificaHandbal() {
        String mesaj=" Va avea loc un meci de handbal in data de 27.04.2023, ora 19:00";
        super.trimiteNotificare(mesaj);
    }
}
