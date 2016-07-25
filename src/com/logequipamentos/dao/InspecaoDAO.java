package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.Query;

public class InspecaoDAO extends GenericDAO<Integer, InspecaoDAO> {

	public InspecaoDAO() {
		super(InspecaoDAO.class);
	}

	public List<InspecaoDAO> listar() {
		String sql = "select i from Inspecao";
		Query query = super.getEntityManager().createQuery(sql);

		@SuppressWarnings("unchecked")
		List<InspecaoDAO> retorno = query.getResultList();
		return retorno;
	}

}
