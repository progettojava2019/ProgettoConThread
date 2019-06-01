package Grafica.Soggetti;

import Utility.Data;

import java.awt.*;

public class Maschio implements Soggetto {

    private int x;
    private int y;
    //private int dimension;

    public Maschio(int x, int y /*, int dimension*/){
        this.x = x;
        this.y = y;
        //this.dimension = dimension;
    }

    @Override
    public void Disegna(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x, y, Data.squareDimension, Data.squareDimension/*dimension, dimension*/);
    }

}
