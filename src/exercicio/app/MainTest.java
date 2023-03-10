package exercicio.app;

import com.google.gson.Gson;

import exercicio.model.Data;

public class MainTest {

	public static void main(String[] args) {
		Data data = new Data(30,9,2000);
		
		boolean teste = data.getBissexto();
		
		if(teste) {
			System.out.println("é bissexto");
		}else {
			System.out.println("não é bissexto :(");
		}
		System.out.println(data.getMes());
		Gson conversor = new Gson(); 
		String s = conversor.toJson(data);
		System.out.println(s);
	}

}
