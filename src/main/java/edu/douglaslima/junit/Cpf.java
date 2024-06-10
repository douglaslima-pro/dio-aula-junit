package edu.douglaslima.junit;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Cpf {

	public static boolean validarCpf(String cpf) {
		Pattern cpfPadrao = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
		Matcher cpfMatcher = cpfPadrao.matcher(cpf);
		return cpfMatcher.matches();
	}
	
}