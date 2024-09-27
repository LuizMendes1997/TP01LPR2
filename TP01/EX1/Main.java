package TP01.EX1;
//Luiz Carlos Mendes
//CB 313123
public class Main {
	public static void main(String[] args) {
		//Testando construtor
		Author autor = new Author("luiz", "luiz@gmail.com", 'm');
		//Verificando metodo ToString
		System.out.println(autor);
		
		//Testando SetEmaiil mudando email e testando gets que puxam os valores associados a eles.
		autor.setEmail("luizmendes13@gmail.com");
		System.out.println(autor);
		char genero = autor.getGender();
		System.out.println("meu genero é " + genero);
		String nome = autor.getName();
		String email = autor.getEmail();
		System.out.println(nome + " -- " + email);
	}
}
