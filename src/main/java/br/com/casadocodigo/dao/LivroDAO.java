package br.com.casadocodigo.dao;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.casadocodigo.model.Livro;
import org.hibernate.SessionFactory;

public class LivroDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Resource
	private SessionContext sessionContext;
	
	
	
	public void salvar(Livro livro) {
		/*manager.getTransaction().begin();
		manager.persist(livro);
		manager.flush();
		manager.getTransaction().commit();*/
		//UserTransaction userTr= sessionContext.getUserTransaction();
		

	
	}

}
