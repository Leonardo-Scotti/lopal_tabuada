package br.dev.scotti.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double menorMultiplicador;
	private double maiorMultiplicador;

	// setters and getters
	// Multiplicando
	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	// MenorMultiplicador
	public double getMenorMultiplicador() {
		return menorMultiplicador;
	}

	public void setMenorMultiplicador(double menorMultiplicador) {
		this.menorMultiplicador = menorMultiplicador;
	}

	// MaiorMultiplicador
	public double getMaiorMultiplicador() {
		return maiorMultiplicador;
	}

	public void setMaiorMultiplicador(double maiorMultiplicador) {
		this.maiorMultiplicador = maiorMultiplicador;
	}

	public String[] exibirTabuada() {

		if (menorMultiplicador > maiorMultiplicador) {
			double auxiliar = maiorMultiplicador;
			maiorMultiplicador = menorMultiplicador;
			menorMultiplicador = auxiliar;
		}

		int tamanhoVetor = (int) ((maiorMultiplicador - menorMultiplicador) + 1);

		String tabuada[] = new String[tamanhoVetor];

		int i = 0;
		while (menorMultiplicador <= maiorMultiplicador) {
			double produto = multiplicando * menorMultiplicador;
			tabuada[i] = multiplicando + " X " + menorMultiplicador + " = " + produto;
			menorMultiplicador++;
			i++;
		}
		
		return tabuada;
	}

}
