package Grafica;

import Utility.Data;

import javax.swing.*;
import java.awt.*;

import static Utility.Data.*;

public class MyFrame extends JFrame {

    public MyFrame(String titolo) {
        super(titolo);
        this.dispose();
        this.setBounds(50, 70, frameWidth, frameHeigth);
        this.setMinimumSize(new Dimension(frameWidth + 2, frameHeigth + 23));
    }

}
