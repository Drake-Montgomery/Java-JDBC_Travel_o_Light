package model;

public class Pessoa {
	
	private String Nome;
	private String Sobrenome;
	private String Email;
	private String Senha;
	
	public Pessoa() {
	}
	
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getSobrenome() {
		return Sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String senha) {
		Senha = senha;
	}

}
