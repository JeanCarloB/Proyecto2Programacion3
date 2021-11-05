package presentacion.principal;

import javax.swing.*;
import java.awt.*;

public class principalWindow extends JFrame{
    private JButton hacerRetiroButton;
    private JButton salirButton;
    private JButton cambioClaveButton;
    private JPanel principal;

    public principalWindow(){
        setTitle("Ventana principal");
        ImageIcon imageIcon=new ImageIcon("src/imagenes/home.png");
        setIconImage(imageIcon.getImage());
        setSize(400,300);
        initComponents(getContentPane());
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents(Container contentPane) {
        contentPane.add(principal);
    }

}
