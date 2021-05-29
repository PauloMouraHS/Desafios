package br.com.web.util;

import java.util.Random;

public class Parametros {

	static Random aleatorio = new Random();
	static int valor = aleatorio.nextInt(100000);

	
	public static String criarNomeUsuario = "Newnovo" + valor;
	public static String criarSenha = "Senha" + valor;
	public static String criarEmail = "emailparateste" + valor + "@gmail.com";
	public static String usuarioCadastrado = "Usuarioteste1";
	public static String senhaCadastrada = "Senha1";
	public static String emailCadastrado = "emailteste1@gmail.com";
	public static String criarPrimeiroNome = "Nome" + valor;
	public static String criarSobrenome = "Sobrenome" + valor;
	public static String criarTelefone = "11123456789";
	public static String criarCidade = "Cidade";
	public static String criarEndereco = "Rua Avenida, 10";
	public static String criarEstado = "SP";
	public static String criarCep = "12345-678";
	
}