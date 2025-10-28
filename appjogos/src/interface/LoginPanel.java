package interface;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel extends TelaPanel{// extende a TelaPanel
    private JButton botaoLogin;//método JButton
    public LoginPanel(JPanel telas, JFrame janela) { //metodo contrutor
        super(telas,janela);
        JLabel mensagem = new JLabel("Conteúdo do Login Panel");//CRIA UMA MENSAGEM

        JButton botao = new JButton("Fazer login"); //CRIA UM BOTÃO
        botao.addActionListener(this);//chama o método override

        this.add(mensagem);//ADICIONA A MENSAGEM NA TELA
        this.add(botao);// ADICIONA O BOTÃO NA TELA
        //this.add(imagem);//adiciona imagem
    }

    public void executarBotao(ActionEvent e){
        trocarTela("Tela Principal");
    }
}