package interfaces;

import interfaces.componentes.Imagem;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.w3c.dom.events.MouseEvent;

public class TelaPanel extends JPanel implements ActionListener {//extendendo JPanel e implementando a ActionListener
        private JPanel telas;//atributo
        private  CardLayout controleTela; //atributo
        private JFrame janelas; //atributo

    public TelaPanel (JPanel telas, JFrame janela){//método contrutor
        this.telas = telas;
        this.controleTela =(CardLayout) telas.getLayout();// converte o telas para cardlayout e adiciona o metodo de trocar telas quando apertar o botão
        this. janelas = janelas; //adiciona as janelas
        this.setBackground(Color.decode("#202028"));//adiciona cor de fundo nas telas

        Imagem botaoFechar = new Imagem("");//cria a imagem

        botaoFechar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("Clicou");
            }
        });// método para mudar a imagem com o click

        this.add(botaoFechar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        executarBotao(e);
    }

    protected void executarBotao(ActionEvent e){

    }

    protected  void trocarTela(String identificador){//metodo para trocar tela
        controleTela.show(telas, identificador);//metodo para trocar de tela quando clicar, nome das telas é o identificador
    }
}