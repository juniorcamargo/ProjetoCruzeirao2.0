package dao;

import model.Local;

public class LocalDAO extends GenericDAO<Local> {

	@Override
	protected Class<Local> getClasseEntidade() {
		return Local.class;
	}

}
