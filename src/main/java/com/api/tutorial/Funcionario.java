package com.api.tutorial;

public class Funcionario {

	private int Id;
	
	private String cpf;

	public Funcionario() {}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Funcionario [Id=" + Id + ", cpf=" + cpf + "]";
	}
	
	
}
