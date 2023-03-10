package br.com.fiap.app;

import br.com.fiap.model.Data;

public class MainTest {

	public static void main(String[] args) {
		Data data = new Data(31,10,2000);
		
		boolean teste = data.getBissexto();
		
		if(teste) {
			System.out.println("é bissexto");
		}else {
			System.out.println("não é bissexto :(");
		}

	}

}
