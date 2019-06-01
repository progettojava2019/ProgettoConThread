package Utility;

import Grafica.MyFrame;

public final class Data {

        /*  Istanzio il frame in cui disegnare l'evoluzione della popolazione  */
        public final static MyFrame frame = new MyFrame("Sviluppo popolazione");

        public static final int frameWidth = 1200;
        public static final int frameHeigth = 600;

        public final static int squareDimension = 10; //dimensioni del singolo quadratino della grglia
        public final static int numSquareWidth = frameWidth/squareDimension; //Numero di quadrati per lato
        public final static int numSquareHeight = frameHeigth/squareDimension;




        public final static int numSquare = frameWidth/squareDimension; //Numero di quadrati per lato


        public static int valMinimoControllato = (numSquare-1)*squareDimension/3; // = 30;
        public static int valMassimoControllato = (numSquare-1)*squareDimension*2/3;// = 60;



        /*  Inzializzo le matrice di Maschi, Femmine e Figli  */

        public final static Matrice matriceMaschi = new Matrice(numSquare*numSquare, 2);

        public final static Matrice matriceFemmine = new Matrice(numSquare*numSquare, 2);

        public final static Matrice matriceFigli = new Matrice(numSquare*numSquare, 2);




}
