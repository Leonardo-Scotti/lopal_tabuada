package br.dev.scotti.tabuada.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel labelMenorMultiplicador;
	private JTextField txtMenorMultiplicador;
	private JLabel labelMaiorMultiplicador;
	private JTextField txtMaiorMultiplicador;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JLabel labelResultado;
	private JScrollPane scrollTabuada;
	private JList listaTabuada;

	public void criarTela() {

		JFrame tela = new JFrame();

		// Definir o tamanho da tela
		// através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(330, 600);

		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(50, 40, 150, 30);

		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(210, 40, 60, 30);

		// Mín. Multiplicador
		labelMenorMultiplicador = new JLabel();
		labelMenorMultiplicador.setText("Mín. Multiplicador:");
		labelMenorMultiplicador.setBounds(50, 80, 150, 30);

		txtMenorMultiplicador = new JTextField();
		txtMenorMultiplicador.setBounds(210, 80, 60, 30);

		// Máx. Multiplicador
		labelMaiorMultiplicador = new JLabel();
		labelMaiorMultiplicador.setText("Máx. Multiplicador:");
		labelMaiorMultiplicador.setBounds(50, 120, 150, 30);

		txtMaiorMultiplicador = new JTextField();
		txtMaiorMultiplicador.setBounds(210, 120, 60, 30);

		// Botão Calcular
		btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(50, 160, 105, 30);

		// Botão Limpar
		btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(165, 160, 105, 30);

		// Resultado
		labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(50, 200, 150, 30);

		// Lista Tabuada
		listaTabuada = new JList();

		// Painel Tabuada
		scrollTabuada = new JScrollPane(listaTabuada);
		scrollTabuada.setBounds(50, 240, 220, 280);

		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMenorMultiplicador);
		tela.getContentPane().add(txtMenorMultiplicador);
		tela.getContentPane().add(labelMaiorMultiplicador);
		tela.getContentPane().add(txtMaiorMultiplicador);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(scrollTabuada);

		//Adicionar um ouvinte de ação (Listener) ao botão calcular
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// Tornar a tela visível deverá ser a última linha deste método.
		tela.setVisible(true);
	}

}
