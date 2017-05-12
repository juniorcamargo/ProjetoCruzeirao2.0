package service;

import java.util.List;

import dao.LocalDAO;
import model.Local;

public class LocalService {
	
	LocalDAO localDAO = new LocalDAO();

	public Local save(Local local){
		
		local = localDAO.salvar(local);
		localDAO.closeEntityManager();
		return local;
	}

	public List <Local> getLocals()
	{
		List <Local> list = (List<Local>) localDAO.pesquisarTodos();
		localDAO.closeEntityManager();
		return list;
	}
	public void update(Local local)
	{
		localDAO.salvar(local);
		localDAO.closeEntityManager();
	}
	public void remove(Local local)
	{
		localDAO.remover(local);
		localDAO.closeEntityManager();
	}
}
