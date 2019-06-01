package FasiGenerazione;

import SviluppoPopolazione.EvoluzionePopolazione;
import Utility.Data;
import Grafica.MostraGrafico;

//Fase 2: maschi interagiscono tra loro e femmine interagiscono tra loro. Se due maschi o due femmine si trovano
// in casella vicine della griglia si uccidono e spariscono dalla griglia
public class Fase2 {

    public Fase2(){

        new EvoluzionePopolazione().lottaSoggetti(Data.matriceMaschi, "Maschi");
        new EvoluzionePopolazione().lottaSoggetti(Data.matriceFemmine, "Femmine");

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
