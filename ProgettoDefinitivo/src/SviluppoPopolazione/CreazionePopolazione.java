package SviluppoPopolazione;

import FasiGenerazione.Fase0;
import Utility.Data;
import Utility.Matrice;
import Utility.MatriceSceriffo;
import Utility.Random;

public class CreazionePopolazione {

    private CreazioneTribu cT = new CreazioneTribu();

    public Matrice creaSoggetti(Matrice mat, int numSoggetti){

        MatriceSceriffo matriceSceriffo = new MatriceSceriffo();

        for(int i = 0; i < numSoggetti; i++){

            int x=0, y=0;
            if(Fase0.inizioSimulazione){
                if(Fase0.numTribuIniziali == 1) {
                    x = new Random().randomizza(0, Data.frameWidth / 12);
                    y = new Random().randomizza(0, Data.frameHeigth / 6);
                }
                else if(Fase0.numTribuIniziali == 2){
                    x = new Random().randomizza(0, Data.frameWidth / 12);
                    y = new Random().randomizza(0, Data.frameHeigth / 6);

                }
                else if(Fase0.numTribuIniziali == 5)
                {
                    //x = new Random().randomizza(Data.frameWidth/2-4*Data.squareDimension,Data.frameWidth/2+4*Data.squareDimension);
                    //y = new Random().randomizza(Data.frameHeigth/2-4*Data.squareDimension,Data.frameHeigth/2+4*Data.squareDimension);

                }
            } else{
                x = new Random().randomizza(0, Data.frameWidth);
                y = new Random().randomizza(0, Data.frameWidth);
            }

            boolean controllore = true;
            if(matriceSceriffo.getnRigheComplete() != 0){
                controllore = new MatriceSceriffo().controlla(x, y, controllore);
            }
            if(controllore){
                mat.addRiga(x, y);
                matriceSceriffo.addRiga(x,y);
            } else{
                //System.out.println("Sono uno sceriffo e ho fatto il mio lavoro");
                i -= 1;
            }
        }

        return mat;
    }



}