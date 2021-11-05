package presentacion.login;

import javax.swing.*;
import java.awt.*;

public class loginWindow extends JFrame{
    private JTextField textFieldUsuario;
    private JButton cancelarButton;
    private JButton aceptarButton;
    private JPasswordField passwordField;
    private JPanel principal;
    private JLabel nombreUsuario;
    private JLabel password;
    public loginWindow(){
        setTitle("Pantalla de login");
        ImageIcon imageIcon=new ImageIcon("src/imagenes/login.png");
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
        new loginWindow();
    }
}
