package br.com.ufc.model;

public class Estudante {
	
	public String nome;
	public String email;
	public boolean vaiPassarEmReuso;
	public Endereco endereco;
	
	public Estudante(String nome, String email, boolean vaiPassarEmReuso, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.vaiPassarEmReuso = vaiPassarEmReuso;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVaiPassarEmReuso() {
		return vaiPassarEmReuso;
	}
	public void setVaiPassarEmReuso(boolean vaiPassarEmReuso) {
		this.vaiPassarEmReuso = vaiPassarEmReuso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
