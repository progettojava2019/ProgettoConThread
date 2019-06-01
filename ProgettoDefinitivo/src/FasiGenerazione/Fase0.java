package FasiGenerazione;

import SviluppoPopolazione.CreazionePopolazione;
import Utility.Data;
import Grafica.MostraGrafico;


//Fase 0: viene creata una popolazione iniziale composta da maschi e femmine
public class Fase0 {

    public static boolean inizioSimulazione = true;
    public static int numTribuIniziali = 1;


    public Fase0(){

        CreazionePopolazione crea = new CreazionePopolazione();
        MostraGrafico grafico = new MostraGrafico();

        int numMaschiIniziali = 25;
        int numFemmineIniziali = 24;

        double numMaxIndividuiIniziali = Math.pow( (double) ((Data.valMassimoControllato - Data.valMinimoControllato)/Data.squareDimension + 1), 2);
        if(numMaschiIniziali+numFemmineIniziali < numMaxIndividuiIniziali) {
            crea.creaSoggetti(Data.matriceMaschi, numMaschiIniziali);
            crea.creaSoggetti(Data.matriceFemmine, numFemmineIniziali);
            inizioSimulazione = false;//Da qui in poi non uso più il random controllato
        }
        else {
            System.out.println("Hai inserito troppi individui iniziali!! Il numero massimo consetito è: " + numMaxIndividuiIniziali);
        }

        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);
        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);
    }
}
