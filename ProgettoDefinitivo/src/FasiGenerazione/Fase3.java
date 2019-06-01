package FasiGenerazione;

import SviluppoPopolazione.EvoluzionePopolazione;
import Utility.Data;
import Grafica.MostraGrafico;

//Fase 3: i figli diventano maschi o femmini in maniera random, con la stessa probabilità
public class Fase3 {


    public Fase3(){

        new EvoluzionePopolazione().crescitaFigli(Data.matriceFigli);

        //Disegna su un nuovo frame
        MostraGrafico grafico = new MostraGrafico();
        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);
        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);
        grafico.riempiGrafico(Data.matriceFigli, "Figli", Data.frame);

    }
}
