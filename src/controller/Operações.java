package controller;

import com.sun.javafx.runtime.SystemProperties;

public class Operações {
	public Operações() {
		super();
	}
	//Fazendo um string sem buffer
	public void stringCon() {
		String cadeia = "a";
		double tempoInicial = System.nanoTime();
		double tempoFinal;
		double tempoTotal;
		for (int i = 0; i < 32768; i++) {
			cadeia = cadeia + "b";
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Sem buffer = " + tempoTotal);
	}
	//Fazendo um string com buffer
	public void bufferCon() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		double tempoFinal;
		double tempoTotal;
		for (int i = 0; i < 32768; i++) {
			buffer.append("a");
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Sem buffer = " + tempoTotal);
	}
	//Dividir frases com lenght	
	public void fraseDiv1(String frase) {
		String[] vetorPalavras = frase.split(" ");
		int tamanho = vetorPalavras.length;
		for (int i = 0; i < tamanho; i++) {
			System.out.println(vetorPalavras[i]);
		}
	}
	//Dividir frases com for each
	public void fraseDiv2(String frase) {
		String[] vetorPalavras = frase.split(" ");
		for (String palavra : vetorPalavras) {
			System.out.println(palavra);
		}
	}
}
