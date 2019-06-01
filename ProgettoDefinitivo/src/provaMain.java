import javax.swing.*;
import java.awt.*;

public class provaMain {

    public provaMain(){

        JFrame frame = new JFrame();
        //frame.setBounds(50, 70, frameWidth, frameHeigth);
        //frame.setMinimumSize(new Dimension(frameWidth + 2, frameHeigth + 23));
        frame.setBounds(50,70, 300,200);

        Container c = frame.getContentPane();

        /*JButton btn = new JButton("Inizio simulazione");
        c.add(btn, BorderLayout.SOUTH);

        btn.addActionListener(e -> {
            System.exit(0);
        });*/


        String []lista=new String[10];
        for(int i=0;i<lista.length;i++)
            lista[i]="Lista1: Elemento numero "+i;
        JComboBox<String> cBox=new JComboBox<>(lista);
        c.add(cBox);
        String [] lista2=new String[10];
        for(int i=0;i<lista2.length;i++)
            lista2[i]="Lista 2: Elemento numero "+i;
        JComboBox<String> cBox2=new JComboBox<>(lista2);
        c.add(cBox2);


        c.add(cBox, BorderLayout.NORTH);
        c.add(cBox2, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new provaMain();
    }
}
