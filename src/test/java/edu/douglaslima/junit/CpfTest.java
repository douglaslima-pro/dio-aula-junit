package edu.douglaslima.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CpfTest {

	@DisplayName("Teste que valida se o método estático Cpf.validarCpf retorna true quando o argumento é um cpf válido.")
	@Order(1)
	@Test
	void validarCpfPadrao() {
		Assertions.assertTrue(Cpf.validarCpf("123.456.789-00"));
	}

	@Order(2)
	@Test
	void validarCpfComApenasNumeros() {
		Assertions.assertFalse(Cpf.validarCpf("12345678900"));
	}

	@Order(3)
	@Test
	void validarCpfComLetra() {
		Assertions.assertFalse(Cpf.validarCpf("a123.456.789-00"));
	}

	@Order(4)
	@Test
	void validarCpfComSimboloInvalido() {
		Assertions.assertFalse(Cpf.validarCpf("123.456.789.00"));
	}

}