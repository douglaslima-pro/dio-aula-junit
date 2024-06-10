package edu.douglaslima.junit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDate;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PessoaTest {

	@DisplayName("Teste que valida se a criação de um objeto do tipo Pessoa não está lançando uma exceção quando o argumento é um CPF válido.")
	@Order(1)
	@Test
	void validarCriacaoDePessoaComCpfValido() {
		assertDoesNotThrow(() -> {
			new Pessoa("Douglas", "123.456.789-00", LocalDate.of(2000, 1, 1));
		});
	}

	@DisplayName("Teste que valida se o método Pessoa.getIdade() está retornando um valor correto.")
	@Order(2)
	@Test
	void validarIdade() {
		Pessoa joao = new Pessoa("Joao", "123.456.789-00", LocalDate.of(2004, 6, 10));
		assertEquals(20, joao.getIdade());
		Pessoa ana = new Pessoa("Ana", "123.456.789-00", LocalDate.of(1999, 1, 1));
		assertEquals(25, ana.getIdade());
	}

}
