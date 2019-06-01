package Grafica;

import Grafica.Soggetti.Soggetto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static Utility.Data.*;

public class Pannello extends JPanel {

    private List<Soggetto> soggetto;

    public Pannello() {
        soggetto = new ArrayList<>();

    }

    public void add(Soggetto s){
        soggetto.add(s);
        repaint();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);

        //linee verticali della griglia
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i <= frameWidth; i += squareDimension) {
            g.drawLine(i, 0, i, frameHeigth-squareDimension);
        }
        //linee orizzontali della griglia
        for (int j = 0; j <= frameHeigth-squareDimension; j += squareDimension) {
            g.drawLine(0, j, frameWidth-squareDimension, j);
        }


       try {
            for (Soggetto s : soggetto) {
                s.Disegna(g);
            }
       }catch (Exception e){
        }

    }

}
