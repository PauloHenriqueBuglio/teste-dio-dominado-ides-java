/**
 * 
 */
package com.dio;

import com.dio.pacote2.gato;

/**
 * @author Paulo H
 *
 */
public class pacote_teste1 {

	public static void main(String[] args) {
		
		gato Gato = new gato();
		Livros livros = new Livros();
		
		System.out.println(Gato);
		System.out.println(livros);
		/*int a = 2;
		int b = 10;		
		System.out.println("Boa Noite!" + (a+b));*/
	}

}


class Livros {
	
	private String nome;
	private String npag;
}
