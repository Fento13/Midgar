import java.awt.EventQueue;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameExample {
    public static void main(String[] args) {
            final int MAX_WIDTH = 800;
            final int MAX_HEIGHT = 600;
            AtomicInteger contador = new AtomicInteger(0);

            EventQueue.invokeLater(() ->{
                    //Creamos la ventana
                    JFrame frame = new JFrame("Ejemplo Simple Frame");
                    //Definimos tamaño, cierre y visibilidad
                    frame.setSize(MAX_WIDTH, MAX_HEIGHT);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    //creamos un panel para organizar los componentes
                    JPanel panel = new JPanel();
                    //Creamos una etiqueta
                    JLabel label = new JLabel("Hola Mundo!");
                   
                    //creamos un boton
                    JButton boton = new JButton("Cambia Texto");
                   //añadimos un listener al boton
                    boton.addActionListener(e ->{
                        int nuevoValor = contador.incrementAndGet(); //suma 1 y devuelve el valor
                        label.setText("Has pulsado el boton " + nuevoValor + " veces");
                    }); 
                    
                    panel.add(label);
                    panel.add(boton);
                    frame.add(panel);

                    frame.setVisible(true);

            });
           
           
    }
    
}
