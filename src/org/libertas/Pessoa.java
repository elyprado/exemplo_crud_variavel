package org.libertas;

public class Pessoa {
	private String nome = "";
	private double peso;
	private double altura;
	private int idpessoa;
	
	public double getIMC() {
		return peso / (altura * altura);
	}
	
	public String getSituacao() {
		if (getIMC()<19) {
			return "abaixo do peso";
		} else if (getIMC() < 25) {
			return "peso normal";
		} else if (getIMC() < 30) {
			return "sobrepeso";
		} else {
			return "obeso";
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(int idpessoa) {
		this.idpessoa = idpessoa;
	}
	
	
	
}
