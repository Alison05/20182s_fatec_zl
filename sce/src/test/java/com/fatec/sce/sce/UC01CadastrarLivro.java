package com.fatec.sce.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.sce.model.Livro;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarLivroComISBN_em_branco(){
		//cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try{
			//acao
			livro.setIsbn("");
			fail ("deveria lançar uma exceção");
		}catch(RuntimeException e){
			//verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT02UC05CadastraLivro_com_isbn_invalido() {
		Livro livro = new Livro();
		try {
			livro.setIsbn(null);
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido!", e.getMessage());
		}
	}
	
}
