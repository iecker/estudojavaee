package br.com.casadocodigo.controller;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.casadocodigo.dao.LivroDAO;
import br.com.casadocodigo.model.Livro;

@Named
@RequestScoped
public class AdminLivros {

	private Livro livro= new Livro();
	
	@Inject
	private LivroDAO livroDao;
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public void salvar() {
		System.out.println("Livro salvo com sucesso: "+ livro);
		livroDao.salvar(livro);
	}
}
