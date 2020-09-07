package view;

import controller.Operações;

public class Principal {
	
	public static void main(String[] args) {
		String frase = "Ola turma do terceiro semestre de ADS da Fatec ZL";
		Operações Op = new Operações();
		Op.stringCon();
		Op.bufferCon();
		Op.fraseDiv1(frase);
		Op.fraseDiv2(frase);
	}

}
