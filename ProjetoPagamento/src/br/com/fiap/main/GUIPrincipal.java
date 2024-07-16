package br.com.fiap.main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class GUIPrincipal extends JFrame {
	
	private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnFuncionario;
    private JMenuItem miSair, miFreelancer, miVendedor, miVigiaNoturno;
    
    public GUIPrincipal() {
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes() {
    	
    	//Primeiro grupo de códigos: Configuração da janela
    	
    	setTitle("Janela Principal"); // Serveria também: this.setTitle("Janela Principal");
        setBounds(0, 0, 600, 400); // (x, y, Largura, Altura) Define a posição e o tamanho
        contentPane = getContentPane(); // Carregando container e preaparando para recebr os paineis
    	
        
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo"); //Criando menu arquivo
        mnArquivo.setMnemonic('A'); //Acessar o Arquivo pela tecla "A"
        mnFuncionario = new JMenu("Funcionário"); //Instancia do objeto Funcionário
        mnFuncionario.setMnemonic('F');
        miSair = new JMenuItem("Sair", new ImageIcon(
                getClass().getResource("images/exit_icon.png"))); //Capturando a imagem
        miFreelancer = new JMenuItem("Freelancer");
        miVendedor = new JMenuItem("Vendedor");
        miVigiaNoturno = new JMenuItem("Vigia Noturno");
        
        
        setJMenuBar(mnBarra);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnFuncionario);
        mnArquivo.add(miSair);
        mnFuncionario.add(miFreelancer);
        mnFuncionario.add(miVendedor);
        mnFuncionario.add(miVigiaNoturno);
        
    }
    
    private void definirEventos() {
    	
    	miSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
    	
    	
    	
    	miFreelancer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUIFreelancer freela = new GUIFreelancer();
				
				contentPane.removeAll();
				contentPane.add(freela);	
				contentPane.validate();
			}
		});
    	
    	
    }

	public static void main(String[] args) {
		
		GUIPrincipal frame = new GUIPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2,
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);

	}

}
