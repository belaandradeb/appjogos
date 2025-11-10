package interfaces;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel extends TelaPanel {

    private JButton botaoLogin;

    public LoginPanel(JPanel telas, JFrame janela) {
        super(telas, janela);

        JLabel mensagem = new JLabel("Conteúdo do Login Panel");
        botaoLogin = new JButton("Fazer login");

        botaoLogin.addActionListener(this);

        add(mensagem);
        add(botaoLogin);
    }

    @Override
    public void executarBotao(ActionEvent e) {
        trocarTela("Tela Principal");
    }
}
