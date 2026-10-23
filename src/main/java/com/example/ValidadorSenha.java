package com.example;


public class ValidadorSenha {

	
	public static boolean validar(String s) {
		if(s == null || s.length() < 8) return false;
		boolean digito = s.chars().anyMatch(Character::isDigit);
		boolean maiuscula = s.chars().anyMatch(Character::isUpperCase);
		boolean minuscula = s.chars().anyMatch(Character::isLowerCase);
		return digito && maiuscula && minuscula;
	}
	
}