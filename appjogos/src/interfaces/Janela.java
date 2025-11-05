package interfaces;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
    public Janela() {
        setBounds(0, 0, 1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);

        LoginPanel loginPanel = new LoginPanel(telas, this);
        PrincipalPanel principalPanel = new PrincipalPanel(telas, this);

        telas.add(loginPanel, "Tela Login");
        telas.add(principalPanel, "Tela Principal");

        add(telas);
        setVisible(true);
    }
}
