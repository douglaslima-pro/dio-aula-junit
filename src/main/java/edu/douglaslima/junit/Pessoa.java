package edu.douglaslima.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome;
	private String cpf;
	private LocalDate dataNascimento;

	public Pessoa(String nome, String cpf, LocalDate dataNascimento) throws IllegalArgumentException {
		if (!Cpf.validarCpf(cpf)) {
			throw new IllegalArgumentException("CPF inválido! CPF deve estar no formato xxx.xxx.xxx-xx!");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public void setCpf(String cpf) throws IllegalArgumentException {
		if (!Cpf.validarCpf(cpf)) {
			throw new IllegalArgumentException("CPF inválido! CPF deve estar no formato xxx.xxx.xxx-xx!");
		}
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDate.now());
	}

}
