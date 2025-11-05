package interfaces;

import interfaces.componentes.Imagem;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPanel extends JPanel implements ActionListener {
    private JPanel telas;
    private CardLayout controleTela;
    private JFrame janela;

    public TelaPanel(JPanel telas, JFrame janela) {
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();
        this.janela = janela;
        setBackground(Color.decode("#202028"));

        Imagem botaoFechar = new Imagem("close2.png");
        botaoFechar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicou no botão fechar!");
                janela.dispose(); // Fecha a janela
            }
        });
        add(botaoFechar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        executarBotao(e);
    }

    protected void executarBotao(ActionEvent e) {}

    protected void trocarTela(String identificador) {
        controleTela.show(telas, identificador);
    }
}
