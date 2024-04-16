package proxy.main;

import proxy.classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Vanzare vanzareBilet= new VanzareBilet("El Clasico", 100);
        Persoana persoana1= new Persoana("Ioana", 12, "feminin");
        Persoana persoana2= new Persoana("Ionel", 18, "masculin");

        vanzareBilet.vanzare(persoana1);
        vanzareBilet.vanzare(persoana2);

        Vanzare proxyVanzareVarsta= new Proxy(vanzareBilet);
        proxyVanzareVarsta.vanzare(persoana1);
        proxyVanzareVarsta.vanzare(persoana2);

        Vanzare proxyGen= new ProxyGen(proxyVanzareVarsta, "feminin");

        proxyGen.vanzare(persoana1);
        proxyGen.vanzare(persoana2);
    }
}