package br.com.ufc.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.ufc.model.Endereco;
import br.com.ufc.model.Estudante;

public class Teste {

	public static void main(String[] args) {
		Endereco rua = new Endereco("João Aprigio", "Quixadá", "Brasil");
		
		Estudante jackson = new Estudante("Jackson Maia","jacksonmaia@gmail.com",true, rua);
		Estudante pereira = new Estudante("Antonio Pereira","pereiraneto@gmail.com",false, rua);
		Estudante yuri = new Estudante("Yuri Cavalcante","yuricavalcante@gmail.com",true, rua);
		Estudante jordao = new Estudante("Jordão Sousa","jordaosousa@gmail.com",false, rua);
		
		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(pereira);
		estudantes.add(jackson);
		estudantes.add(yuri);
		estudantes.add(jordao);
		
		//Objeto for json;
		Gson gson = new Gson();
		String jsonObjeto = "";
		for (Estudante e : estudantes) {
			jsonObjeto += gson.toJson(e) + "\n";
		}
						
		System.out.println(jsonObjeto);
		
		File file = new File("/home/antoniorrm/Dropbox/UFC/Reuso/praticaGson/json.json");
		
		System.out.println(file.exists());
		
	}
}
