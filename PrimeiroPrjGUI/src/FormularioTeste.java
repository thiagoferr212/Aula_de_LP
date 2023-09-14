import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;

public class FormularioTeste extends JFrame {

    //Atributos
    private JPanel painel = new JPanel();
    private JButton Botao = new JButton("Limpar");
    private JTextField CaixaDeTexto= new JTextField("Teste", 20);
    private JLabel Mensagem = new JLabel("Exemplo Simples de Janela");

    //Construtor
    public FormularioTeste() {
        this.setTitle("Texto da Barra de Titulo");
        this.setSize(300, 200);
        painel.setLayout(new FlowLayout (FlowLayout.CENTER, 40, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(CaixaDeTexto);
        painel.add(Botao);
        painel.add(Mensagem);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela

    }
    public static void main(String[] args) {
        new FormularioTeste();
    }
}