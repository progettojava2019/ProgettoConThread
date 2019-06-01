package Grafica.Soggetti;

import Utility.Data;

import java.awt.*;

public class Femmina implements Soggetto {

    private int x;
    private int y;
    //private int dimension;

    public Femmina(int x, int y /*, int dimension*/){
        this.x = x;
        this.y = y;
        //this.dimension = dimension;
    }

    @Override
    public void Disegna(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x, y, Data.squareDimension, Data.squareDimension/*dimension, dimension*/);
    }
}
