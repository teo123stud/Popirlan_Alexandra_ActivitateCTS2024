package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observatori;

    public Subject() {
        this.observatori = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        observatori.add(observer);
    }

    public void stergeAbonat(Observer observer){
        observatori.remove(observer);
    }

    public void trimiteNotificare(String mesaj){
        for(Observer observer: observatori){
            observer.primesteNotificare("Sala: "+ mesaj);
        }
    }

    public abstract void notificaFotbal();

    public abstract void notificaVolei();

    public abstract void notificaHandbal();


}
