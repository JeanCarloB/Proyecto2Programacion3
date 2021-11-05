package presentacion.cambio;


import javax.swing.*;
import java.awt.*;

public class cambioWindow extends JFrame {
    private JTextField textFieldContrasenaActual;
    private JTextField textFieldNuevaContrasena;
    private JTextField textFieldConfirmarContrasena;
    private JButton limpiarButton;
    private JButton aceptarButton;
    private JButton salirButton;
    private JLabel contrasenaActual;
    private JLabel confirmarContrasena;
    private JLabel nuevaContrasena;
    private JPanel principal;

    public cambioWindow(){
        setTitle("Cambio de clave");
        ImageIcon imageIcon=new ImageIcon("src/imagenes/user.png");
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
