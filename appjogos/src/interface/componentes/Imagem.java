package inteface.componentes;
// as imagens pegar no material icons windowns close minimise

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagem extends JLabel{//JLBAEL VAI SER IMAGEM
    public Imagem(String nome){//NOME DA IMAGEM
        super(); //método de criação do icone
        ImageIcon icone = new ImageIcon(Imagem.class.getResource("/imagens/close2.png"));//para adicionar uma imagem
        setIcon(icone);//carrega o icone
        repaint();//atualiza a imagem
    }
}
