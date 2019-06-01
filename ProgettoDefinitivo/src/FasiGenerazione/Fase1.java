package FasiGenerazione;

import SviluppoPopolazione.EvoluzionePopolazione;
import Utility.Data;
import Grafica.MostraGrafico;

//Fase 1: maschi e femmine interagiscono. Se posti in casella vicine della griglia generano figli
public class Fase1 {

    public Fase1(){

        new EvoluzionePopolazione().nascitaFigli(Data.matriceMaschi, Data.matriceFemmine);

        //Disegna su un nuovo frame
        MostraGrafico grafico = new MostraGrafico();
        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);
        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);
        grafico.riempiGrafico(Data.matriceFigli, "Figli", Data.frame);

        //DIsegna sullo stesso frame
        /*g0D.riempiGrafico(matriceMaschi, "Maschi");
        g0D.riempiGrafico(matriceFemmine, "Femmine");
        g0D.riempiGrafico(matriceFigli, "Figli");*/


    }
}
