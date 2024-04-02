package C_2_factory_method;

import C_2_factory_method.factories.FabricaBody;
import C_2_factory_method.factories.FabricaDurere;
import C_2_factory_method.factories.FabricaMedicamente;
import C_2_factory_method.factories.FabricaRaceala;

public class Main {

    public static void main(String[] args) throws Exception {

        FabricaMedicamente fabricaBody= new FabricaBody();
        FabricaMedicamente fabricaDurere= new FabricaDurere();
        FabricaMedicamente fabricaRaceala= new FabricaRaceala();

        MedicamentFarmacie body= fabricaBody.createMedicament("Crema corp", 10);

        MedicamentFarmacie duerere= fabricaDurere.createMedicament("Mediduerere", 11);

        MedicamentFarmacie raceala= fabricaRaceala.createMedicament("Mediraceala", 12);

        body.afisareDetalii();
        duerere.afisareDetalii();
        raceala.afisareDetalii();

    }

}
