package presentacion.saldo;

import javax.swing.*;
import java.awt.*;

public class retiroWindow extends JFrame{
    private JButton limpiarButton;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JTextField textFieldSaldoCuenta;
    private JTextField textFieldMontoRetiro;
    private JTextField textFieldMontoDisponible;
    private JPanel principal;
    private JLabel montoRetirar;
    private JLabel montoDisponible;
    private JLabel saldoCuenta;

    public retiroWindow(){
        setTitle("Pantalla de retiro de dinero");
        ImageIcon imageIcon=new ImageIcon("src/imagenes/atm.png");
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

    public static void main(String[] args) {
        new retiroWindow();
    }

}
