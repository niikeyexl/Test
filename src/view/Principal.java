package view;

import controller.Opera��es;

public class Principal {
	
	public static void main(String[] args) {
		String frase = "Ola turma do terceiro semestre de ADS da Fatec ZL";
		Opera��es Op = new Opera��es();
		Op.stringCon();
		Op.bufferCon();
		Op.fraseDiv1(frase);
		Op.fraseDiv2(frase);
		String test = "isso � um teste";
	}

}
