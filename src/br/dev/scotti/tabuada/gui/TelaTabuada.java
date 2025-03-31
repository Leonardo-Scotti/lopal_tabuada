package br.dev.scotti.tabuada.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		JFrame tela = new JFrame();
		
		//Definir o tamanho da tela
		//através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 600);
		
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		
		//Criar um JLabel
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do Multiplicando:");
		labelMultiplicando.setBounds(50, 40, 140, 30);
		
		//Criar um JTextField
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(192, 40, 60, 30);
		
		//Menor Multiplicador
		JLabel labelMenorMultiplicador = new JLabel();
		labelMenorMultiplicador.setText("Valor do menor multiplicador:");
		labelMenorMultiplicador.setBounds(50, 72, 140, 30);
		
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMenorMultiplicador);
		tela.getContentPane().add(txtMultiplicando);

		tela.setVisible(true);
	}
	
}
