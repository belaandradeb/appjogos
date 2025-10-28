package inteface;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel extends TelaPanel{

    public PrincipalPanel(JPanel telas, JFrame janela){//jpanel telas para ser exibido na trca de telas
        super(telas, janela);
        JLabel mensagem = new JLabel(" Conteúdo do principal Panel");//CRIA A MENSAGEM
        JButton botao = new JButton("voltar"); //CRIA UM BOTÃO
        botao.addActionListener(this);//chama o método override

        this.add(botao);
        this.add(mensagem);//ADICIONA A MENSAGEM NA TELA
    }

    public void executarBotao(ActionEvent e){
        trocarTela("Tela Login");
    }
}