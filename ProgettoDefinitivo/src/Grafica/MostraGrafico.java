package Grafica;

import Grafica.Soggetti.Femmina;
import Grafica.Soggetti.Figlio;
import Grafica.Soggetti.Maschio;
import Utility.Matrice;

import javax.swing.*;
import java.awt.*;

public class MostraGrafico {

    private Pannello pannello = new Pannello();

    public void riempiGrafico(Matrice mat, String str, MyFrame fr){

        Container c = fr.getContentPane();

        for(int i = 0; i < mat.getnRigheComplete(); i++)
        {
            if(str.equals("Maschi")) {
                Maschio maschio = new Maschio(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.add(maschio);
            }
            else if (str.equals("Femmine")){
                Femmina femmina = new Femmina(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.add(femmina);
            }
            else if(str.equals("Figli")){
                Figlio figlio = new Figlio(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.add(figlio);
            }
        }

        c.add(pannello);

        fr.setVisible(true);//lo imposto visible in questo metodo altrimenti me lo mostra prima del frame bottoni
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
