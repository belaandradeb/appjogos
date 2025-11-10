package interfaces;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel extends TelaPanel {

    public PrincipalPanel(JPanel telas, JFrame janela) {
        super(telas, janela);

        JLabel mensagem = new JLabel("Conteúdo do Principal Panel");
        JButton botaoVoltar = new JButton("Voltar");

        botaoVoltar.addActionListener(this);

        add(botaoVoltar);
        add(mensagem);
    }

    @Override
    public void executarBotao(ActionEvent e) {
        trocarTela("Tela Login");
    }
}
