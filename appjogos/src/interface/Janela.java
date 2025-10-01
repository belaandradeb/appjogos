package interface;
import javax.swing.JFrame;

public class Janela extends JFrame {
    public Janela(){
        this.setBounds(0,0,1920,1080);
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        PrincipalPanel PrincipalPanal = new PrincipalPanel(telas, this);
    }
}
