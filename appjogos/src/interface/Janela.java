package inteface;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Janela extends JFrame {// vai herdar a classe usada em java teste
    public Janela() {//método contrutor
        this.setBounds(0,0,1920,1080);//método importado de jframe

        CardLayout controleTela = new CardLayout();//PAINEL DE telas, permitindo a troca de telas, mostra por padrão a primeira tela
        JPanel telas = new JPanel(controleTela);//objeto telas
        LoginPanel loginPanel = new LoginPanel(telas, this); //chama o método, utiliza o atributo telas para mostrar as telas
        PrincipalPanel principalPanel = new PrincipalPanel(telas, this); //chama o método, utiliza o atributo telas para mostrar as telas, atributo this para puxar o JFrame

        telas.add(loginPanel,"Tela Login");//adicionar as telas
        telas.add(principalPanel,"Tela Principal");//adicionar as telas, dar nome entre aspas

        this.add(telas);//para adicionar na tela, fazer testes com os paineis
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fechar a janela
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//mim=nimiza e maximiza a janela
        this.setUndecorated(true);//tira o cabecalho padrão
        this.setVisible(true); //método importado de jframe e sempre adicionar no final

        // essa janela vai ser a principal e o conteudo vai trocar dentro da janela como se ela fosse a tv e as outras janelas os canais, sendo chamados de painel
    }
}